package com.olympics.facade;

//厨房子系统实例
public class ShelvesBuy implements Shelves {
    @Override
    public void Buying() {
        System.out.println(this.getClass() + " : " + "买商品" + " - " + "货架购物中");
    }
}
