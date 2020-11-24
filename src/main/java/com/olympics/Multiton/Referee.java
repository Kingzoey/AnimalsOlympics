package com.olympics.Multiton;

import java.util.ArrayList;
import java.util.Random;

/*
	一场比赛最多有两名裁判
*/

public class Referee {
	private static final int MAX = 2;
	private static ArrayList refereeInfo = new ArrayList(MAX);
	private static ArrayList refereeList = new ArrayList(MAX);
	
	private static int countNumofReferee = 0;
	
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
		countNumofReferee = num;
		if (num == 0) {
			return (Referee) refereeList.get(0);
		}else if(num == 1){
			return (Referee) refereeList.get(1);
		}else{
			System.out.println("裁判过多！");
			return null;
		}
	}
	
	  public static Referee getInstance(){  
	        Random random=new Random();  
	        countNumofReferee=random.nextInt(MAX);  
	        return (Referee)refereeList.get(countNumofReferee);  
	  }  
	
	@Override
	public String toString() {
		return (String) refereeInfo.get(countNumofReferee);
	}
}

