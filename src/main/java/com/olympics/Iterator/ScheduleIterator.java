package com.olympics.Iterator;

/**
 * 比赛迭代器
 */
public class ScheduleIterator implements Iterator {

    private Schedule Schedule;
    private int index;

    public ScheduleIterator(Schedule Schedule){
        this.Schedule = Schedule;
        this.index = 0;
    }

    /**
     * 检测是否还有下一比赛
     * @return
     */
    @Override
    public boolean hasNext() {
        if(index<Schedule.getLength()){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 返回下一比赛
     * @return
     */
    @Override
    public Object next() {
        Match Match = Schedule.getMatchAt(index);
        index++;
        return Match;
    }
}