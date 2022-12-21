package ar.edu.unlp.objetos.uno.SegundoRecuperatorio;

public abstract class Servicio {
	private double precioHora;
	private int cantHoras;
	
	public Servicio(double precioHora, int cantHoras) {
		this.precioHora = precioHora;
		this.cantHoras = cantHoras;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public int getCantHoras() {
		return cantHoras;
	}
	
	abstract double calcularMonto();
	
	protected double montoBasico() {
		return this.getCantHoras() * this.getPrecioHora();
	}
	
} 
