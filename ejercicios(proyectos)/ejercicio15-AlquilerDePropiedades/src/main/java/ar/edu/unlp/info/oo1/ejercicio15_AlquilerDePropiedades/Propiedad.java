package ar.edu.unlp.info.oo1.ejercicio15_AlquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String nombre;
	private String descripcion;
	private String direccion;
	private double precioPorNoche;
	private Usuario propietario;
	private List<Reserva> reservas;
	
	public Propiedad(String nombre, String descripcion, String direccion, double precioPorNoche, Usuario propietario) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		this.propietario = propietario;
		this.reservas = new ArrayList<>();
	}
	
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	public double calcularIngresosDePropiedad(DateLapse periodo) {
		return this.reservas.stream().filter(r -> r.overlaps(periodo))
				.mapToDouble(r -> r.calcularPrecioReserva()).sum();
	}
	
	public boolean disponibilidad(DateLapse periodo) {
		return this.reservas.stream().noneMatch(r -> r.overlaps(periodo));
	}
	
	public double calcularPrecio(int dias) {
		return this.getPrecioPorNoche()*dias;
	}
	
	public List<Reserva> getReservas() {
		return reservas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public Usuario getPropietario() {
		return propietario;
	}
	
	
	
}
