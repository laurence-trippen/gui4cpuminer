package com.laurencetrippen.gui4cpuminer.view.scene;

import javafx.scene.Parent;
import javafx.scene.Scene;

public abstract class AbstractScene extends Scene {
	
	public AbstractScene(Parent p, double width, double height) {
		super(p, width, height);
	}
	
	protected abstract void initScene();
	protected abstract void defineScene();
	
}