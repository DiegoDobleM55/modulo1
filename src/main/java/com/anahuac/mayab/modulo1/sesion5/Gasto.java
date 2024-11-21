package com.anahuac.mayab.modulo1.sesion5;

public abstract class Gasto {
	private double monto;
	private String categoria;
	private String fecha;
	private String metodoDePago;
	
	
	
	
	public Gasto(double monto, String categoria, String fecha, String metodoDePago) {
		super();
		this.monto = monto;
		this.categoria = categoria;
		this.fecha = fecha;
		this.metodoDePago = metodoDePago;
		
		
	}
	
	
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getMetodoDePago() {
		return metodoDePago;
	}
	public void setMetodoDePago(String metodoDePago) {
		this.metodoDePago = metodoDePago;
	}
	
	public abstract void parcializarAMeses(int meses); 
	
}
