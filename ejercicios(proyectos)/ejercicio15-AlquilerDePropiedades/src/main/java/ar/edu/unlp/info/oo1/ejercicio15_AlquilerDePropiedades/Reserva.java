package ar.edu.unlp.info.oo1.ejercicio15_AlquilerDePropiedades;

public class Reserva {
	private DateLapse periodo;
	private Propiedad propiedad;

	public Reserva(DateLapse periodo, Propiedad propiedad) {
		this.periodo = periodo;
		this.propiedad = propiedad;
	}

	public boolean overlaps(DateLapse unPeriodo) {
		return this.periodo.overlaps(unPeriodo);
	}
	
	public boolean inicioPosteriorFechaActual() {
		return this.periodo.laterFrom();
	}
	
	public double calcularPrecioReserva(){
		return this.propiedad.getPrecioPorNoche()*this.periodo.sizeInDays();
	}
	

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public DateLapse getPeriodo() {
		return periodo;
	}

}
