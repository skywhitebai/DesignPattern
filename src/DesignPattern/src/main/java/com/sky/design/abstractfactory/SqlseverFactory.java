package com.sky.design.abstractfactory;

public class SqlseverFactory implements IFactory {

	@Override
	public IUser CreateUser() {
		return new SqlseverUser();
	}

	@Override
	public IDepartment CreateDepartment() {
		return new SqlseverDepartment();		
	}

}
