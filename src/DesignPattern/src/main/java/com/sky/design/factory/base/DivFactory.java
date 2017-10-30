package com.sky.design.factory.base;

public class DivFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		return new OperationDiv();
	}

}
