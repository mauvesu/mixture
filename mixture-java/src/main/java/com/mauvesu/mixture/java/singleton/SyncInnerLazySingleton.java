package com.mauvesu.mixture.java.singleton;

/**
 * Lazy Singleton in sync module, using static inner class
 * 
 * @author mauvesu
 *
 */
public class SyncInnerLazySingleton extends BaseSingleton{
	
	private SyncInnerLazySingleton() {
	}
	
	private static class SingletonHolder {
		public static SyncInnerLazySingleton singleton = new SyncInnerLazySingleton();
	}
	
	public static SyncInnerLazySingleton getInstance() {
		return SingletonHolder.singleton;
	}

}
