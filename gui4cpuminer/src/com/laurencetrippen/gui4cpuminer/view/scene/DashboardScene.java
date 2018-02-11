package com.laurencetrippen.gui4cpuminer.view.scene;

import com.laurencetrippen.gui4cpuminer.model.Resources;
import com.laurencetrippen.gui4cpuminer.view.node.Sidebar;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class DashboardScene extends AbstractScene {

	private AnchorPane root;
	private Button startButton;
	private Button stopButton;
	private Button settingsButton;
	private Sidebar sidebar;
	
	public DashboardScene() {
		super(new AnchorPane(), 1024, 768);
		this.initScene();
		this.defineScene();
	}

	@Override
	protected void initScene() {
		this.root = (AnchorPane) this.getRoot();
		this.startButton = new Button("Start Mining");
		this.stopButton = new Button("Stop Mining");
		this.settingsButton = new Button("Settings");
		this.sidebar = new Sidebar();
	}

	@Override
	protected void defineScene() {
		this.getStylesheets().add(getClass().getResource(Resources.CSS).toExternalForm());
		
		this.settingsButton.setPrefWidth(200);
		this.settingsButton.setPrefHeight(40);

		this.settingsButton.setLayoutY(60);
		this.settingsButton.setOnAction(this::onSettingsButtonClick);
		this.settingsButton.getStyleClass().add("ui-button");
		
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
		
		ObservableList<Node> rootNodes = root.getChildren();
		rootNodes.add(startButton);
		rootNodes.add(stopButton);
		rootNodes.add(settingsButton);
		rootNodes.add(sidebar);
		
		AnchorPane.setRightAnchor(settingsButton, 50.0);
	}
	
	
	private void onStartButtonClick(ActionEvent event) {
		
	}
	
	private void onStopButtonClick(ActionEvent event) {
		
	}
	
	private void onSettingsButtonClick(ActionEvent event) {
		
	}
}