package com.laurencetrippen.gui4cpuminer.view.node;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class TextFieldComponent extends HBox implements IComponent {

	private TextField textField;
	
	public TextFieldComponent(String promptText) {
		this.setAlignment(Pos.CENTER);
		this.textField = new TextField();
		this.textField.setPromptText(promptText);
		this.textField.setPrefWidth(360);
		this.getChildren().add(textField);
	}

	@Override
	public Object getValue() {
		return textField.getText();
	}
}