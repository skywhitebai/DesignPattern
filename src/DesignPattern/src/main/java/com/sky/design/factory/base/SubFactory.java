package com.sky.design.factory.base;

public class SubFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		return new OperationAdd();
	}

}
