package com.sky.design.strategy.base;

//封装了具体方法和行为，继承于Strategy
public class ConcreteStrategyA extends Strategy {

	//算法A实现方法
	@Override
	public void AlgorithmInterface() {
		System.out.println("算法A实现方法");		
	}

}
