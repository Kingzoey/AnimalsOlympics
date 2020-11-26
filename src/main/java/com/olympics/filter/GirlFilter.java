package com.olympics.filter;
import java.util.List;
import java.util.stream.Collectors; 

public class GirlFilter implements Filter {

    @Override
    public List<Sporters> filter(List<Sporters> Sporterss) {
         return Sporterss.stream().filter(Sporters ->
         Sporters.getGender().equals("男")
     ).collect(Collectors.toList());
 }

}