package com.sky.design.prototype.base;

public abstract class Prototype {

	private String id;

	public Prototype(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
	public abstract Prototype Clone() throws CloneNotSupportedException;
	
	
}
