package com.anahuac.mayab.modulo1.sesion5;

public class TestGastos {
		
		public static void imprimirFacturas(Facturable gasto, String id, String email) {
		
			gasto.pedirConstanciaSAT();
			gasto.emitirFactura(id);
			gasto.enviarFactura(email);
		
		}
		
		
		public static void main(String[] args) { 
		Gasto gasto1 = new GastoNoFacturable(500,"comida","16-nov-2024","tarjeta");
		
		Gasto gasto2 = new GastoFacturable(2000,"consulta","10-nov-2024","tarjeta");
		
		System.out.println("FEcha: " + gasto2.getFecha() + " monto: " + gasto2.getMonto() );
		  imprimirFacturas((Facturable)gasto2,"123","correo@hola.com");
		 }

}