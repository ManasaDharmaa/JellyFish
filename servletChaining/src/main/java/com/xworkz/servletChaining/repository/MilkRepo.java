package com.xworkz.servletChaining.repository;

import com.xworkz.servletChaining.dto.Milkdto;

import java.util.Collections;
import java.util.List;

public interface MilkRepo {

    boolean save(Milkdto milkdto);

    default List<Milkdto> getAll(){
        return Collections.emptyList();
    }
}
