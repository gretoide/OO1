package ar.edu.unlp.info.oo1.ejercicio16_PoliticaDeDevolucion;

import java.time.LocalDate;

public class Flexible implements PoliticaDeDevolucion {

	@Override
	public double calcularDevolucion(Reserva reserva, LocalDate fecha) {
		if(fecha.isBefore(reserva.getPeriodo().getFrom())) {
			return reserva.calcularPrecioReserva();
		}
		return 0;
	}

}
