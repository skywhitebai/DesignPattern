package com.sky.design.observer;

//通知者接口
public interface Subject {

	void Attach(Observer observer);
	void Detach(Observer observer);
	void Notify();
	String getSubjectState();
	void setSubjectState( String SubjectState);
	
}
