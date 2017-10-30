package com.sky.design.observer;

public class GameObserver extends Observer  {

	public GameObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	void Update() {
		System.out.println(sub.getSubjectState()+name+"关闭游戏，继续工作！");
	}
	
}
