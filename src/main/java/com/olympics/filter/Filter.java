package com.olympics.filter;

import java.util.List;

public interface Filter {

    List<Sporter> filter(List<Sporter> sportersses);

}