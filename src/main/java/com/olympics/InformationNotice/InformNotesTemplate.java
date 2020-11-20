package com.olympics.InformationNotice;

public abstract class InformNotesTemplate {
 
    abstract void startInform();
    abstract void endInform();

    //模板
    public final void play(){
      
        
        startInform();
        
        endInform();
    }

}
