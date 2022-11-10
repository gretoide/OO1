package ar.edu.unlp.info.oo1.ejercicio16_PoliticaDeDevolucion;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String direccion;
	private int dni;
	private ArrayList<Reserva> reservas;
	private ArrayList<Propiedad> propiedades;
	
	public Usuario(String nombre, String direccion, int dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		reservas = new ArrayList<>();
		propiedades = new ArrayList<>();
	}
	
	
	public ArrayList<Propiedad> getPropiedades() {
		return propiedades;
	}


	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getDni() {
		return dni;
	}
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	public void agregarPropiedad(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public void eliminarPropiedad(Propiedad propiedad) {
		this.propiedades.remove(propiedad);
	}
	
	public double calcularIngresosDePropietario(DateLapse periodo) {
		return this.propiedades.stream().mapToDouble(p -> p.calcularIngresosDePropiedad(periodo)).sum();
	}
}
