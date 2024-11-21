package com.anahuac.mayab.modulo1.sesion5;

import java.util.ArrayList;

public class SimuladorPatos { 
	
	public void simuladorAcciones(ArrayList<Pato> listaPatos) {
		for(Pato p: listaPatos) {
			p.volar();
			p.quack();
			p.comer();
			System.out.println("-----------");
		}
		
		
	}
	


}
