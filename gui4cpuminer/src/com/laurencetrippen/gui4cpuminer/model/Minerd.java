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
		if (SystemUtils.IS_OS_LINUX || SystemUtils.IS_OS_MAC || SystemUtils.IS_OS_MAC_OSX) {
			StringBuilder sb = new StringBuilder();
			
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
			if (SystemUtils.OS_ARCH.contains("64")) {
				sb.append(CPUMINER_DIR);
				sb.append(WIN64_DIR);
				sb.append(WINDOWS_EXEC);
			} else if (SystemUtils.OS_ARCH.contains("32")) {
				sb.append(CPUMINER_DIR);
				sb.append(WIN32_DIR);
				sb.append(WINDOWS_EXEC);
			} else {
				sb.append(CPUMINER_DIR);
				sb.append(WIN32_DIR);
				sb.append(WINDOWS_EXEC);
			}
		} else if (SystemUtils.IS_OS_LINUX) {
			if (SystemUtils.OS_ARCH.contains("64")) {
				sb.append(POSIX_EXEC_PREFIX);
				sb.append(CPUMINER_DIR);
				sb.append(LINUX_X86_X64_DIR);
				sb.append(POSIX_EXEC);
			} else if (SystemUtils.OS_ARCH.contains("32")) {
				sb.append(POSIX_EXEC_PREFIX);
				sb.append(CPUMINER_DIR);
				sb.append(LINUX_X86_DIR);
				sb.append(POSIX_EXEC);
			} else {
				sb.append(POSIX_EXEC_PREFIX);
				sb.append(CPUMINER_DIR);
				sb.append(LINUX_X86_DIR);
				sb.append(POSIX_EXEC);
			}
		} else if (SystemUtils.IS_OS_MAC || SystemUtils.IS_OS_MAC_OSX) {
			if (SystemUtils.OS_ARCH.contains("64")) {
				sb.append(CPUMINER_DIR);
				sb.append(MAC_OSX64_DIR);
				sb.append(POSIX_EXEC);
				String absolutePath = new File(sb.toString()).getAbsolutePath();
				sb.delete(0, sb.length());
				sb.append(POSIX_EXEC_PREFIX);
				sb.append(absolutePath);
			} else if (SystemUtils.OS_ARCH.contains("32")) {
				sb.append(CPUMINER_DIR);
				sb.append(MAC_OSX32_DIR);
				sb.append(POSIX_EXEC);
			} else {
				sb.append(CPUMINER_DIR);
				sb.append(MAC_OSX32_DIR);
				sb.append(POSIX_EXEC);
			}
		}
		
		return sb.toString();
	}

	public static File getProcessDirectory() {
		return new File(processDirectory);
	}
}