package com.sky.design.factory.base;

public class Test {

	public static void main(String[] args) throws Exception {
		IFactory operFacory=new AddFactory();
		Operation operation=operFacory.CreateOperation();
		operation.setNumberA(12);
		operation.setNumberB(156);
		System.out.println(operation.GetResult());
		
		operation=new SubFactory().CreateOperation();
		operation.setNumberA(12);
		operation.setNumberB(156);
		System.out.println(operation.GetResult());
	}
}
