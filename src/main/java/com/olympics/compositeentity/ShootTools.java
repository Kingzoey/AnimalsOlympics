package com.olympics.compositeentity;

/**
 * 射击比赛使用的工具套装
 */
public class ShootTools {
    private final Gun gun = new Gun();
    private final Bullet bullet = new Bullet();

    public void setData(float gunSize, int bulletCount) {
        gun.setSize(gunSize);
        bullet.setCount(bulletCount);
    }

    public Object[] getData() {
        return new Object[]{gun.getSize(), bullet.getCount()};
    }
}
