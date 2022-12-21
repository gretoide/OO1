package ar.edu.unlp.objetos.uno.SegundoRecuperatorio;

import java.time.LocalDate;

public abstract class Contratacion {
	private Servicio servicio;
	private LocalDate fechaInicial;
	
	public Contratacion(Servicio servicio, LocalDate fechaInicial) {
		super();
		this.servicio = servicio;
		this.fechaInicial = fechaInicial;
	}
	
	public Servicio getServicio() {
		return servicio;
	}

	public LocalDate getFechaInicial() {
		return fechaInicial;
	}

	abstract double calcularMonto();
	
	
	
}
