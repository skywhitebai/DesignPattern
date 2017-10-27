package com.sky.design.strategy;

public class Test {

	//简单工厂模式
	public static void main(String[] args) {
		CashSuper cashSuper;
		cashSuper=CashFactory.createCashAccept("正常收费");
		System.out.println(cashSuper.acceptCash(800));
		cashSuper=CashFactory.createCashAccept("满300返100");
		System.out.println(cashSuper.acceptCash(800));
		cashSuper=CashFactory.createCashAccept("打8折");
		System.out.println(cashSuper.acceptCash(800));
		cashSuper=CashFactory.createCashAccept("");
		System.out.println(cashSuper.acceptCash(800));
	}
	public static void main2(String[] args) {
		CashContext cashContext;
		//策略与简单工厂结合
		cashContext=new CashContext("正常收费");
		System.out.println(cashContext.GetResult(800));
		cashContext=new CashContext("满300返100");
		System.out.println(cashContext.GetResult(800));
		cashContext=new CashContext("打8折");
		System.out.println(cashContext.GetResult(800));
		cashContext=new CashContext("");
		System.out.println(cashContext.GetResult(80000));
	}
	public static void main1(String[] args) {
		CashContext cashContext;
		//策略
		cashContext=new CashContext(new CashNormal());
		System.out.println(cashContext.GetResult(800));
		cashContext=new CashContext(new CashRebate(0.8));
		System.out.println(cashContext.GetResult(800));
		cashContext=new CashContext(new CashReturn(700,200));
		System.out.println(cashContext.GetResult(800));
	}
}
