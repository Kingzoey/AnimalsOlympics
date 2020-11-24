package com.olympics.Multiton;

public class MultitionTest {
	public static void main(String[] args) {
		Referee mReferee = Referee.getInstance(0);
		System.out.println(mReferee.toString());
		mReferee = Referee.getInstance(1);
		System.out.println(mReferee.toString());
		mReferee = Referee.getInstance(2);
	}
}
