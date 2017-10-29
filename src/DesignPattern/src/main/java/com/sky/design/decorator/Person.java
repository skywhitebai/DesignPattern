package com.sky.design.decorator;

public class Person {

	private String name;
	
	public Person(String name){
		this.name=name;
	}
	public Person(){
		
	}
	public void Show(){
		System.out.println("装扮的"+ name);
	}
}
