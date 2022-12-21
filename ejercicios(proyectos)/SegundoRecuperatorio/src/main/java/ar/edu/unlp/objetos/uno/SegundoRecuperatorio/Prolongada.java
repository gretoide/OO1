package ar.edu.unlp.objetos.uno.SegundoRecuperatorio;

import java.time.LocalDate;

public class Prolongada extends Contratacion {
	private int cantDias;

	public Prolongada(Servicio servicio, LocalDate fechaInicial, int cantDias) {
		super(servicio, fechaInicial);
		this.cantDias = cantDias;
	}

	public int getCantDias() {
		return cantDias;
	}

	double calcularMonto() {
		if(this.getCantDias() > 5) {
			return this.getServicio().calcularMonto() - ((this.getServicio().calcularMonto()/100)*10);
		}
		else {
			return this.getServicio().calcularMonto();
		}
	}
	
	/* COMO DEBERIA HABER SIDO
	 * double calcularMonto() {
		double monto = this.getServicio().calcularMonto() * this.getCantDias();
		if(this.getCantDias() > 5) {
			return monto - ((monto/100)*10);
		}
		else {
			return monto;
		}
	}*/
	
	
}
