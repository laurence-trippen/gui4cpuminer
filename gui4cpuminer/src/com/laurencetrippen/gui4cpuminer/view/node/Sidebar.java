package com.laurencetrippen.gui4cpuminer.view.node;

import com.laurencetrippen.gui4cpuminer.view.stage.MainStage;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class Sidebar extends Pane {
	
	private static boolean dashboardIsActive = true;
	private static boolean configIsActive = false;
	private MainStage mainStage;
	private Button dashboardButton;
	private Button configButton;
	
	public Sidebar(MainStage mainStage) {
		this.mainStage = mainStage;
		this.initNode();
		this.defineNode();
	}
	
	private void initNode() {
		this.dashboardButton = new Button("Dashboard");
		this.configButton = new Button("Configuration");
	}
	
	private void defineNode() {
		this.getStyleClass().add("ui-sidebar");
		this.setPrefWidth(256);
		
		AnchorPane.setBottomAnchor(this, 0.0);
		AnchorPane.setLeftAnchor(this, 0.0);
		AnchorPane.setTopAnchor(this, 0.0);	
		
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
		
		ObservableList<Node> sidebarChilds = this.getChildren();
		sidebarChilds.add(dashboardButton);
		sidebarChilds.add(configButton);
	}
	
	private void onDashboardButtonClick(ActionEvent event) {
		if (configIsActive) {			
			this.mainStage.setScene(mainStage.getDashboardScene());
			this.configButton.getStyleClass().remove("ui-sidebar-button-active");
			this.dashboardButton.getStyleClass().add("ui-sidebar-button-active");
			
			configIsActive = false;
			dashboardIsActive = true;
		}
	}
	
	private void onConfigButtonClick(ActionEvent event) {
		if (dashboardIsActive) {			
			this.mainStage.setScene(mainStage.getConfigScene());
			this.dashboardButton.getStyleClass().remove("ui-sidebar-button-active");
			this.configButton.getStyleClass().add("ui-sidebar-button-active");
			
			dashboardIsActive = false;
			configIsActive = true;
		}
	}
}