package ar.edu.unlp.info.oo1.ejercicio16_PoliticaDeDevolucion;

import java.time.LocalDate;

public interface PoliticaDeDevolucion {
	double calcularDevolucion(Reserva reserva, LocalDate fecha);
}
