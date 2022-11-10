package ar.edu.unlp.info.oo1.ejercicio8_distruibuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario usuario; /*conoce al usuario propietario de la factura*/
	
	
	
	public Factura(double montoEnergiaActiva, double descuento, Usuario usuario) {
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
		this.fecha = LocalDate.now();
		this.usuario = usuario;
	}

	/*metodos pedidos*/
	
	public double montoTotal() {
		return this.montoEnergiaActiva * (1 - this.descuento / 100); /*le aplica el porcentaje*/
	}
	
	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}	
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
	
}
