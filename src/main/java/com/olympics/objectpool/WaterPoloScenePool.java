/*
 * @Project : AnimalsOlympics
 * @File    : WaterPoloScenePool.java
 * @Author  : 刘文朔(liuwenshuo2000@126.com)
 * @Software: IntelliJ IDEA
 */

package com.olympics.objectpool;

public class WaterPoloScenePool extends ObjectPool<SwimmingPool> {
    public WaterPoloScenePool() {
        super();
        unlocked.add(new SwimmingPool(SwimmingPoolType.Sea));
        unlocked.add(new SwimmingPool(SwimmingPoolType.Lake));
        unlocked.add(new SwimmingPool(SwimmingPoolType.River));
        unlocked.add(new SwimmingPool(SwimmingPoolType.Pool));
    }

    @Override
    protected SwimmingPool create() {
        return new SwimmingPool(SwimmingPoolType.Pool);
    }
}
