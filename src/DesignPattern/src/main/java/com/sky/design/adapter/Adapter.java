package com.sky.design.adapter;

//适配器，通过内部包装一个Adaptee对象，把源接口转换为目标接口
public class Adapter extends Target {

	private Adaptee adaptee=new Adaptee();
	public void Request(){
		adaptee.SpecificRequest();
	}
}
