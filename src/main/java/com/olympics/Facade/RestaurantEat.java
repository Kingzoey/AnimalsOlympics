package com.olympics.Facade;

//前台子系统实例
public class RestaurantEat implements Restaurant {

	@Override
	public void Eating() {
		System.out.println(this.getClass() + " : " + "Eating" + " : " + "Customer eating");
		
	}

}
