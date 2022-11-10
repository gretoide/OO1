package ar.edu.unlp.info.oo1.ejercicio4_figurasyCuerpos;

public class Cuadrado implements Figura {
	private double lado;
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getPerimetro() {
		return lado*4;
	}
	public double getArea() {
		return lado*lado;
	}
}
