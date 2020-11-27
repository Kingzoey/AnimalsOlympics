package com.olympics.filter;

import java.util.List;
import java.util.stream.Collectors;

public class GirlFilter implements Filter {

    @Override
    public List<Sporter> filter(List<Sporter> sportersses) {
        return sportersses.stream().filter(Sporter ->
            Sporter.getGender().equals("男")
        ).collect(Collectors.toList());
    }

}