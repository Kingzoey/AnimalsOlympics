package com.olympics.informationnotice;

public interface Inform {
    void addAthlete(athlete player);

    void deAthlete(athlete player);

    void toNotify(String message);

}
