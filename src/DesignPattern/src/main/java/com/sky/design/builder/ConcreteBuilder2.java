package com.sky.design.builder;

//具体建造者类
public class ConcreteBuilder2 extends Builder {

	private Product product=new Product();
	@Override
	public void BuilderPartA() {
		product.add("部件X");
	}

	@Override
	public void BuilderPartB() {
		product.add("部件Y");		
	}

	@Override
	public Product GetResult() {
		return product;	
	}
	

}
