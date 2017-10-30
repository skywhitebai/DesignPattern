package com.sky.design.builder;

public class Director {

	public void Construct(Builder builder){
		builder.BuilderPartA();
		builder.BuilderPartB();
	}
}
