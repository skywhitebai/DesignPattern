package com.sky.design.builder;

import java.util.ArrayList;
import java.util.List;

//产品类
public class Product {

	List<String> parts=new ArrayList<String>();
	public void add(String part){
		parts.add(part);
	}
	public void Show(){
		System.out.println("产品 创建--");
		 for (String part : parts) {
			System.out.println(part);
		}
	}
}
