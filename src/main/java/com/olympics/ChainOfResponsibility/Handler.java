package com.olympics.ChainOfResponsibility;

public interface Handler {
    /**
     * 每个运动员
     * @param segment 
     * @return 花费时间
     */
    float process(Segment segment);
}