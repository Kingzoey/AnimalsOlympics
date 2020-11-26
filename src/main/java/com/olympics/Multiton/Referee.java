package com.olympics.Multiton;

import com.olympics.ChainOfResponsibility.Tiger;

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
	
	
	/*
	String Nam[] = null;
	Nam = new String[6];
	*/
	static String name[] = { "Tiger", "Lion", "Cat", "Dog", "Wolf", "Bear", "Monkey", "Chimpanzee", "Bull", "Goat",
			"Shark", "Dolphin", "Eagle", "Whale", "Horse", "Elephant", "Owl", "Duck", "Puma", "Fox", "Swordfish" };

	public static Referee getInstance(int num) {
		count = num;
		/*
		 * if (num == 0) { System.out.println("裁判数量添加中！"); return (Referee)
		 * refereeList.get(0); }else if(num == 1){ System.out.println("裁判数量添加中！");
		 * return (Referee) refereeList.get(1); }else if(num == 2){
		 * System.out.println("裁判数量添加中！"); return (Referee) refereeList.get(2); }else
		 * if(num == 3){ System.out.println("裁判数量已达到上限，无法继续添加！"); return (Referee)
		 * refereeList.get(3); }else{ System.out.println("裁判数量已超过上限！自动终止！"); return
		 * null; }
		 */
		Random random = new Random();
		int radom = 0;
		while (num < MAX) {
			radom = random.nextInt(20);
			String getname = name[radom];
			System.out.println("裁判数量添加中！添加裁判：" + getname );
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
