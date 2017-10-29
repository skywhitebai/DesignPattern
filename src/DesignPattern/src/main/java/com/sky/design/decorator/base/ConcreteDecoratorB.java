package com.sky.design.decorator.base;

public class ConcreteDecoratorB extends Decorator {

	private String addedState;
	public void Operation(){
		super.Operation();
		addedState="New State";
		System.out.println("具体装饰对象B的操作");
	}
}
