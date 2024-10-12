package com.xworkz.sweets.runner;

import com.xworkz.sweets.boot.MysorePack;
import com.xworkz.sweets.boot.Peda;
import com.xworkz.sweets.boot.Sugar;
import com.xworkz.sweets.bridge.SweetInterface;

public class SweetRunner {

	public static void main(String[] args) {

		SweetInterface mysorepack = new MysorePack();

		SweetInterface peda = new Peda();

		Sugar sugar = new Sugar();
		
		peda.brand();
		peda.cost();
		peda.kiloGram();
		peda.sweetName();
		
		mysorepack.brand();
		mysorepack.cost();
		mysorepack.kiloGram();
		mysorepack.sweetName();
		
        sugar.setSweetInterface(peda);
        
        sugar.sweetInterface.brand();
        sugar.sweetInterface.cost();
        sugar.sweetInterface.kiloGram();
        sugar.sweetInterface.sweetName();
        
        sugar.setSweetInterface(mysorepack);
        
        sugar.sweetInterface.brand();
        sugar.sweetInterface.cost();
        sugar.sweetInterface.kiloGram();
        sugar.sweetInterface.sweetName();
        
        
	}

}
