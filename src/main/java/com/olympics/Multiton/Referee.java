package com.olympics.Multiton;

import java.util.ArrayList;
import java.util.Random;

/*
	一场比赛最多有两名裁判
*/

public class Referee {
	private static final int maxNumberOfReferee = 2;
	private static ArrayList refereeInfoList = new ArrayList(maxNumberOfReferee);
	private static ArrayList refereeList = new ArrayList(maxNumberOfReferee);
	
	private static int countNumofReferee = 0;
	
	static{
		for(int i = 0; i < maxNumberOfReferee ; i++){
			refereeList.add(new Referee("第"+i+"位裁判"));
		}
	}
	
	
	private Referee(){
		
	}
	
	private Referee(String info){
		refereeInfoList.add(info);
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
	        countNumofReferee=random.nextInt(maxNumberOfReferee);  
	        return (Referee)refereeList.get(countNumofReferee);  
	  }  
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (String) refereeInfoList.get(countNumofReferee);
	}
}

