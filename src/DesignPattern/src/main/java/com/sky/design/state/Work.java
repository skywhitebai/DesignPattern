package com.sky.design.state;

public class Work {

	private int hour;

	public Work(){
		this.state=new ForenoonState();
	}
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	private State state;

	public void WriterProgram() {
		state.WriterProgram(this);
	}
	
	public boolean getTaskFinished() {
		return taskFinished;
	}

	public void setTaskFinished(boolean taskFinished) {
		this.taskFinished = taskFinished;
	}
	private boolean taskFinished;
}
