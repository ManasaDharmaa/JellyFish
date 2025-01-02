package com.xworkz.servletChaining.service;

import com.xworkz.servletChaining.dto.Milkdto;
import lombok.Builder;

import java.util.Collections;
import java.util.List;

public interface MilkService {

    boolean save(Milkdto milkdto);

    default List<Milkdto> getAll(){
        return Collections.emptyList();
    }
}
