package com.olympics.filter;

import java.util.List;
import java.util.stream.Collectors;

public class BoyFilter implements Filter {

    @Override
    public List<Sporter> filter(List<Sporter> sporters) {
        return sporters.stream().filter(Sporter ->
            Sporter.getGender().equals("男")
        ).collect(Collectors.toList());
    }

}
