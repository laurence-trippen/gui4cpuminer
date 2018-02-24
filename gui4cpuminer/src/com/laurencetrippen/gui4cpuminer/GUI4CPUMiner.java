package com.laurencetrippen.gui4cpuminer;

import com.laurencetrippen.gui4cpuminer.model.ConfigurationManager;
import com.laurencetrippen.gui4cpuminer.model.Minerd;
import com.laurencetrippen.gui4cpuminer.view.scene.MainScene;

import javafx.application.Application;
import javafx.stage.Stage;

public class GUI4CPUMiner extends Application {

	private MainScene mainScene;
	
	@Override
	public void init() throws Exception {
		ConfigurationManager.instance().load();
		
		Minerd.init();
		
		this.mainScene = new MainScene();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("gui4cpuminer");
		primaryStage.setResizable(false);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}