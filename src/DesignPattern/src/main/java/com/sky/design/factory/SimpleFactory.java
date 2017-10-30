package com.sky.design.factory;

public class SimpleFactory {

	public static LeiFeng CreateLeiFeng(String type){
		LeiFeng leifeng=null;
		switch(type){
		case "学雷锋的大学生":
			leifeng=new Undergraduate();
			break;
		case "社区志愿者":
			leifeng=new Undergraduate();
			break;
		}
		return leifeng;
	}
}
