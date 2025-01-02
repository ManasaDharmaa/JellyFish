package com.xworkz.servletChaining.impl;

import com.xworkz.servletChaining.dto.Cricketdto;
import com.xworkz.servletChaining.repository.CricketRepo;
import com.xworkz.servletChaining.repository.CricketRepoImpl;
import com.xworkz.servletChaining.service.CricketService;

import java.util.List;


public class CricketServiceImpl implements CricketService {

   private CricketRepo cricketRepo = new CricketRepoImpl();
    @Override
    public boolean save(Cricketdto cricketdto) {
        cricketRepo.save(cricketdto);
        return true;
    }

    @Override
    public List<Cricketdto> getAll() {

        System.out.println("running cricket get all");
        return cricketRepo.getAll();
    }
}
