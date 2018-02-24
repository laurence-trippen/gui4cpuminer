package com.laurencetrippen.gui4cpuminer.view.node;

import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;

public class CheckBoxComponent extends HBox implements IComponent {

	private CheckBox checkBox;
	
	public CheckBoxComponent(String text) {
		this.setAlignment(Pos.CENTER);
		this.checkBox = new CheckBox(text);
		this.getChildren().add(checkBox);
	}
	
	@Override
	public Object getValue() {
		return null;
	}
}