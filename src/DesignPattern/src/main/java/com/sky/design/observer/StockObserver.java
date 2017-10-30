package com.sky.design.observer;

public class StockObserver extends Observer  {

	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	void Update() {
		System.out.println(sub.getSubjectState()+name+"关闭股票详情，继续工作！");
	}
	
}
