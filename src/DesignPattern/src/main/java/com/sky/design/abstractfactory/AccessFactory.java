package com.sky.design.abstractfactory;

public class AccessFactory implements IFactory {

	@Override
	public IUser CreateUser() {
		return new AccessUser();
	}

	@Override
	public IDepartment CreateDepartment() {
		return new AccessDepartment();	
	}

}
