package com.laurencetrippen.gui4cpuminer.view.scene;

import com.laurencetrippen.gui4cpuminer.model.Resources;
import com.laurencetrippen.gui4cpuminer.view.node.Sidebar;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MainScene extends AbstractScene {

	private AnchorPane root;
	private AnchorPane configPane;
	private Button startButton;
	private Button stopButton;
	private Button saveButton;
	private Button defaultButton;
	private Button selectButton;
	private Sidebar sidebar;
	private TextField usernameTextField;
	private TextField urlTextField;
	private TextField coinbaseAddressField;
	private TextField coinbaseSignatureField;
	private TextField jsonPathTextfield;
	private PasswordField passwordField;
	
	public MainScene() {
		super(new AnchorPane(), 1024, 768);
		this.initScene();
		this.defineScene();
	}

	@Override
	protected void initScene() {
		this.root = (AnchorPane) this.getRoot();
		this.configPane = new AnchorPane();
		this.startButton = new Button("Start Mining");
		this.stopButton = new Button("Stop Mining");
		this.saveButton = new Button("Save");
		this.selectButton = new Button("...");
		this.defaultButton = new Button("Default Settings");
		this.sidebar = new Sidebar(configPane);
		this.usernameTextField = new TextField();
		this.urlTextField = new TextField();
		this.coinbaseAddressField = new TextField();
		this.coinbaseSignatureField = new TextField();
		this.jsonPathTextfield = new TextField();
		this.passwordField = new PasswordField();
	}

	@Override
	protected void defineScene() {
		this.getStylesheets().add(getClass().getResource(Resources.CSS).toExternalForm());
		
		this.saveButton.setPrefWidth(180);
		this.saveButton.setPrefHeight(40);	
		this.saveButton.setOnAction(this::onSaveButtonClick);
		this.saveButton.getStyleClass().add("ui-button");
		this.saveButton.setLayoutX(60);
		this.saveButton.setLayoutY(60);
		
		this.defaultButton.setPrefWidth(180);
		this.defaultButton.setPrefHeight(40);	
		this.defaultButton.setOnAction(this::onDefaultButtonClick);
		this.defaultButton.getStyleClass().add("ui-button");
		this.defaultButton.setLayoutX(250);
		this.defaultButton.setLayoutY(60);
		
		this.usernameTextField.getStyleClass().add("ui-textfield");
		this.usernameTextField.setPromptText("Username");
		this.usernameTextField.setPrefWidth(200);
		this.usernameTextField.setLayoutX(60);
		this.usernameTextField.setLayoutY(150);
		
		this.passwordField.getStyleClass().add("ui-textfield");
		this.passwordField.setPromptText("Password");
		this.passwordField.setPrefWidth(200);
		this.passwordField.setLayoutX(270);
		this.passwordField.setLayoutY(150);
		
		this.urlTextField.getStyleClass().add("ui-textfield");
		this.urlTextField.setPromptText("URL");
		this.urlTextField.setPrefWidth(240);
		this.urlTextField.setLayoutX(480);
		this.urlTextField.setLayoutY(150);
		
		this.coinbaseAddressField.getStyleClass().add("ui-textfield");
		this.coinbaseAddressField.setPromptText("Coinbase Address");
		this.coinbaseAddressField.setPrefWidth(325);
		this.coinbaseAddressField.setLayoutX(60);
		this.coinbaseAddressField.setLayoutY(210);
		
		this.coinbaseSignatureField.getStyleClass().add("ui-textfield");
		this.coinbaseSignatureField.setPromptText("Coinbase Signature");
		this.coinbaseSignatureField.setPrefWidth(325);
		this.coinbaseSignatureField.setLayoutX(395);
		this.coinbaseSignatureField.setLayoutY(210);
		
		this.jsonPathTextfield.getStyleClass().add("ui-textfield");
		this.jsonPathTextfield.setPromptText("JSON Configuration Path");
		this.jsonPathTextfield.setEditable(false);
		this.jsonPathTextfield.setPrefWidth(500);
		this.jsonPathTextfield.setLayoutX(60);
		this.jsonPathTextfield.setLayoutY(270);
		
		this.selectButton.getStyleClass().add("ui-button");
		this.selectButton.setPrefWidth(140);
		this.selectButton.setPrefHeight(35);
		this.selectButton.setLayoutX(580);
		this.selectButton.setLayoutY(270);
		this.selectButton.setOnAction(this::onSelectButtonClick);
		
		this.startButton.setPrefWidth(200);
		this.startButton.setPrefHeight(40);
		this.startButton.setLayoutX(270);
		this.startButton.setLayoutY(60);
		this.startButton.setOnAction(this::onStartButtonClick);
		this.startButton.getStyleClass().add("ui-button");
		
		this.stopButton.setDisable(true);
		this.stopButton.setPrefWidth(200);
		this.stopButton.setPrefHeight(40);
		this.stopButton.setLayoutX(480);
		this.stopButton.setLayoutY(60);
		this.stopButton.setOnAction(this::onStopButtonClick);
		this.stopButton.getStyleClass().add("ui-button");

		this.configPane.setLayoutX(-624);
		this.configPane.setPrefWidth(824);
		this.configPane.setPrefHeight(768);
		this.configPane.getStyleClass().add("ui-config-pane");
		
		ObservableList<Node> configPanesNodes = this.configPane.getChildren();
		configPanesNodes.add(saveButton);
		configPanesNodes.add(defaultButton);
		configPanesNodes.add(usernameTextField);
		configPanesNodes.add(passwordField);
		configPanesNodes.add(urlTextField);
		configPanesNodes.add(coinbaseAddressField);
		configPanesNodes.add(coinbaseSignatureField);
		configPanesNodes.add(jsonPathTextfield);
		configPanesNodes.add(selectButton);
		
		ObservableList<Node> rootNodes = root.getChildren();
		rootNodes.add(startButton);
		rootNodes.add(stopButton);
		rootNodes.add(configPane);
		rootNodes.add(sidebar);
	}
	
	
	private void onStartButtonClick(ActionEvent event) {
		
	}
	
	private void onStopButtonClick(ActionEvent event) {
		
	}
	
	private void onSaveButtonClick(ActionEvent event) {
		
	}
	
	private void onDefaultButtonClick(ActionEvent event) {
		
	}
	
	private void onSelectButtonClick(ActionEvent event) {
		
	}
}