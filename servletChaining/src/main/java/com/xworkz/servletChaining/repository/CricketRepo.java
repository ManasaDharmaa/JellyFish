package com.xworkz.servletChaining.repository;

import com.xworkz.servletChaining.dto.Cricketdto;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface CricketRepo {

    boolean save(Cricketdto cricketdto);

    default List<Cricketdto> getAll(){
        return  Collections.emptyList();
    }
}
