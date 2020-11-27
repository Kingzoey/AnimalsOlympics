package com.olympics.facade;

//商场
public class Market {
    private Restaurant restaurant = new RestaurantEat();
    private Shelves shelves = new ShelvesBuy();
    private Cinema cinema = new CinemaWatch();

    //吃东西
    public void Eating() {
        restaurant.Eating();
    }

    //买商品
    public void Buying() {
        shelves.Buying();
    }

    //看电影
    public void Watching() {
        cinema.Watching();
    }
}
