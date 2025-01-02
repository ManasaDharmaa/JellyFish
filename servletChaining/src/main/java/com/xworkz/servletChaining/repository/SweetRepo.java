package com.xworkz.servletChaining.repository;

import com.xworkz.servletChaining.dto.Sweetdto;

import java.util.Collections;
import java.util.List;

public interface SweetRepo {

    void save(Sweetdto sweetdto);

    default List<Sweetdto> getAll(){
        return Collections.emptyList();
    }
}
