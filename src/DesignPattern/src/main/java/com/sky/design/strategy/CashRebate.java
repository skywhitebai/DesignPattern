package com.sky.design.strategy;

public class CashRebate extends CashSuper {

	private double moneyRebate=1;
	
	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}

	@Override
	public double acceptCash(double money) {
		return money*moneyRebate;
	}

}
