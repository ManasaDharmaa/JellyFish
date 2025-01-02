package com.xworkz.servletChaining.impl;

import com.xworkz.servletChaining.dto.Milkdto;
import com.xworkz.servletChaining.repository.MilkRepo;
import com.xworkz.servletChaining.repository.MilkRepoImpl;
import com.xworkz.servletChaining.service.MilkService;

import java.util.List;

public class MilkServiceImpl implements MilkService{




    private MilkRepo milkRepo = new MilkRepoImpl();


        @Override
        public boolean save(Milkdto milkdto) {
            milkRepo.save(milkdto);
            return true;
        }

        @Override
        public List<Milkdto> getAll() {
            System.out.println("running getAll in milk service impl.....!");
            return milkRepo.getAll();
        }
    }


