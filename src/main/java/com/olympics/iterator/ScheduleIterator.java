package com.olympics.iterator;

/**
 * 比赛迭代器
 */
public class ScheduleIterator implements Iterator {

    private Schedule Schedule;
    private int index;

    public ScheduleIterator(Schedule Schedule) {
        this.Schedule = Schedule;
        this.index = 0;
    }

    /**
     * 检测是否还有下一比赛
     *
     * @return some object
     */
    @Override
    public boolean hasNext() {
        return index < Schedule.getLength();
    }

    /**
     * 返回下一比赛
     *
     * @return some object
     */
    @Override
    public Object next() {
        Match Match = Schedule.getMatchAt(index);
        index++;
        return Match;
    }
}