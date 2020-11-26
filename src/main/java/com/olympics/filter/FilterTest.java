package com.olympics.filter;
import java.util.List;
import java.util.LinkedList;
public class FilterTest {
    public static void main(String[] args) {
        List<Sporters> Sporterss = new LinkedList<>();


         for (int i = 0; i < 10 ; i++) {
                if (i<5) {
                    Sporterss.add(new Sporters(String.valueOf(i), "男"));
                }else {
                    Sporterss.add(new Sporters(String.valueOf(i), "女"));
                }
            }


         Filter boyFilter = new BoyFilter();
        //筛选出男同胞们
         Sporterss = boyFilter.filter(Sporterss);
         Sporterss.forEach(Sporters->System.out.println(Sporters.toString()));


    }


}