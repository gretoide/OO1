package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import java.util.ArrayList;

public class Inversor implements Inversion{
	private String nombre;
	private ArrayList<Inversion> inversiones;
	
	public Inversor (String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<>();
	}
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void agregarInversion(Inversion unaInversion) {
		inversiones.add(unaInversion);
	}



	@Override
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(i -> i.valorActual()).sum();
	}
}
