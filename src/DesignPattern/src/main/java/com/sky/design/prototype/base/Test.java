package com.sky.design.prototype.base;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		ConcretePrototype1 concretePrototype1=new ConcretePrototype1("I");
		ConcretePrototype1 concretePrototype12=(ConcretePrototype1) concretePrototype1.Clone();
		System.out.println(concretePrototype12.getId());
	}
}
