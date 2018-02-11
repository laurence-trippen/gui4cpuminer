package com.laurencetrippen.gui4cpuminer.view.node;

import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class Sidebar extends Pane {
	
	private Button dashboardButton;
	
	public Sidebar() {
		this.initNode();
		this.defineNode();
	}
	
	private void initNode() {
		this.dashboardButton = new Button("Dashboard");
	}
	
	private void defineNode() {
		this.getStyleClass().add("ui-sidebar");
		this.setPrefWidth(230);
		
		AnchorPane.setBottomAnchor(this, 0.0);
		AnchorPane.setLeftAnchor(this, 0.0);
		AnchorPane.setTopAnchor(this, 0.0);	

		this.dashboardButton.setLayoutY(40);
		this.dashboardButton.setLayoutX(10);
		this.dashboardButton.setPrefSize(210, 64);
		this.dashboardButton.getStyleClass().add("ui-sidebar-button");
		this.dashboardButton.getStyleClass().add("ui-sidebar-button-active");
		this.dashboardButton.setAlignment(Pos.BASELINE_LEFT);
		
		ObservableList<Node> sidebarChilds = this.getChildren();
		sidebarChilds.add(dashboardButton);
	}
}