package ar.edu.unlp.info.oo1.ejercicio3_presupuestos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto extends Object {
	
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public Presupuesto cliente(String unCliente) {
		cliente = unCliente;
		return this;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public LocalDate getFecha() {
		return fecha;		
	}
	
	public void setFecha(LocalDate unaFecha) {
		fecha = unaFecha;
	}
		
	
	public void agregarItem(Item unItem) {
		items.add(unItem);	
	}
		 
	public double calcularTotal() {  
		 double total = 0; 
		 if (!items.isEmpty()) {
	        for(Item i:items){
	            total = total + i.costo();
	        }
		 }   
	        return total;
	}
}
