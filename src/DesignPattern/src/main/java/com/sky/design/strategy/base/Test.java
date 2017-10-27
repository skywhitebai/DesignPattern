package com.sky.design.strategy.base;

public class Test {
	public static void main(String[] args) {
		Context context;
		context=new Context(new ConcreteStrategyA());
		context.ContextInterface();
		context=new Context(new ConcreteStrategyB());
		context.ContextInterface();
		context=new Context(new ConcreteStrategyC());
		context.ContextInterface();
	}
}
