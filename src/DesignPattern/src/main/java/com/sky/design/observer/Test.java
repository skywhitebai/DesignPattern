package com.sky.design.observer;

public class Test {

	public static void main(String[] args) {
		Subject huhansan =new Boss();
		huhansan.setSubjectState("我胡汉三回来了");
		Observer tongshi1=new StockObserver("张三", huhansan);
		Observer tongshi2=new GameObserver("李四", huhansan);
		Observer tongshi3=new GameObserver("马六", huhansan);
		huhansan.Attach(tongshi1);
		huhansan.Attach(tongshi1);
		huhansan.Attach(tongshi2);
		huhansan.Attach(tongshi3);
		huhansan.Detach(tongshi3);
		huhansan.Notify();
	}
}
