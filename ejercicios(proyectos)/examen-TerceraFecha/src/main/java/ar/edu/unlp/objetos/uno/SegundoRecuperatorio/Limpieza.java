package ar.edu.unlp.objetos.uno.SegundoRecuperatorio;

public class Limpieza extends Servicio {
	private double tarifaMinima;

	public Limpieza(double precioHora, int cantHoras, double tarifaMinima) {
		super(precioHora, cantHoras);
		this.tarifaMinima = tarifaMinima;
	}

	public double getTarifaMinima() {
		return tarifaMinima;
	}

	@Override
	double calcularMonto() {
		double monto = this.montoBasico();
		if(monto > this.getTarifaMinima()) {
			return monto;
		}
		else {
			return this.getTarifaMinima();
		}
	}
	
	
	
}
