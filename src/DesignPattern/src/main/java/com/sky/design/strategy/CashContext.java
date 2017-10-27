package com.sky.design.strategy;

public class CashContext {

	private CashSuper cashSuper;
	//策略
	public CashContext(CashSuper cashSuper){
		this.cashSuper=cashSuper;
	}
	//策略与简单工厂结合
	public CashContext(String type){
		switch (type) {
		case "正常收费":
			cashSuper=new CashNormal();
			break;
		case "满300返100":
			cashSuper=new CashReturn(300, 100);
			break;
		case "打8折":
			cashSuper=new CashRebate(0.8);
			break;
			default:cashSuper=new CashNormal();break;
		}
	}
	public double GetResult(double money){
		return cashSuper.acceptCash(money);
	}
	
}
