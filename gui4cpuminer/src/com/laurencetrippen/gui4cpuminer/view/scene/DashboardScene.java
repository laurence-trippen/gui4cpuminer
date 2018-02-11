package com.laurencetrippen.gui4cpuminer.view.scene;

import com.laurencetrippen.gui4cpuminer.model.Resources;
import com.laurencetrippen.gui4cpuminer.view.stage.MainStage;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class DashboardScene extends AbstractScene {

	private MainStage mainStage;
	private AnchorPane root;
	private Pane sidePane;
	private Button startButton;
	private Button dashboardButton;
	private Button configButton;
	private TextField textField;
	
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
		this.dashboardButton = new Button("Dashboard");
		this.configButton = new Button("Configuration");
		this.textField = new TextField();
		this.sidePane = new Pane();
	}

	@Override
	protected void defineScene() {
		this.getStylesheets().add(getClass().getResource(Resources.CSS).toExternalForm());
		
		this.sidePane.getStyleClass().add("ui-sidebar");
		this.sidePane.setPrefWidth(256);
		
		this.dashboardButton.setLayoutY(80);
		this.dashboardButton.setPrefSize(256, 64);
		this.dashboardButton.getStyleClass().add("ui-sidebar-button");
		this.dashboardButton.getStyleClass().add("ui-sidebar-button-active");
		this.dashboardButton.setAlignment(Pos.BASELINE_LEFT);
		
		this.configButton.setOnAction(this::onConfigButtonClick);
		this.configButton.setLayoutY(144);
		this.configButton.setPrefSize(256, 64);
		this.configButton.getStyleClass().add("ui-sidebar-button");
		this.configButton.setAlignment(Pos.BASELINE_LEFT);
		
		ObservableList<Node> sidePaneChilds = sidePane.getChildren();
		sidePaneChilds.add(dashboardButton);
		sidePaneChilds.add(configButton);
		
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
		rootNodes.add(sidePane);
		rootNodes.add(textField);
		
		AnchorPane.setBottomAnchor(sidePane, 0.0);
		AnchorPane.setLeftAnchor(sidePane, 0.0);
		AnchorPane.setTopAnchor(sidePane, 0.0);
	}
	
	
	private void onStartButtonClick(ActionEvent event) {
		
	}
	
	private void onConfigButtonClick(ActionEvent event) {
		this.mainStage.setScene(mainStage.getConfigScene());
	}
}