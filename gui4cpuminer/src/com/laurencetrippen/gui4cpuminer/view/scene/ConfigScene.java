package com.laurencetrippen.gui4cpuminer.view.scene;

import com.laurencetrippen.gui4cpuminer.model.Resources;
import com.laurencetrippen.gui4cpuminer.view.stage.MainStage;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class ConfigScene extends AbstractScene {

	private MainStage mainStage;
	private AnchorPane root;
	private Button dashboardButton;
	private Button configButton;
	private Pane sidePane;
	
	public ConfigScene(MainStage mainStage) {
		super(new AnchorPane(), 1024, 768);
		this.mainStage = mainStage;
		this.initScene();
		this.defineScene();
	}

	@Override
	protected void initScene() {
		this.root = (AnchorPane) this.getRoot();
		this.dashboardButton = new Button("Dashboard");
		this.configButton = new Button("Configuration");
		this.sidePane = new Pane();
	}

	@Override
	protected void defineScene() {
		this.getStylesheets().add(getClass().getResource(Resources.CSS).toExternalForm());
		
		this.sidePane.getStyleClass().add("ui-sidebar");
		this.sidePane.setPrefWidth(256);
		
		this.dashboardButton.setOnAction(this::onDashboardButtonClick);
		this.dashboardButton.setLayoutY(80);
		this.dashboardButton.setPrefSize(256, 64);
		this.dashboardButton.getStyleClass().add("ui-sidebar-button");
		this.dashboardButton.setAlignment(Pos.BASELINE_LEFT);
		
		this.configButton.setLayoutY(144);
		this.configButton.setPrefSize(256, 64);
		this.configButton.getStyleClass().add("ui-sidebar-button");
		this.configButton.getStyleClass().add("ui-sidebar-button-active");
		this.configButton.setAlignment(Pos.BASELINE_LEFT);
		
		ObservableList<Node> sidePaneChilds = sidePane.getChildren();
		sidePaneChilds.add(dashboardButton);
		sidePaneChilds.add(configButton);
		
		ObservableList<Node> rootNodes = root.getChildren();
		rootNodes.add(sidePane);
		
		AnchorPane.setBottomAnchor(sidePane, 0.0);
		AnchorPane.setLeftAnchor(sidePane, 0.0);
		AnchorPane.setTopAnchor(sidePane, 0.0);
	}
	
	private void onDashboardButtonClick(ActionEvent event) {
		this.mainStage.setScene(mainStage.getDashboardScene());
	}
}