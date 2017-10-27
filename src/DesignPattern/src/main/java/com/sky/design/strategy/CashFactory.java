package com.sky.design.strategy;

public class CashFactory {
	public static CashSuper createCashAccept(String type){

		CashSuper cashSuper;
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
		return cashSuper;
	}
	
}
