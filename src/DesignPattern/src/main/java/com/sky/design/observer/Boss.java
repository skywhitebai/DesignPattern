package com.sky.design.observer;

import java.util.ArrayList;
import java.util.List;

import com.sky.design.observer.Subject;

public class Boss implements Subject {
	//同事列表
	private List<Observer> observers=new ArrayList<Observer>();
	private String action;
	private String SubjectState;

	@Override
	public void Attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void Detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void Notify() {
		for (Observer observer : observers) {
			observer.Update();
		}
	}

	@Override
	public String getSubjectState() {
		return SubjectState;
	}

	@Override
	public void setSubjectState(String SubjectState) {
		this.SubjectState=SubjectState;
	}

}
