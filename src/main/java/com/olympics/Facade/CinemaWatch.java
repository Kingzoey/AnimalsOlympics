package com.olympics.Facade;

//电影院
public class CinemaWatch implements Cinema{

	@Override
	public void Watching() {
		System.out.println(this.getClass() + " : " + "Watching" + " : " + "Cinema watching");	
	}

}
