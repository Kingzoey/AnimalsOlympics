package com.olympics.multiton;

public class MultitonTest {
	public static void main(String[] args) {
		System.out.println("比赛即将开始，生成本场比赛裁判！");
		Referee mReferee = Referee.getInstance(0);
		System.out.println(mReferee.toString());
		mReferee = Referee.getInstance(1);
		System.out.println(mReferee.toString());
		mReferee = Referee.getInstance(2);
		System.out.println(mReferee.toString());
		mReferee = Referee.getInstance(3);
		System.out.println(mReferee.toString());
		mReferee = Referee.getInstance(4);
	}
}
