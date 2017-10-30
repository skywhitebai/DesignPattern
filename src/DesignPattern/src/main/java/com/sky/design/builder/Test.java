package com.sky.design.builder;

public class Test {

	public static void main(String[] args) {
		Director director=new Director();
		ConcreteBuilder1 builder1=new ConcreteBuilder1();
		ConcreteBuilder2 builder2=new ConcreteBuilder2();
		director.Construct(builder1);
		Product product=builder1.GetResult();
		product.Show();
		director.Construct(builder2);
		product=builder2.GetResult();
		product.Show();
	}
}
