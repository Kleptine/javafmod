package com.asg;

public class JavaFmodLoader {

	/**
	 * Load all associated dynamic libraries for FMOD. 
	 * Run this before any javafmod api code gets run.
	 * Note: This
	 */
	public static void loadFmodNative(){
		new SharedLibraryLoader().load("fmod");
		new SharedLibraryLoader().load("fmodstudio");
		new SharedLibraryLoader().load("javafmod");
	}
}
