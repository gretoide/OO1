package ar.edu.unlp.objetos.uno.examen_PrimeraFecha;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Vehiculo implements Bien {
	private String patente;
	private LocalDate fechaFabricacion;
	private double valor;
	
	public Vehiculo(String patente, LocalDate fechaFabricacion, double valor) {
		super();
		this.patente = patente;
		this.fechaFabricacion = fechaFabricacion;
		this.valor = valor;
	}
	
	public String getPatente() {
		return patente;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public double getValor() {
		return valor;
	}

	protected double porcentaje(int N) {
		if(ChronoUnit.YEARS.between(this.fechaFabricacion, LocalDate.now()) <= 10){
			return valor*(N/100);
		}
		else {
			return 0;
		}
	}
}
