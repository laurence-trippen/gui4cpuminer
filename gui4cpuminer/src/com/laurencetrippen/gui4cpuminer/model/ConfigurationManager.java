package com.laurencetrippen.gui4cpuminer.model;

import java.io.File;

import com.laurencetrippen.jpg.ConfigManager;

public class ConfigurationManager {

	private static ConfigurationManager instance = null;

	public static ConfigurationManager instance() {
		if (instance == null) {
			instance = new ConfigurationManager();
		}
		return instance;
	}

	private ConfigManager<MiningConfiguration> configManager;
	private MiningConfiguration miningConfiguration;

	private ConfigurationManager() {
		this.configManager = new ConfigManager<>(MiningConfiguration.class);
		this.checkConfigDirectory();
	}

	private void checkConfigDirectory() {
		File configDir = new File(Resources.CONFIG_DIR);
		if (!configDir.exists()) {
			configDir.mkdirs();
		}
	}

	public void load() {
		this.configManager.generateConfig();
		this.miningConfiguration = this.configManager.load();
	}

	public void save() {
		if (miningConfiguration != null) {
			this.configManager.save(miningConfiguration);
		}
	}

	public MiningConfiguration getMiningConfiguration() {
		return miningConfiguration;
	}
}