package com.sky.design.state;

//下午工作状态
public class AfternoonState extends State {

	@Override
	public void WriterProgram(Work work) {
		if(work.getHour()<17){
			System.out.println("当前时间:"+work.getHour()+"点，下午状态还不错，继续努力。");
		}
		else{
			work.setState(new EveningState());
			work.WriterProgram();
		}
	}

}
