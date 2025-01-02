package com.xworkz.servletChaining.service;

import com.xworkz.servletChaining.dto.Musuemdto;

import java.util.Collections;
import java.util.List;

public interface MusuemService {

     boolean save(Musuemdto musuemdto);

     default List<Musuemdto> getAll(){
          return Collections.emptyList();
     }

}
