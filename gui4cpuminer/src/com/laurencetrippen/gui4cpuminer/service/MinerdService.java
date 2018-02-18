package com.laurencetrippen.gui4cpuminer.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.laurencetrippen.gui4cpuminer.model.Minerd;

import javafx.application.Platform;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class MinerdService extends Service<Void> {

	@Override
	protected Task<Void> createTask() {
		return new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				ProcessBuilder processBuilder = new ProcessBuilder(Minerd.buildCommand());
				processBuilder.directory(Minerd.getProcessDirectory());
				
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
				System.out.println(message);
			}
		});
	}
}