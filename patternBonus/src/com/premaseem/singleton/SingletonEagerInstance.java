package com.premaseem.singleton;

public class SingletonEagerInstance {

	// Have a private constructor so that it cannot be instanciate other then
	// from this class.
	private SingletonEagerInstance() {
	}

	public static final SingletonEagerInstance uniqueInstance = new SingletonEagerInstance();
	public int stateholder = 1;

	public void doCounting() {
		System.out.println("Each time this method is called, it current state would get incremanted by 5");
		for (int i = 1; i <= 5; i++,stateholder++)
			System.out.println("Count is " + stateholder);
	}

}
