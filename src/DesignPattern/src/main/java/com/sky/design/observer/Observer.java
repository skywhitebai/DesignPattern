package com.sky.design.observer;

public abstract class Observer {

	protected String name;
	protected Subject sub;
	
	
	public Observer(String name, Subject sub) {
		this.name = name;
		this.sub = sub;
	}


	abstract void Update();
}
