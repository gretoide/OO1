package ar.edu.unlp.info.oo1.ejercicio2_balanzaElectronica;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private ArrayList<Producto> productos;

	
	public Balanza(){
		productos = new ArrayList<Producto>();
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	public double getPesoTotal() {
		return productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
	}
	public double getPrecioTotal() {
		return  productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
	}

	public List<Producto> getProductos(){
		return this.productos;
	}
	
	public void ponerEnCero(){
		productos.clear();
	}
	
	public void agregarProducto(Producto unProducto) {
		productos.add(unProducto);
	}
	
	public Ticket emitirTicket() {
		Ticket unTicket = new Ticket(this.getProductos(),this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal());
		return unTicket;
	}
}
