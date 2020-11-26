package com.olympics.CompositeEntity;

public class ShootPlayer {
    private final ShootTools shootTools = new ShootTools();

    public void printData() {
        for (Object object : shootTools.getData()) {
            System.out.print(object.toString() + " ");
        }
        System.out.println();
    }

    public void setData(float size, int count) {
        shootTools.setData(size, count);
    }

}
