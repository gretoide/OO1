package ar.edu.unlp.objetos.uno.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDateTime;

public class Factura {
	private LocalDateTime inicio;
	private LocalDateTime fin;
	private LocalDateTime fechaEmision;
	private double monto;
	
	public Factura(LocalDateTime inicio, LocalDateTime fin, LocalDateTime fechaEmision, double monto) {
		this.inicio = inicio;
		this.fin = fin;
		this.fechaEmision = fechaEmision;
		this.monto = monto;
		
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}

	public double getMonto() {
		return monto;
	}
	
	
}
