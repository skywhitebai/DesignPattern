package com.sky.design.strategy.base;

//封装了具体方法和行为，继承于Strategy
public class ConcreteStrategyB extends Strategy {

	//算法B实现方法
	@Override
	public void AlgorithmInterface() {
		System.out.println("算法B实现方法");		
	}

}
