package com.laurencetrippen.gui4cpuminer.view.node;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class NumberFieldComponent extends HBox implements IComponent {

	private TextField textField;
	
	public NumberFieldComponent(String promptText) {
		this.setAlignment(Pos.CENTER);
		this.textField = new TextField();
		this.textField.setPrefWidth(350);
		this.textField.setPromptText(promptText);
		this.textField.textProperty().addListener(new ChangeListener<String>() {
	        @Override
	        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
	            if (!newValue.matches("\\d*")) {
	            		textField.setText(newValue.replaceAll("[^\\d]", ""));
	            }
	        }
	    });
		this.getChildren().add(textField);
	}

	@Override
	public Object getValue() {
		return null;
	}
}