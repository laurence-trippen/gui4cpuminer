package com.laurencetrippen.gui4cpuminer.view.scene;

import com.laurencetrippen.gui4cpuminer.model.Resources;
import com.laurencetrippen.gui4cpuminer.view.node.Sidebar;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class MainScene extends AbstractScene {

	private AnchorPane root;
	private ScrollPane configPane;
	private Button startButton;
	private Button stopButton;
	private Button saveButton;
	private Sidebar sidebar;
	private TextArea consoleTextArea;
	private ScrollPane scrollPane;
	private GridPane gridPane;
	
	public MainScene() {
		super(new AnchorPane(), 1024, 768);
		this.initScene();
		this.defineScene();
	}

	@Override
	protected void initScene() {
		this.root = (AnchorPane) this.getRoot();
		this.configPane = new ScrollPane();
		this.startButton = new Button("Start Mining");
		this.stopButton = new Button("Stop Mining");
		this.saveButton = new Button("Save");
		this.sidebar = new Sidebar(configPane);
		this.consoleTextArea = new TextArea();
		this.scrollPane = new ScrollPane();
		this.gridPane = new GridPane();
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
		
		this.configPane.setLayoutX(-624);
		this.configPane.setPrefWidth(824);
		this.configPane.setPrefHeight(768);
		this.configPane.getStyleClass().add("ui-config-pane");
		
		ObservableList<Node> rootNodes = root.getChildren();
		rootNodes.add(startButton);
		rootNodes.add(stopButton);
		rootNodes.add(consoleTextArea);
		rootNodes.add(configPane);
		rootNodes.add(sidebar);
	}
	
	public void consoleLog(String line) {
		this.consoleTextArea.appendText(line);
	}

	private void onStartButtonClick(ActionEvent event) {

	}
	
	private void onStopButtonClick(ActionEvent event) {
		
	}
	
	private void onSaveButtonClick(ActionEvent event) {

	}
}