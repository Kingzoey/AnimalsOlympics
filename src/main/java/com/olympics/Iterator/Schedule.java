package com.olympics.Iterator;

public class Schedule implements Aggregate{

    private Match[] Matchs;

    private int last = 0;

    public Schedule(int maxSize){
        this.Matchs = new Match[maxSize];
    }

    /**
     * 获得比赛
     * @param index
     * @return
     */
    public Match getMatchAt(int index){

        return Matchs[index];

    }

    /**
     * 添加比赛
     * @param Match
     */
    public void appendMatch(Match Match){
        this.Matchs[last] = Match;
        last++;
    }

    /**
     * 获得赛程表上的比赛数量
     * @return
     */
    public int getLength(){
        return Matchs.length;
    }

    /**
     * 获得比赛迭代器对象
     * @return
     */
    @Override
    public Iterator iterator(){
        return new ScheduleIterator(this);
    }
}