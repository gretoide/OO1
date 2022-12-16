package ar.edu.unlp.info.oo1.ejercicio18_LiquidacionDeHaberes;

import java.time.LocalDate;

public class Recibo {
	private int antiguedad;
	private LocalDate fecha;
	private double montoTotal;
	
	public Recibo(int antiguedad, double montoTotal) {
		this.antiguedad = antiguedad;
		this.montoTotal = montoTotal;
		this.fecha = LocalDate.now();
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getMontoTotal() {
		return montoTotal;
	}
	
}
