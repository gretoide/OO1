package ar.edu.unlp.info.oo1.ejercicio4_figurasyCuerpos;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;
	
	public void setAltura(double unaAltura) {
		altura = unaAltura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setCaraBasal(Figura unaCara) {
		caraBasal = unaCara;
	}
	
	public double getVolumen() {
		return 2*caraBasal.getArea()*this.getAltura();
	}
	
	public double getSuperficieExterior() {
		return 2*caraBasal.getArea() + caraBasal.getPerimetro()*this.getAltura();
	}
	
}
