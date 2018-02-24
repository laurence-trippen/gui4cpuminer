package com.laurencetrippen.gui4cpuminer.view.node;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class FileSelectComponent extends Pane implements IComponent {
	
	private TextField pathTextField;
	private Button selectButton;
	
	public FileSelectComponent(String promptText) {
		this.pathTextField = new TextField();
		this.pathTextField.setPromptText(promptText);
		this.pathTextField.setLayoutX(20);
		this.pathTextField.setLayoutY(10);
		this.pathTextField.setPrefSize(280, 40);
		this.selectButton = new Button("...");
		this.selectButton.setPrefSize(60, 40);
		this.selectButton.setLayoutX(310);
		this.selectButton.setLayoutY(10);
		this.getChildren().addAll(pathTextField, selectButton);
	}
	
	@Override
	public Object getValue() {
		return null;
	}
}