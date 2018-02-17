package com.laurencetrippen.gui4cpuminer;

import com.laurencetrippen.gui4cpuminer.view.scene.MainScene;

import javafx.application.Application;
import javafx.stage.Stage;

public class GUI4CPUMiner extends Application {

	private MainScene mainScene;
	
	@Override
	public void init() throws Exception {
		this.mainScene = new MainScene();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("gui4cpuminer");
		primaryStage.setResizable(false);
		primaryStage.setMaxWidth(1024);
		primaryStage.setMaxHeight(768);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}