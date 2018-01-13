package com.laurencetrippen.gui4cpuminer.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.laurencetrippen.gui4cpuminer.model.Resources;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class SceneManager {
	
	public static final String MAIN_SCENE = "/com/laurencetrippen/gui4cpuminer/view/fxml/MainScene.fxml";
	
	private static SceneManager instance = null;
		
	public static SceneManager getInstance() {
		if (instance == null) {
			instance = new SceneManager();
		}
		return instance;
	}
	
	private List<String> fxmlIdentifiers;
	private Map<String, Scene> sceneMap;
	
	private SceneManager() {
		this.fxmlIdentifiers = new ArrayList<>();
		this.sceneMap = new HashMap<>();
	}
	
	public void addFXML(String fxml) {
		this.fxmlIdentifiers.add(fxml);
	}
	
	public void initScenes() {
		for (String fxml : fxmlIdentifiers) {
			try {
				Scene scene = new Scene(FXMLLoader.load(getClass().getResource(fxml)));
				scene.getStylesheets().add(getClass().getResource(Resources.CSS).toExternalForm());
				sceneMap.put(fxml, scene);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Scene getScene(String fxml) {
		return sceneMap.get(fxml);
	}
}