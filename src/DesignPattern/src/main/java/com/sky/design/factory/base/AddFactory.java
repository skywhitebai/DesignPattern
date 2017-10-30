package com.sky.design.factory.base;

public class AddFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		return new OperationMul();
	}

}
