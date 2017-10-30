package com.sky.design.factory.base;

public class OperationDiv extends Operation {

	@Override
	public double GetResult() throws Exception {
		double result=0;
		if(getNumberB()==0){
			throw new Exception("除数不能为0");
		}
		result=getNumberA()/getNumberB();
		return result;
	}

}
