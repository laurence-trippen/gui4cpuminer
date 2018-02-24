package com.laurencetrippen.gui4cpuminer.view.node;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class LabelComponent extends HBox {

	private Label label;
	
	public LabelComponent(String text) {
		this.setAlignment(Pos.CENTER);
		this.label = new Label(text);
		this.label.setFont(Font.font(16));
		this.getChildren().add(label);
	}
}