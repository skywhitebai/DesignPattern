package com.sky.design.decorator;

public class Finery extends Person {

	protected Person component;
	//打扮
	public  void Decorate(Person component){
		this.component=component;
	}
	public void Show(){
		if(component!=null){
			component.Show();
		}
	}
	

}
