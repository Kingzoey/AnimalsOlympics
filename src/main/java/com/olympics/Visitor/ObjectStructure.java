package com.olympics.Visitor;

import java.util.ArrayList;
import java.util.Date;

public class ObjectStructure {
    private final ArrayList<Element> elemList = new ArrayList<>();

    public void add(Element element){
        elemList.add(element);
    }
    
    public void remove(Element element){
        elemList.remove(element);
    }

    public void accept(Visitor visitor){
        for (Element element : elemList) {
            element.accept(visitor);
        }
    }

    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new Consumable("Water",new Date(2020,11,22),1));
        os.add(new Consumable("Juice",new Date(2020,11,23),2));
        os.add(new Equipment("Football",new Date(2006,2,1),"A"));
        os.add(new Equipment("Football",new Date(2020,1,1),"B"));
        
        Visitor manager = new Manager();
        Visitor athlete = new Athlete();
        os.accept(manager);
        os.accept(athlete);
    }
}
