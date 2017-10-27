package com.sky.design.strategy.base;

//用一个ContextInterface来配置，维护一个对Strategy对象的引用
public class Context {

	Strategy strategy;
	//初始化的时候传入具体的策略对象
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	//上下文接口 根据传入的策略对象，调用其算法的方法
	public void ContextInterface(){
		strategy.AlgorithmInterface();
	}
	
}
