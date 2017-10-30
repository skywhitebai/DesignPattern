package com.sky.design.template;

public abstract class TestPaper {

	public void TestQuestion1(){
		System.out.println("杨过得到，后来给了郭靖，炼成倚天剑、屠龙刀的玄铁可能是【】 a.球磨铸铁 b.马口铁 c.高速合金钢 d.碳素纤维");	
		System.out.println("答案："+Answer1());
	}
	public void TestQuestion2(){
		System.out.println("杨过、程英、陆无双铲除了情花，造成【】 a.使这种植物不再害人  b.使一种珍贵物种灭绝  c.破坏了那个生态圈的生态平衡  d.造成该地区沙漠化");	
		System.out.println("答案："+Answer2());
	}
	public void TestQuestion3(){
		System.out.println("蓝凤凰致使华山师徒、桃谷六仙呕吐不止，如果你是大夫，会给他们开什么药【】 a.阿司匹林  b.牛黄解毒片  c.氟哌酸  d.让他们喝大量的生牛奶 e.以上都不对");	
		System.out.println("答案："+Answer3());
	}
	
	public abstract String Answer1();
	public abstract String Answer2();
	public abstract String Answer3();
}
