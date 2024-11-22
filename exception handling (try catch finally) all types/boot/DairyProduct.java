package com.xworkz.tryBlocks.boot;

import com.xworkz.tryBlocks.dto.DairyProductDto;
import com.xworkz.tryBlocks.event.CurdException;
import com.xworkz.tryBlocks.event.DairyProductException;

import java.sql.SQLOutput;
import java.util.Locale;

public class DairyProduct {



    public void milk(DairyProductDto dairyProductDto) throws DairyProductException{
        int cost = dairyProductDto.getCost();

      if(cost > 1500){

         throw new DairyProductException();
      } else {
          System.out.println("valid information");
      }

    }
    public void curd(DairyProductDto dairyProductDto)throws DairyProductException{
        int item = dairyProductDto.getTotalItems();
       try {
           if (item > 5) {
               System.out.println("you a disscount for this items");
           } else if (item < 0){
               throw new DairyProductException();
           } else {
               throw new CurdException();
           }
       }catch (CurdException | DairyProductException e){
               e.getMessage();
       } finally {
           System.err.println("this is try catch(a | b) finally");
       }

    }
    public void butter(DairyProductDto dairyProductDto){
        int cost = dairyProductDto.getCost();


        try {
            if (cost > 40) {
                System.out.println("cost is low");
            } else if (cost < 0) {

                throw new CurdException();
            } else {
                throw new DairyProductException();
            }
        } catch (DairyProductException e) {
            e.getMessage();
        } catch (CurdException e) {
            e.getMessage();
        }
    }

    public void ghee(DairyProductDto dairyProductDto) throws DairyProductException{
        int item = dairyProductDto.getTotalItems();

        try{
            if(item > 5){
                System.out.println("you got discount");
            } else {
                throw new DairyProductException();
            }
        } finally {
            System.err.println("this is try  finally");
        }
    }
}
