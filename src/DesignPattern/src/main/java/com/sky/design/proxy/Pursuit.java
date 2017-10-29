package com.sky.design.proxy;

public class Pursuit implements GiveGift  {

	SchoolGirl mm;
	private String name;
	public Pursuit(){
		
	}
	public Pursuit(SchoolGirl mm,String name) {
		this.mm = mm;
		this.name=name;
	}

	@Override
	public void GiveDolls() {
		System.out.println(name+"送"+mm.getName()+"洋娃娃");
		
	}

	@Override
	public void GiveFlowers() {
		System.out.println(name+"送"+mm.getName()+"送你花");
		
	}

	@Override
	public void GiveChocolate() {
		System.out.println(name+"送"+mm.getName()+"送你巧克力");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
