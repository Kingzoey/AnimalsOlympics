package com.olympics.strategy;

import com.olympics.staticfactory.BasketballPlayer;

/**
 * @className: Tactics
 * @author: Zhenyu Dong
 * @description: 在篮球场景中，球队所使用的战术采用策略模式进行设计。
 * @designPattern: Strategy
 * @date: 2020.11.10
 * @version: 1.0
 */

public interface Tactics {
    public void arrangeTactics(BasketballPlayer[] players);
}
