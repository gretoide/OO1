package ar.edu.unlp.objetos.uno.SegundoRecuperatorio;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class UnicaVez extends Contratacion {

	public UnicaVez(Servicio servicio, LocalDate fechaInicial) {
		super(servicio, fechaInicial);
	}

	@Override
	double calcularMonto() {
		DayOfWeek dia = DayOfWeek.from(getFechaInicial());
		if(dia.equals(DayOfWeek.SATURDAY) || dia.equals(DayOfWeek.SUNDAY)) {
			return this.getServicio().calcularMonto() + ((this.getServicio().calcularMonto()/100)*15);
			/*en el parcial puse this.servicio y no estoy segura si lo multipliqué en vez de sumarlo :s*/
		}
		else {
			return this.getServicio().calcularMonto();
		}
	}

	
}
