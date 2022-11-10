package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficies;

public class Cilindro extends Pieza{
	private int radio;
	private int altura;
	
	public Cilindro(String material, String color, int radio, int altura) {
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}
	
	public int getRadio() {
		return radio;
	}

	public int getAltura() {
		return altura;
	}

	@Override
	public double getSuperficieDeColor() {
		return (2*Math.PI*this.radio*this.altura)+(2*Math.PI*(Math.pow(this.radio,2)));
	}

	@Override
	public double getVolumenDeMaterial() {
		return (Math.PI*(Math.pow(this.radio,2))*this.altura);
	}
	
	
}
