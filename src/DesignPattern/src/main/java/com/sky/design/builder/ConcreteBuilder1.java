package com.sky.design.builder;

//具体建造者类
public class ConcreteBuilder1 extends Builder {

	private Product product=new Product();
	@Override
	public void BuilderPartA() {
		product.add("部件A");
	}

	@Override
	public void BuilderPartB() {
		product.add("部件B");		
	}

	@Override
	public Product GetResult() {
		return product;	
	}
	

}
