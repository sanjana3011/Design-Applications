package service;

import common.*;

public class AppInitializor {
	
	
	public static void main(String args[])
	{
		Inventory inventoryService=new Inventory();
		GuitarSpec spec=new GuitarSpec(Builder.FENDER, "new", Type.ACCOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD);
		Guitar guitar=new Guitar("1",100.0,spec);
		inventoryService.addInstrument(guitar);
		System.out.println(inventoryService.searchInstrument(spec).get(0).getPrice());
		
		MandolrinSpec spec1=new MandolrinSpec(Builder.FENDER, "new", Type.ACCOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD, "style");
		Mandalorin mandalorin=new Mandalorin("1", 200.0,spec1);
		inventoryService.addInstrument(mandalorin);
		System.out.print(inventoryService.searchInstrument(spec1).get(0).getPrice());
		
	}

}
