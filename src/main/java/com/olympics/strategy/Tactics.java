package com.olympics.strategy;

import com.olympics.staticfactory.BasketballPlayer;

/**
 * 在篮球场景中，球队所使用的战术采用策略模式进行设计。
 *
 * @author Zhenyu Dong
 * @version 1.0
 * @designPattern Strategy
 * @date 2020.11.10
 */

public interface Tactics {
    void arrangeTactics(BasketballPlayer[] players);
}
