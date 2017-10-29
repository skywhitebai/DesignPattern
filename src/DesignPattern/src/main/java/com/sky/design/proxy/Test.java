package com.sky.design.proxy;

public class Test {

	public static void main(String[] args) {
		SchoolGirl jiaojiao=new SchoolGirl();
		jiaojiao.setName("李娇娇");
		Proxy daili=new Proxy(jiaojiao,"张三");
		daili.GiveDolls();
		daili.GiveFlowers();
		daili.GiveChocolate();
	}
}
