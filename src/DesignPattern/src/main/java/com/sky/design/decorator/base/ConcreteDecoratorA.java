package com.sky.design.decorator.base;

public class ConcreteDecoratorA extends Decorator {

	public void Operation(){
		super.Operation();
		AddedBehavior();
		System.out.println("具体装饰对象A的操作");
	}
	private  void  AddedBehavior(){
	}
}
