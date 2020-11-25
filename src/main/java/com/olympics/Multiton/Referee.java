package com.olympics.Multiton;

import java.util.ArrayList;
import java.util.Random;

// 一场比赛最多有四名裁判

public class Referee {
	private static final int MAX = 4;
	
	// 动态数组存储裁判信息和列表
	private static ArrayList refereeInfo = new ArrayList(MAX);
	private static ArrayList refereeList = new ArrayList(MAX);
	
	private static int count = 0;
	
	static{
		for(int i = 0; i < MAX ; i++){
			refereeList.add(new Referee("第" + (i + 1) + "位裁判"));
		}
	}
	
	private Referee(){
		
	}
	
	private Referee(String info){
		refereeInfo.add(info);
	}
	
	public static Referee getInstance(int num){
		count = num;
		/*
		if (num == 0) {
			System.out.println("裁判数量添加中！");
			return (Referee) refereeList.get(0);
		}else if(num == 1){
			System.out.println("裁判数量添加中！");
			return (Referee) refereeList.get(1);
		}else if(num == 2){
			System.out.println("裁判数量添加中！");
			return (Referee) refereeList.get(2);
		}else if(num == 3){
			System.out.println("裁判数量已达到上限，无法继续添加！");
			return (Referee) refereeList.get(3);
		}else{
			System.out.println("裁判数量已超过上限！自动终止！");
			return null;
		}
		*/
		while(num < MAX)
		{
			System.out.println("裁判数量添加中！");
			return (Referee) refereeList.get(num);
		}
		System.out.println("裁判数量已超过上限！自动终止！");
		return null;
	}
	
	  public static Referee getInstance(){  
	        Random random = new Random();  
	        count = random.nextInt(MAX);  
	        return (Referee)refereeList.get(count);  
	  }  
	
	@Override
	public String toString() {
		return (String) refereeInfo.get(count);
	}
}
