package com.anahuac.mayab.modulo1.sesion5;

public class GastoFacturable extends Gasto implements Facturable {

	public GastoFacturable(double monto, String categoria, String fecha, String metodoDePago) {
		super(monto, categoria, fecha, metodoDePago);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pedirConstanciaSAT() {
		System.out.println("Dame tu constancia del SAT");
		
	}

	@Override
	public void emitirFactura(String id) {
		System.out.println("Emitiendo factura..." + id);
		
	}

	@Override
	public void enviarFactura(String email) {
		System.out.println("Mandando factura al correo: " + email);
		
	}

	@Override
	public void parcializarAMeses(int meses) {
		// TODO Auto-generated method stub
		System.out.println("Parcializando CON intereses a " + meses + " meses");
		}
	}
	

