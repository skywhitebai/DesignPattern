package com.sky.design.decorator;

public class Test {

	public static void main(String[] args) {
		Person person=new Person("小菜");
		System.out.println("第一种装扮：\n");
		TShirts tShirts=new  TShirts();
		tShirts.Decorate(person);
		BigTrouser bigTrouser=new BigTrouser();
		bigTrouser.Decorate(tShirts);
		BigTrouser bigTrouser2=new BigTrouser();
		bigTrouser2.Decorate(bigTrouser);
		bigTrouser2.Show();
		
		System.out.println("第二种装扮：\n");
		TShirts tShirts2=new  TShirts();
		tShirts2.Decorate(person);
		TShirts tShirts3=new  TShirts();
		tShirts3.Decorate(tShirts2);
		BigTrouser bigTrouser3=new BigTrouser();
		bigTrouser3.Decorate(tShirts3);
		bigTrouser3.Show();
	}
}
