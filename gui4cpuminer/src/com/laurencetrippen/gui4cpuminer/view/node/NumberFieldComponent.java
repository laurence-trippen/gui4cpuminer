package com.laurencetrippen.gui4cpuminer.view.node;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class NumberFieldComponent extends HBox implements IComponent {

	private TextField textField;
	
	public NumberFieldComponent(String promptText) {
		this.setAlignment(Pos.CENTER);
		this.textField = new TextField();
		
	}

	@Override
	public Object getValue() {
		return null;
	}
}