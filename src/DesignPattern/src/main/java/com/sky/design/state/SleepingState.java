package com.sky.design.state;

public class SleepingState extends State {

	@Override
	public void WriterProgram(Work work) {
		System.out.println("当前时间:"+work.getHour()+"点，不行了，睡着了。");
	}

}
