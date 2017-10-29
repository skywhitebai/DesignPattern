package com.sky.design.proxy;

public class Proxy extends Pursuit {


	Pursuit gg;
	public Proxy(SchoolGirl mm,String name) {
		gg=new Pursuit(mm,name);	
	}

	public void GiveDolls() {
		gg.GiveDolls();
		
	}

	public void GiveFlowers() {
		gg.GiveFlowers();
		
	}

	public void GiveChocolate() {
		gg.GiveChocolate();
		
	}
}
