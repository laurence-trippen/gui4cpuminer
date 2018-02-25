package com.laurencetrippen.gui4cpuminer.api;

public class SettingsEntry {

	private String name;
	private String argument;
	private SettingsType settingsType;
	
	public SettingsEntry(String name, SettingsType settingsType) {
		this.name = name;
		this.settingsType = settingsType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SettingsType getSettingsType() {
		return settingsType;
	}

	public void setSettingsType(SettingsType settingsType) {
		this.settingsType = settingsType;
	}
}