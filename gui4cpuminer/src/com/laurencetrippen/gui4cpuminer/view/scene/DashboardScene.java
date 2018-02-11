package com.laurencetrippen.gui4cpuminer.view.scene;

import com.laurencetrippen.gui4cpuminer.model.Resources;
import com.laurencetrippen.gui4cpuminer.view.node.Sidebar;
import com.laurencetrippen.gui4cpuminer.view.stage.MainStage;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DashboardScene extends AbstractScene {

	private MainStage mainStage;
	private AnchorPane root;
	private Button startButton;
	private TextField textField;
	private Sidebar sidebar;
	
	public DashboardScene(MainStage mainStage) {
		super(new AnchorPane(), 1024, 768);
		this.mainStage = mainStage;
		this.initScene();
		this.defineScene();
	}

	@Override
	protected void initScene() {
		this.root = (AnchorPane) this.getRoot();
		this.startButton = new Button("Start Mining");
		this.textField = new TextField();
		this.sidebar = new Sidebar(mainStage);
	}

	@Override
	protected void defineScene() {
		this.getStylesheets().add(getClass().getResource(Resources.CSS).toExternalForm());
		
		this.startButton.setPrefWidth(200);
		this.startButton.setPrefHeight(40);
		this.startButton.setLayoutX(300);
		this.startButton.setLayoutY(70);
		this.startButton.setOnAction(this::onStartButtonClick);
		this.startButton.getStyleClass().add("ui-button");
		
		this.textField.setLayoutX(300);
		this.textField.setLayoutY(120);
		this.textField.setPrefSize(256, 40);
		this.textField.setPromptText("Type in here");
		this.textField.getStyleClass().add("ui-textfield");
		
		ObservableList<Node> rootNodes = root.getChildren();
		rootNodes.add(startButton);
		rootNodes.add(sidebar);
		rootNodes.add(textField);
	}
	
	
	private void onStartButtonClick(ActionEvent event) {
		
	}
}