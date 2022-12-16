package ar.edu.unlp.info.oo1.ejercicio18_LiquidacionDeHaberes;

import java.time.LocalDate;

public abstract class Contrato {
	private LocalDate  fechaInicio;

	public Contrato(LocalDate fechaInicio) {
	
		this.fechaInicio = fechaInicio;
	}
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	abstract double calcularMonto(); 
	
	abstract boolean estaVencido(); 
		
	abstract int calcularAños();

}
