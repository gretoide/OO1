package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficies;

public class PrismaRectangular extends Pieza {
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	public PrismaRectangular(String material, String color, int ladoMayor, int ladoMenor, int altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}

	public int getLadoMayor() {
		return ladoMayor;
	}

	public int getLadoMenor() {
		return ladoMenor;
	}

	public int getAltura() {
		return altura;
	}

	@Override
	public double getSuperficieDeColor() {
		return 2*
				((this.ladoMayor*this.ladoMenor)+
				(this.ladoMayor*this.altura)+
				(this.ladoMenor*this.altura));
	}

	@Override
	public double  getVolumenDeMaterial() {
		return this.ladoMayor*this.ladoMenor*this.altura;
	}
	
	
}
