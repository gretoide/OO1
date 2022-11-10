package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficies;

public class Esfera extends Pieza{
	private int radio;

	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	@Override
	public double getSuperficieDeColor() {
		return (4*Math.PI*Math.pow(this.radio,2));
	}

	@Override
	public double  getVolumenDeMaterial() {
		return 1.33333333 * Math.PI * Math.pow(this.radio, 3);
	}
	
	
}
