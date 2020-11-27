package com.olympics.visitor;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectStructure {
    private final ArrayList<Element> elemList = new ArrayList<>();

    public void add(Element element) {
        elemList.add(element);
    }

    public void remove(Element element) {
        elemList.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elemList) {
            element.accept(visitor);
        }
    }

    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new Consumable("Water", new GregorianCalendar(2020, Calendar.DECEMBER, 22), 1));
        os.add(new Consumable("Juice", new GregorianCalendar(2020, Calendar.DECEMBER, 23), 2));
        os.add(new Equipment("Football", new GregorianCalendar(2006, Calendar.MARCH, 1), "A"));
        os.add(new Equipment("Football", new GregorianCalendar(2020, Calendar.FEBRUARY, 1), "B"));

        Visitor manager = new Manager();
        Visitor athlete = new Athlete();
        os.accept(manager);
        os.accept(athlete);
    }
}
