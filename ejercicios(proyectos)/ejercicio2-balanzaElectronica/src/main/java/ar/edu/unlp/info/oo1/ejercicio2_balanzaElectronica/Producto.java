package ar.edu.unlp.info.oo1.ejercicio2_balanzaElectronica;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto() {
		
	}
	
	public Producto(double unPeso, double unPrecio, String unaDes) {
		peso = unPeso;
		precioPorKilo = unPrecio;
		descripcion = unaDes;
	}

	/*getters and setters*/

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/*metodos*/
	
	public double getPrecio() {
		return peso*precioPorKilo;
	}
}
