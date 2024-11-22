package com.xworkz.tryBlocks.runner;

import com.xworkz.tryBlocks.boot.DairyProduct;
import com.xworkz.tryBlocks.dto.DairyProductDto;
import com.xworkz.tryBlocks.event.CurdException;
import com.xworkz.tryBlocks.event.DairyProductException;

public class DairyProductRunner {

    public static void main(String[] args) {

        DairyProductDto dairyProductDto = new DairyProductDto("mmb cmnsz", 30000, "sndkszdnc", 300);

        DairyProduct dairyProduct = new DairyProduct();
        try {
            dairyProduct.milk(dairyProductDto);
        } catch (DairyProductException e){
            e.getMessage();
        }

        System.err.println("this is try catch ");

        try {
            dairyProduct.curd(dairyProductDto);
        } catch (CurdException e){
            e.getMessage();
        } catch (DairyProductException e) {
            throw new RuntimeException(e);
        } finally {
            System.err.println("this is try catch catch finally");
        }

        dairyProduct.butter(dairyProductDto);
        System.err.println("this is try catch catch");

        try {
            dairyProduct.ghee(dairyProductDto);
        } catch (DairyProductException e) {
            throw new RuntimeException(e);
        } finally {
            System.err.println("this is try catch finally");
        }

    }
}
