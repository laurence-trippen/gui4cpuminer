package com.laurencetrippen.gui4cpuminer.view.scene;

import com.laurencetrippen.gui4cpuminer.model.Resources;
import com.laurencetrippen.gui4cpuminer.view.node.Sidebar;
import com.laurencetrippen.gui4cpuminer.view.stage.MainStage;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class ConfigScene extends AbstractScene {

	private MainStage mainStage;
	private AnchorPane root;
	private Sidebar sidebar;
	
	public ConfigScene(MainStage mainStage) {
		super(new AnchorPane(), 1024, 768);
		this.mainStage = mainStage;
		this.initScene();
		this.defineScene();
	}

	@Override
	protected void initScene() {
		this.root = (AnchorPane) this.getRoot();
		this.sidebar = new Sidebar(mainStage);
	}

	@Override
	protected void defineScene() {
		this.getStylesheets().add(getClass().getResource(Resources.CSS).toExternalForm());

		ObservableList<Node> rootNodes = root.getChildren();
		rootNodes.add(sidebar);
	}
}