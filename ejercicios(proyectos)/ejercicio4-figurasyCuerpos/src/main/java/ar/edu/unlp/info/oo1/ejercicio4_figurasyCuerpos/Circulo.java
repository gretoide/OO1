package ar.edu.unlp.info.oo1.ejercicio4_figurasyCuerpos;

public class Circulo implements Figura{
	private double radio;
	private double diametro;
	
	/*radio*/
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	/*perimetro*/
	public double getPerimetro() {
		return (Math.PI*this.getDiametro());
	}

	/*area*/
	public double getArea() {
		return Math.PI*(radio*radio);
	}
	/*diametro*/
	public double getDiametro() {
		return this.radio*2;
	}
	public void setDiametro(double unDiametro) {
		this.diametro = unDiametro;
	}
}
