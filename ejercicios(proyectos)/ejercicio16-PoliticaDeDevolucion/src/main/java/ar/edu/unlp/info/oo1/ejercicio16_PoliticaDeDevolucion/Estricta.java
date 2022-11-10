package ar.edu.unlp.info.oo1.ejercicio16_PoliticaDeDevolucion;

import java.time.LocalDate;

public class Estricta implements PoliticaDeDevolucion {

	@Override
	public double calcularDevolucion(Reserva reserva, LocalDate fecha) {
		return 0;
	}

}
