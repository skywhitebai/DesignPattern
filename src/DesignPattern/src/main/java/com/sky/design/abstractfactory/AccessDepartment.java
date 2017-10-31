package com.sky.design.abstractfactory;

public class AccessDepartment implements IDepartment {

	@Override
	public void Insert(Department department) {
		System.out.println("在Access中给department表添加一条记录");
		
	}
	@Override
	public Department GetDepartment(int id) {
		System.out.println("在Access中根据id获取一条department记录");
		return null;
	}
	
}
