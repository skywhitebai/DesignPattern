package com.sky.design.abstractfactory;

public class SqlseverDepartment implements IDepartment {
	@Override
	public void Insert(Department department) {
		System.out.println("在sqlsever中给department表添加一条记录");
	}
	@Override
	public Department GetDepartment(int id) {
		System.out.println("在sqlsever中根据id获取一条department记录");
		return null;
	}
	
}
