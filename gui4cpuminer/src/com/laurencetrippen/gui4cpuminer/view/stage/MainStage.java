package com.laurencetrippen.gui4cpuminer.view.stage;

import com.laurencetrippen.gui4cpuminer.view.scene.ConfigScene;
import com.laurencetrippen.gui4cpuminer.view.scene.DashboardScene;

import javafx.stage.Stage;

public class MainStage extends Stage {
	
	private DashboardScene dashboardScene = new DashboardScene(this);
	private ConfigScene configScene = new ConfigScene(this);
	
	public MainStage(String title) {
		this.setTitle(title);
		this.setScene(dashboardScene);
	}

	public DashboardScene getDashboardScene() {
		return dashboardScene;
	}

	public ConfigScene getConfigScene() {
		return configScene;
	}
}