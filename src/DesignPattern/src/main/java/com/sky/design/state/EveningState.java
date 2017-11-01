package com.sky.design.state;

public class EveningState extends State {

	@Override
	public void WriterProgram(Work work) {
		if(work.getTaskFinished()){
			work.setState(new RestState());
			work.WriterProgram();
		}
		else{
			if(work.getHour()<21){
				System.out.println("当前时间:"+work.getHour()+"点，加班哦，疲惫至极。");
			}
			else{
				work.setState(new SleepingState());
				work.WriterProgram();
			}
		}
		
	}

}
