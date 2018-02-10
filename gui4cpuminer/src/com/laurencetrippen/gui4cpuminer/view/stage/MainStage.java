package com.laurencetrippen.gui4cpuminer.view.stage;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MainStage extends GUI4CPUStage {
	
	private Scene scene;
	private AnchorPane root;
	private Button startButton;
	
	public MainStage(String title) {
		this.setTitle(title);
		this.initScene();
		this.defineScene();
	}

	@Override
	protected void initScene() {
		this.root = new AnchorPane();
		this.scene = new Scene(root, 1024, 768);
		this.startButton = new Button("Start");
	}

	@Override
	protected void defineScene() {
		this.startButton.setLayoutX(100);
		this.startButton.setLayoutY(100);
		this.startButton.setOnAction(this::onStartButtonClick);
		
		ObservableList<Node> rootNodes = root.getChildren();
		rootNodes.add(startButton);
		
		this.setScene(scene);
	}
	
	private void onStartButtonClick(ActionEvent event) {
		System.out.println("Hallo");
	}
}