package com.laurencetrippen.gui4cpuminer.model;

public class MinerdCommandBuilder {

	private static final String WINDOWS_EXEC 	= "minerd.exe";
	private static final String UNIX_LINUX_EXEC 	= "minerd";
	
	public static String buildCommand() {
		System.getProperty("os.name");
		System.getProperty("os.arch");
		
		return null;
	}
}