package com.sky.design.simplefactory;

public class Test {
	public static void main(String[] args) {
		Operation oper;
		oper = OperationFactory.createOperate("/");
		oper.setNumberA(11.11);
		oper.setNumberB(23);
		try {
			System.out.println(oper.GetResult());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
