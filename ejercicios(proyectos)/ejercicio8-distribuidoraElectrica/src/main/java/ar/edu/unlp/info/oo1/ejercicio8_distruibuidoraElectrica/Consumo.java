package ar.edu.unlp.info.oo1.ejercicio8_distruibuidoraElectrica;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	
	
	public Consumo(LocalDate fecha, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}

	/*metodos pedidos*/
	public double costoEnBaseA(double precioKWh) {
		return this.consumoEnergiaActiva * precioKWh;
	}
	
	public double factorDePotencia() {
		return this.consumoEnergiaActiva / Math.sqrt(Math.pow(this.consumoEnergiaActiva, 2)+ Math.pow(this.consumoEnergiaReactiva, 2));
	}
	
	public LocalDate fecha() {
		return fecha;
	}

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	
}
