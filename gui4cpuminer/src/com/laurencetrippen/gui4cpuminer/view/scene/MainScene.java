package com.laurencetrippen.gui4cpuminer.view.scene;

import com.laurencetrippen.gui4cpuminer.model.MiningConfiguration;
import com.laurencetrippen.gui4cpuminer.model.Resources;
import com.laurencetrippen.gui4cpuminer.view.node.Sidebar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MainScene extends AbstractScene {

	private MiningConfiguration miningConfiguration;
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
	private TextField maxThreadsTextField;
	private TextField timeoutTextField;
	private TextField maxRetriesTextField;
	private TextField retryPauseTextField;
	private TextField scanTimeTextField;
	private TextArea consoleTextArea;
	private ComboBox<String> algorithmComboBox;
	private CheckBox longPollCheckBox;
	private CheckBox getworkCheckBox;
	private CheckBox gbtCheckBox;
	private CheckBox stratumCheckBox;
	private CheckBox redirectCheckBox;
	private CheckBox quietCheckBox;
	private CheckBox debugCheckBox;
	private CheckBox protocolDumbCheckBox;
	private CheckBox syslogCheckBox;
	private CheckBox runInBackgroundCheckBox;
	private CheckBox benchmarkCheckBox;
	private PasswordField passwordField;
	
	public MainScene() {
		super(new AnchorPane(), 1024, 768);
		this.miningConfiguration = new MiningConfiguration();
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
		this.consoleTextArea = new TextArea();
		this.usernameTextField = new TextField();
		this.urlTextField = new TextField();
		this.coinbaseAddressField = new TextField();
		this.coinbaseSignatureField = new TextField();
		this.jsonPathTextfield = new TextField();
		this.maxThreadsTextField = new TextField();
		this.timeoutTextField = new TextField();
		this.maxRetriesTextField = new TextField();
		this.retryPauseTextField = new TextField();
		this.scanTimeTextField = new TextField();
		this.algorithmComboBox = new ComboBox<>();
		this.passwordField = new PasswordField();
		this.longPollCheckBox = new CheckBox("Long poll");
		this.getworkCheckBox = new CheckBox("Enable getwork");
		this.gbtCheckBox = new CheckBox("Enable GBT");
		this.stratumCheckBox = new CheckBox("Enable Stratum");
		this.redirectCheckBox = new CheckBox("Enable Redirect");
		this.quietCheckBox = new CheckBox("is quiet");
		this.debugCheckBox = new CheckBox("is debug");
		this.protocolDumbCheckBox = new CheckBox("Enable Protocol Dumb");
		this.syslogCheckBox = new CheckBox("Enable Syslog");
		this.runInBackgroundCheckBox = new CheckBox("Run in background");
		this.benchmarkCheckBox = new CheckBox("Run as benchmark");
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
		this.coinbaseAddressField.setPromptText("Coinbase address");
		this.coinbaseAddressField.setPrefWidth(325);
		this.coinbaseAddressField.setLayoutX(60);
		this.coinbaseAddressField.setLayoutY(210);
		
		this.coinbaseSignatureField.getStyleClass().add("ui-textfield");
		this.coinbaseSignatureField.setPromptText("Coinbase signature");
		this.coinbaseSignatureField.setPrefWidth(325);
		this.coinbaseSignatureField.setLayoutX(395);
		this.coinbaseSignatureField.setLayoutY(210);
		
		this.jsonPathTextfield.getStyleClass().add("ui-textfield");
		this.jsonPathTextfield.setPromptText("JSON configuration path");
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
		
		this.maxThreadsTextField.getStyleClass().add("ui-textfield");
		this.maxThreadsTextField.setPrefWidth(160);
		this.maxThreadsTextField.setLayoutX(60);
		this.maxThreadsTextField.setLayoutY(330);
		this.maxThreadsTextField.setPromptText("Max. threads");
		
		this.timeoutTextField.getStyleClass().add("ui-textfield");
		this.timeoutTextField.setPrefWidth(160);
		this.timeoutTextField.setLayoutX(230);
		this.timeoutTextField.setLayoutY(330);
		this.timeoutTextField.setPromptText("Timeout");
		
		this.maxRetriesTextField.getStyleClass().add("ui-textfield");
		this.maxRetriesTextField.setPrefWidth(160);
		this.maxRetriesTextField.setLayoutX(400);
		this.maxRetriesTextField.setLayoutY(330);
		this.maxRetriesTextField.setPromptText("Max. retries");
		
		this.retryPauseTextField.getStyleClass().add("ui-textfield");
		this.retryPauseTextField.setPrefWidth(160);
		this.retryPauseTextField.setLayoutX(570);
		this.retryPauseTextField.setLayoutY(330);
		this.retryPauseTextField.setPromptText("Retry pause");
		
		this.scanTimeTextField.getStyleClass().add("ui-textfield");
		this.scanTimeTextField.setPrefWidth(220);
		this.scanTimeTextField.setLayoutX(60);
		this.scanTimeTextField.setLayoutY(390);
		this.scanTimeTextField.setPromptText("Scantime");
		
		this.longPollCheckBox.setLayoutX(60);
		this.longPollCheckBox.setLayoutY(500);
		
		this.getworkCheckBox.setLayoutX(160);
		this.getworkCheckBox.setLayoutY(500);
		
		this.gbtCheckBox.setLayoutX(290);
		this.gbtCheckBox.setLayoutY(500);
		
		this.stratumCheckBox.setLayoutX(400);
		this.stratumCheckBox.setLayoutY(500);
		
		this.redirectCheckBox.setLayoutX(530);
		this.redirectCheckBox.setLayoutY(500);
		
		this.quietCheckBox.setLayoutX(60);
		this.quietCheckBox.setLayoutY(550);
		
		this.debugCheckBox.setLayoutX(160);
		this.debugCheckBox.setLayoutY(550);
		
		this.protocolDumbCheckBox.setLayoutX(260);
		this.protocolDumbCheckBox.setLayoutY(550);
		
		this.syslogCheckBox.setLayoutX(440);
		this.syslogCheckBox.setLayoutY(550);
		
		this.runInBackgroundCheckBox.setLayoutX(60);
		this.runInBackgroundCheckBox.setLayoutY(600);
		
		this.benchmarkCheckBox.setLayoutX(230);
		this.benchmarkCheckBox.setLayoutY(600);
		
		this.consoleTextArea.setLayoutX(270);
		this.consoleTextArea.setLayoutY(180);
		this.consoleTextArea.setPrefSize(694, 500);
		this.consoleTextArea.setEditable(false);
		
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

		this.algorithmComboBox.setLayoutX(764);
		this.algorithmComboBox.setLayoutY(60);
		this.algorithmComboBox.setPrefSize(200, 40);
		this.algorithmComboBox.setPromptText("Algoritm");
		this.algorithmComboBox.setItems(FXCollections.observableArrayList(miningConfiguration.getAlgorithms()));
		
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
		configPanesNodes.add(maxThreadsTextField);
		configPanesNodes.add(timeoutTextField);
		configPanesNodes.add(maxRetriesTextField);
		configPanesNodes.add(retryPauseTextField);
		configPanesNodes.add(scanTimeTextField);
		configPanesNodes.add(longPollCheckBox);
		configPanesNodes.add(getworkCheckBox);
		configPanesNodes.add(gbtCheckBox);
		configPanesNodes.add(stratumCheckBox);
		configPanesNodes.add(redirectCheckBox);
		configPanesNodes.add(quietCheckBox);
		configPanesNodes.add(debugCheckBox);
		configPanesNodes.add(protocolDumbCheckBox);
		configPanesNodes.add(syslogCheckBox);
		configPanesNodes.add(runInBackgroundCheckBox);
		configPanesNodes.add(benchmarkCheckBox);
		
		ObservableList<Node> rootNodes = root.getChildren();
		rootNodes.add(startButton);
		rootNodes.add(stopButton);
		rootNodes.add(consoleTextArea);
		rootNodes.add(algorithmComboBox);
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