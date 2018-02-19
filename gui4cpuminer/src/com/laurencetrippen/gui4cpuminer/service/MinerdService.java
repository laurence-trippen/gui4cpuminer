package com.laurencetrippen.gui4cpuminer.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.laurencetrippen.gui4cpuminer.model.Minerd;
import com.laurencetrippen.gui4cpuminer.view.scene.MainScene;

import javafx.application.Platform;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class MinerdService extends Service<Void> {

	private MainScene mainScene;
	
	public MinerdService(MainScene mainScene) {
		this.mainScene = mainScene;
	}
	
	@Override
	protected Task<Void> createTask() {
		return new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				ProcessBuilder processBuilder = new ProcessBuilder("./minerd" , "--help");
				processBuilder.directory(Minerd.getProcessDirectory().getAbsoluteFile());
				
				try {
					Process process = processBuilder.start();
					
					Thread consoleLogger = new Thread(new Task<Void>() {
						@Override
						protected Void call() throws Exception {
							BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
							try {
								String line = reader.readLine();
								while (line != null) {
									line = reader.readLine();
									consoleLog(line);
								}
								reader.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
							return null;
						}
					});
					consoleLogger.setName("Minerd Console Logger");
					consoleLogger.setDaemon(true);
					consoleLogger.start();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return null;
			}
		};
	}
	
	private void consoleLog(String message) {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				if (message != null) {
					mainScene.consoleLog(message + "\n");	
				}
			}
		});
	}
}