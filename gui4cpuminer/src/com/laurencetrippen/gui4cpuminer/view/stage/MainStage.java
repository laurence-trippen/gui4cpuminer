package com.laurencetrippen.gui4cpuminer.view.stage;

import com.laurencetrippen.gui4cpuminer.view.scene.DashboardScene;

import javafx.stage.Stage;

public class MainStage extends Stage {
	
	private DashboardScene dashboardScene = new DashboardScene();
	
	public MainStage(String title) {
		this.setTitle(title);
		this.setMaxWidth(1024);
		this.setMaxHeight(768);
		this.setScene(dashboardScene);
	}
}