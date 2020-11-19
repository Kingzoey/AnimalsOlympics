package com.olympics.InformationNotice;

public abstract class InformNotes {
    abstract void initialize();
    abstract void startInform();
    abstract void endInform();

    //模板
    public final void play(){
        
        initialize();
        
        startInform();
        
        endInform();
    }

}
