package com.sky.design.state;

public class RestState extends State {

	@Override
	public void WriterProgram(Work work) {
		System.out.println("当前时间:"+work.getHour()+"点，任务完成，好好休息。");
	}

}
