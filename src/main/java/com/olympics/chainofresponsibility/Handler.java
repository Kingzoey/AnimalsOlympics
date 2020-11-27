package com.olympics.chainofresponsibility;

public interface Handler {
    /**
     * 每个运动员
     *
     * @param segment some argument
     * @return 花费时间
     */
    float process(Segment segment);
}
