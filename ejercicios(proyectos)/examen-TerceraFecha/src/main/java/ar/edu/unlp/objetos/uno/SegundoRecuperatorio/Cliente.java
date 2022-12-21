package ar.edu.unlp.objetos.uno.SegundoRecuperatorio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
	private String nombre, direccion;
	private ArrayList<Contratacion> contrataciones;
	
	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.contrataciones = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public ArrayList<Contratacion> getContrataciones() {
		return contrataciones;
	}
	
	public void contratarUnicaVez(LocalDate fecha, Servicio servicio) {
		UnicaVez contratacion = new UnicaVez(servicio,fecha);
		this.contrataciones.add(contratacion);
	}
	
	public void contratarProlongada(LocalDate fecha, Servicio servicio, int cantDias) {
		Prolongada contratacion = new Prolongada(servicio,fecha,cantDias);
		this.contrataciones.add(contratacion);
	}
	
	public double montoAAbonar() {
		return this.contrataciones.stream().mapToDouble(c -> c.calcularMonto()).sum();
	}
	
	
}
