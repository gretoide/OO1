package ar.edu.unlp.info.oo1.ejercicio16_PoliticaDeDevolucion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements PoliticaDeDevolucion {

	@Override
	public double calcularDevolucion(Reserva reserva, LocalDate fecha) {
		if(fecha.isBefore(reserva.getPeriodo().getFrom())) {
			if(fecha.until(reserva.getPeriodo().getFrom(), ChronoUnit.DAYS) >= 7) {
				return reserva.calcularPrecioReserva();
			}
		}
		else {
			if(fecha.until(reserva.getPeriodo().getFrom(), ChronoUnit.DAYS) >= 2) {
				return reserva.calcularPrecioReserva()/2;
			}
		}
		return 0;
	}

}
