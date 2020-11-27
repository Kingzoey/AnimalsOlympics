package com.olympics.facade;

//餐厅
public class RestaurantEat implements Restaurant {
    @Override
    public void Eating() {
        System.out.println(this.getClass() + " : " + "吃东西" + " - " + "餐厅用餐中");
    }
}
