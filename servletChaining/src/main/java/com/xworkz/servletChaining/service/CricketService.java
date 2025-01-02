package com.xworkz.servletChaining.service;

import com.xworkz.servletChaining.dto.Cricketdto;

import java.util.Collections;
import java.util.List;

public interface CricketService {

    boolean save(Cricketdto cricketdto);

    default List<Cricketdto> getAll(){
        return Collections.emptyList();
    }
}
