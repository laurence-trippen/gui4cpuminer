package com.laurencetrippen.gui4cpuminer.view.node;

import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;

public class ComboBoxComponent extends HBox implements IComponent {

	private ComboBox<String> comboBox;
	
	public ComboBoxComponent(String promptText) {
		this.setAlignment(Pos.CENTER);
		this.comboBox = new ComboBox<>();
		this.comboBox.setPrefWidth(300);
		this.comboBox.setPromptText(promptText);
		this.getChildren().add(comboBox);
	}
	
	@Override
	public Object getValue() {
		return null;
	}
}