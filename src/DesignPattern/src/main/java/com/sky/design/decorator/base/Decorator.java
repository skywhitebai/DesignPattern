package com.sky.design.decorator.base;

public abstract class Decorator extends Component{

	protected Component component;
	public void SetComponent(Component component){
		this.component=component;
	}
	
	public void Operation(){
		if(component!=null){
			component.Operation();
		}
	}
}
