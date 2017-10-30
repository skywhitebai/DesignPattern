package com.sky.design.prototype;

public class Resume {

	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	
	public Resume(String name){
		this.name=name;
	}
	//设置个人信息
	public void SetPersonInfo(String sex,String age){
		this.sex=sex;
		this.age=age;
	}
	//设置工作经验
	public void SetWorkExperience(String timeArea,String company){
		this.timeArea=timeArea;
		this.company=company;
	}
	//显示
	public void Display(){
		System.out.println(name+sex+age);
		System.out.println("工作经历："+timeArea+company);
	}
	
}
