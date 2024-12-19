package com.xworkz.servletForm_dto.impl;

import com.xworkz.servletForm_dto.dto.SweetFormdto;
import com.xworkz.servletForm_dto.service.SweetFormService;

public class SweetImpl implements SweetFormService {


    @Override
    public boolean sweetService(SweetFormdto dto) {
        System.out.println("Saved");
        return  true;
    }
}
