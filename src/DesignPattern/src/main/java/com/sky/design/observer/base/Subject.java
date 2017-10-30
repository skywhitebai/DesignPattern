package com.sky.design.observer.base;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers=new ArrayList<Observer>();
	//增加观察者
	public void Attach(Observer observer){
		observers.add(observer);
	}
	//移除观察者
	public void Detach(Observer observer){
		observers.add(observer);
	}
	//通知
	public void Notify(){
		for(Observer observer: observers){
			observer.Update();
		}
	}
}
