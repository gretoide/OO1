package ar.edu.unlp.info.oo1.ejercicio2_balanzaElectronica;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket(List<Producto> listaDeProductos,int cantP, double unPeso, double unPrecio) {
		fecha = LocalDate.now();
		productos = listaDeProductos;
		cantidadDeProductos = cantP;
		pesoTotal = unPeso;
		precioTotal = unPrecio;
	}

	/*getters and setters*/
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	/*public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}*/

	public double getPesoTotal() {
		return pesoTotal;
	}

	/*public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}*/

	/*public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}*/
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	/*metodos*/
	
	public double impuesto() {
		return precioTotal * 0.21;
	}
}
