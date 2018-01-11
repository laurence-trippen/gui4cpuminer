package com.laurencetrippen.gui4cpuminer;

import com.laurencetrippen.gui4cpuminer.view.scene.SceneManager;

import javafx.application.Application;
import javafx.stage.Stage;

public class GUI4CPUMiner extends Application {

	@Override
	public void init() throws Exception {
		SceneManager sceneManager = SceneManager.getInstance();
		sceneManager.addFXML(SceneManager.MAIN_SCENE);
		sceneManager.initScenes();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(SceneManager.getInstance().getScene(SceneManager.MAIN_SCENE));
		primaryStage.setTitle("gui4cpuminer");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}