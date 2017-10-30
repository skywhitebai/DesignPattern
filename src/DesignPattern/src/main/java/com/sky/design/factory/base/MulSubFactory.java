package com.sky.design.factory.base;

public class MulSubFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		return new OperationAdd();
	}

}
