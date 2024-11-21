package com.anahuac.mayab.modulo1.sesion5;

public class GastoNoFacturable extends Gasto{

	public GastoNoFacturable(double monto, String categoria, String fecha, String metodoDePago) {
		super(monto, categoria, fecha, metodoDePago);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parcializarAMeses(int meses) {
		// TODO Auto-generated method stub
		System.out.println("Parcializando SIN intereses a " + meses + " meses");
	}

}
