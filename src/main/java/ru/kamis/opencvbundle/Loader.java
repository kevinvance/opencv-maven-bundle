package ru.kamis.opencvbundle;

import org.fusesource.hawtjni.runtime.Library;
import org.opencv.core.Core;

public class Loader {
	private static final Object initializeLock = new Object();
	private static boolean initialized = false;
	
	public static void init() {
		init(Loader.class.getClassLoader());
	}
	
	public static void init(ClassLoader loader) {
		synchronized (initializeLock) {
			if(!initialized) {
				Library library = new Library(Core.NATIVE_LIBRARY_NAME, Core.VERSION, loader);
				library.load();
				initialized = true;
			}
		}
	}
}
