package com.xworkz.servletChaining.service;

import com.xworkz.servletChaining.dto.Sweetdto;

import java.util.Collections;
import java.util.List;

public interface SweetService {

    boolean save(Sweetdto sweetdto);

    default List<Sweetdto> getAll(){
        return Collections.emptyList();
    }
}
