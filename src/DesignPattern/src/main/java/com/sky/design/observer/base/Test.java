package com.sky.design.observer.base;

public class Test {

	public static void main(String[] args) {

		ConcreteSubject s=new ConcreteSubject();
		s.Attach(new ConcreteObserver(s, "x"));

		s.Attach(new ConcreteObserver(s, "y"));
		s.Attach(new ConcreteObserver(s, "z"));
		s.setSubjectState("ABC");
		s.Notify();
		
	}
	
}
