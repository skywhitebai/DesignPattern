package com.sky.design.abstractfactory;

public class Test {

	//工厂方法模式
	public static void main(String[] args) {
		User user=new User();
		IFactory iFactory=new SqlseverFactory();
		IUser iUser=iFactory.CreateUser();
		iUser.Insert(user);
		iUser.GetUser(1);
		
		Department department=new Department();
		IFactory iFactory2=new AccessFactory();
		IDepartment iDepartment=iFactory2.CreateDepartment();
		iDepartment.Insert(department);
		iDepartment.GetDepartment(1);
	}
	
	
	
}
