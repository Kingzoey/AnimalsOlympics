package com.olympics.eventsQuery;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        ISpecification spec1 = new BizSpecification("aaa");
        ISpecification spec2 = new BizSpecification("aaa");
        for(Object obj:list){
            if(spec1.and(spec2).isSatisfiedBy(obj)){
                System.out.println(obj);
            }
        }
    }
}
