package com.laurencetrippen.gui4cpuminer.view.stage;

import com.laurencetrippen.gui4cpuminer.view.scene.MainScene;

import javafx.stage.Stage;

public class MainStage extends Stage {
	
	private MainScene dashboardScene = new MainScene();
	
	public MainStage(String title) {
		this.setTitle(title);
		this.setResizable(false);
		this.setMaxWidth(1024);
		this.setMaxHeight(768);
		this.setScene(dashboardScene);
	}
}