package com.xworkz.servletChaining.repository;

import com.xworkz.servletChaining.dto.Musuemdto;

import java.util.Collections;
import java.util.List;

public interface MusuemRepo {

    void save(Musuemdto musuemdto);

    default List<Musuemdto> getAll(){
        return Collections.emptyList();
    }
}
