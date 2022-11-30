package ar.edu.unlp.objetos.uno.examen_PrimeraFecha;

import java.time.LocalDate;

public class Embarcacion extends Vehiculo {
	private String nombre;
	
	public Embarcacion(String patente, LocalDate fechaFabricacion, double valor, String nombre) {
		super(patente, fechaFabricacion, valor);
		this.nombre = nombre;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public double calcularImpuesto() {
		if(this.getValor() < 1000000) {
			return porcentaje(10);
		}
		else {
			return porcentaje(15);
		}
	}
}
