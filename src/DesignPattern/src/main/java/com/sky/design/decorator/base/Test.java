package com.sky.design.decorator.base;

public class Test {
	public static void main(String[] args) {
		ConcreteComponent concreteComponent=new ConcreteComponent();
		ConcreteDecoratorA concreteDecoratorA=new ConcreteDecoratorA();
		ConcreteDecoratorB concreteDecoratorB=new ConcreteDecoratorB();
		ConcreteDecoratorB concreteDecoratorB2=new ConcreteDecoratorB();
		concreteDecoratorA.SetComponent(concreteComponent);
		concreteDecoratorB.SetComponent(concreteDecoratorA);
		concreteDecoratorB2.SetComponent(concreteDecoratorB);
		concreteDecoratorB2.Operation();
		
	}
}
