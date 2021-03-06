package com.laurencetrippen.gui4cpuminer.model;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.SystemUtils;

public class Minerd {

	private static final String CPUMINER_DIR 		= "cpuminer/";
	private static final String LINUX_X86_DIR 		= "linux_x86/";
	private static final String LINUX_X86_X64_DIR 	= "linux_x86_x64/";
	private static final String MAC_OSX32_DIR 		= "osx32/";
	private static final String MAC_OSX64_DIR 		= "osx64/";
	private static final String WIN32_DIR 			= "win32/";
	private static final String WIN64_DIR 			= "win64/";
	private static final String WINDOWS_EXEC 		= "minerd.exe";
	private static final String POSIX_EXEC 			= "minerd";
	private static final String POSIX_EXEC_PREFIX	= "./";
	private static final String POSIX_CHMOD_X		= "chmod +x ";
	private static String processDirectory = null;
	
	public static void init() {
		StringBuilder sb = new StringBuilder();
		
		if (SystemUtils.IS_OS_WINDOWS) {
			if (SystemUtils.OS_ARCH.contains("64")) {
				processDirectory = WIN64_DIR + WINDOWS_EXEC;
			} else if (SystemUtils.OS_ARCH.contains("32")) {
				processDirectory = WIN32_DIR + WINDOWS_EXEC;
			} else {
				processDirectory = WIN32_DIR + WINDOWS_EXEC;
			}
		} else if (SystemUtils.IS_OS_LINUX || SystemUtils.IS_OS_MAC || SystemUtils.IS_OS_MAC_OSX) {
			if (SystemUtils.IS_OS_MAC || SystemUtils.IS_OS_MAC_OSX) {
				if (SystemUtils.OS_ARCH.contains("64")) {
					sb.append(POSIX_CHMOD_X);
					sb.append(CPUMINER_DIR);
					sb.append(MAC_OSX64_DIR);
					sb.append(POSIX_EXEC);
					
					processDirectory = CPUMINER_DIR + MAC_OSX64_DIR;
				} else if (SystemUtils.OS_ARCH.contains("32")) {
					sb.append(POSIX_CHMOD_X);
					sb.append(CPUMINER_DIR);
					sb.append(MAC_OSX32_DIR);
					sb.append(POSIX_EXEC);
					
					processDirectory = CPUMINER_DIR + MAC_OSX32_DIR;
				} else {
					sb.append(POSIX_CHMOD_X);
					sb.append(CPUMINER_DIR);
					sb.append(MAC_OSX32_DIR);
					sb.append(POSIX_EXEC);
					
					processDirectory = CPUMINER_DIR + MAC_OSX32_DIR;
				}
			} else if (SystemUtils.IS_OS_LINUX) {
				if (SystemUtils.OS_ARCH.contains("64")) {
					sb.append(POSIX_CHMOD_X);
					sb.append(CPUMINER_DIR);
					sb.append(LINUX_X86_X64_DIR);
					sb.append(POSIX_EXEC);
					
					processDirectory = CPUMINER_DIR + LINUX_X86_X64_DIR;
				} else if (SystemUtils.OS_ARCH.contains("32")) {
					sb.append(POSIX_CHMOD_X);
					sb.append(CPUMINER_DIR);
					sb.append(LINUX_X86_DIR);
					sb.append(POSIX_EXEC);
					
					processDirectory = CPUMINER_DIR + LINUX_X86_DIR;
				} else {
					sb.append(POSIX_CHMOD_X);
					sb.append(CPUMINER_DIR);
					sb.append(LINUX_X86_DIR);
					sb.append(POSIX_EXEC);
					
					processDirectory = CPUMINER_DIR + LINUX_X86_DIR;
				}
			} else {
				return;
			}
			
			try {
				Runtime.getRuntime().exec(sb.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String buildCommand() {
		StringBuilder sb = new StringBuilder();
		
		if (SystemUtils.IS_OS_WINDOWS) {

		} else if (SystemUtils.IS_OS_LINUX || SystemUtils.IS_OS_MAC || SystemUtils.IS_OS_MAC_OSX) {

		}
		
		return sb.toString();
	}

	public static File getProcessDirectory() {
		return new File(processDirectory);
	}
}