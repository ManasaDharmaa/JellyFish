package com.xworkz.servletChaining.impl;

import com.xworkz.servletChaining.dto.Sweetdto;
import com.xworkz.servletChaining.repository.SweetRepo;
import com.xworkz.servletChaining.repository.SweetRepoImpl;
import com.xworkz.servletChaining.service.SweetService;

import java.util.List;


public class SweetServiceImpl implements SweetService {

    private SweetRepo sweetRepo = new SweetRepoImpl();
    @Override
    public boolean save(Sweetdto sweetdto) {

        System.out.println("Sweet service impl");
        sweetRepo.save(sweetdto);
        return true;
    }

    @Override
    public List<Sweetdto> getAll() {
        System.out.println("running get all service  imp");
        return sweetRepo.getAll();
    }
}
