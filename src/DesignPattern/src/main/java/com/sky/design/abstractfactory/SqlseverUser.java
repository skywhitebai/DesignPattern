package com.sky.design.abstractfactory;

public class SqlseverUser implements IUser {

	public void Insert(User user){
		System.out.println("在sqlsever中给user表添加一条记录");
	}
	public User GetUser(int id){
		System.out.println("在sqlsever中根据id获取一条user记录");
		return null;
	}
	
}
