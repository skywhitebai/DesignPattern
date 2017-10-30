package com.sky.design.factory;

public class Test {

	//工厂方法模式
	public static void main(String[] args) {
		IFactory factory=new UndergraduateFactory();
		LeiFeng studenta=factory.CreateLeiFeng();
		studenta.BuyRice();
		factory=new VolunteerFactory();
		LeiFeng volunteer=factory.CreateLeiFeng();
		volunteer.Sweep();
	}
	
	
	//简单工厂模式
	public static void main2(String[] args) {
		LeiFeng studenta=SimpleFactory.CreateLeiFeng("学雷锋的大学生");
		studenta.BuyRice();
		LeiFeng volunteer=SimpleFactory.CreateLeiFeng("社区志愿者");
		volunteer.Sweep();
	}
	
	
	public static void main1(String[] args) {
		LeiFeng studenta=new Undergraduate();
		studenta.BuyRice();
		LeiFeng volunteer=new Volunteer();
		volunteer.Sweep();
	}
}
