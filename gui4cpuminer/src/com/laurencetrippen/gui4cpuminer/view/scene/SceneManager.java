package com.laurencetrippen.gui4cpuminer.view.scene;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.scene.Scene;

public class SceneManager {
	
	private static SceneManager instance = null;
		
	public static SceneManager getInstance() {
		if (instance == null) {
			instance = new SceneManager();
		}
		return instance;
	}
	
	private Map<String, Scene> sceneMap;
	
	private SceneManager() {
		this.sceneMap = new HashMap<>();
	}
	
	public void addFXML(String id, String fxml) {
		
	}
	
	public void initScenes() {
		
	}
	
	private static class SceneIdentifier {
		
		private String id;
		private String fxml;
		
		public SceneIdentifier(String id, String fxml) {
			this.id = id;
			this.fxml = fxml;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFxml() {
			return fxml;
		}

		public void setFxml(String fxml) {
			this.fxml = fxml;
		}
	}
}