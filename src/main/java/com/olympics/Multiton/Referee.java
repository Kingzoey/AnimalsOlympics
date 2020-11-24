package com.olympics.Multiton;

import java.util.ArrayList;
import java.util.Random;

/*
	一场比赛最多有两名裁判
*/

public class Referee {
	private static final int MAX = 2;
	
	// 动态数组存储裁判信息和列表
	private static ArrayList refereeInfo = new ArrayList(MAX);
	private static ArrayList refereeList = new ArrayList(MAX);
	
	private static int count = 0;
	
	static{
		for(int i = 0; i < MAX ; i++){
			refereeList.add(new Referee("第" + i + "位裁判"));
		}
	}
	
	private Referee(){
		
	}
	
	private Referee(String info){
		refereeInfo.add(info);
	}
	
	public static Referee getInstance(int num){
		count = num;
		if (num == 0) {
			return (Referee) refereeList.get(0);
		}else if(num == 1){
			return (Referee) refereeList.get(1);
		}else{
			System.out.println("裁判数量已超过上限！");
			return null;
		}
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
