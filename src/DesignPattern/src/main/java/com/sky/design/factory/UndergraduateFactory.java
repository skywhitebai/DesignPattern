package com.sky.design.factory;

//学雷锋的大学生的工厂
public class UndergraduateFactory implements IFactory {

	@Override
	public LeiFeng CreateLeiFeng() {
		return new Undergraduate();
	}

}
