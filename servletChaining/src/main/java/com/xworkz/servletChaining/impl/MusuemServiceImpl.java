package com.xworkz.servletChaining.impl;

import com.xworkz.servletChaining.dto.Musuemdto;
import com.xworkz.servletChaining.repository.MusuemRepo;
import com.xworkz.servletChaining.repository.MusuemRepoImpl;
import com.xworkz.servletChaining.service.MusuemService;

import java.util.List;

public class MusuemServiceImpl implements MusuemService {

    private MusuemRepo musuemRepo = new MusuemRepoImpl();

    @Override
    public boolean save(Musuemdto musuemdto) {
        musuemRepo.save(musuemdto);
        return true;
    }

    @Override
    public List<Musuemdto> getAll() {
        System.out.println("running musuem service ");
        return musuemRepo.getAll();
    }
}
