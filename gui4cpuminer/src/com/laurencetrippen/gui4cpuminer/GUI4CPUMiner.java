package com.laurencetrippen.gui4cpuminer;

import com.laurencetrippen.gui4cpuminer.view.stage.MainStage;

import javafx.application.Application;
import javafx.stage.Stage;

public class GUI4CPUMiner extends Application {

	@Override
	public void init() throws Exception {
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage = null;
		
		MainStage mainStage = new MainStage("gui4cpuminer");
		mainStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}