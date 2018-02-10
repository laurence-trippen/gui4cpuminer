package com.laurencetrippen.gui4cpuminer.view.stage;

import com.laurencetrippen.gui4cpuminer.model.Resources;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MainStage extends AbstractStage {
	
	private Scene scene;
	private AnchorPane root;
	private Pane sidePane;
	private Button startButton;
	private Button dashboardButton;
	private Button configButton;
	
	public MainStage(String title) {
		this.setTitle(title);
		this.initScene();
		this.defineScene();
	}

	@Override
	protected void initScene() {
		this.root = new AnchorPane();
		this.scene = new Scene(root, 1024, 768);
		this.startButton = new Button("Start");
		this.dashboardButton = new Button("Dashboard");
		this.configButton = new Button("Configuration");
		this.sidePane = new Pane();
	}

	@Override
	protected void defineScene() {
		this.scene.getStylesheets().add(getClass().getResource(Resources.CSS).toExternalForm());
		
		this.sidePane.getStyleClass().add("ui-sidebar");
		this.sidePane.setPrefWidth(256);
		
		this.dashboardButton.setOnAction(this::onDashboardButtonClick);
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
		
		this.startButton.setLayoutX(300);
		this.startButton.setLayoutY(100);
		this.startButton.setOnAction(this::onStartButtonClick);
		
		ObservableList<Node> rootNodes = root.getChildren();
		rootNodes.add(startButton);
		rootNodes.add(sidePane);
		
		AnchorPane.setBottomAnchor(sidePane, 0.0);
		AnchorPane.setLeftAnchor(sidePane, 0.0);
		AnchorPane.setTopAnchor(sidePane, 0.0);
		
		this.setScene(scene);
	}
	
	private void onStartButtonClick(ActionEvent event) {
		
	}
	
	private void onDashboardButtonClick(ActionEvent event) {
		
	}
	
	private void onConfigButtonClick(ActionEvent event) {
		
	}
}