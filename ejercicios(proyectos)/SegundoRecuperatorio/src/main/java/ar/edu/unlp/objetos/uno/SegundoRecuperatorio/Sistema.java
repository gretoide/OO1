package ar.edu.unlp.objetos.uno.SegundoRecuperatorio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
	private ArrayList<Cliente> clientes;
	private ArrayList<Servicio> servicios;
	
	public Sistema() {
		clientes = new ArrayList<>();
		servicios = new ArrayList<>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<Servicio> getServicios() {
		return servicios;
	}
	
	public Cliente registrarCliente(String nombre, String direccion) {
		Cliente cliente = new Cliente(nombre, direccion);
		this.clientes.add(cliente);
		return cliente;
	}
	
	public Servicio registrarLimpieza(int precioHora, int cantHoras, double tarifaMinima) {
		Limpieza limpieza = new Limpieza(precioHora, cantHoras, tarifaMinima);
		return limpieza;
	}
	
	public Servicio registrarParquizacion(double precioHora, int cantHoras, double costoMaquinas, int cantMaquinas) {
		Parquizacion parquizacion = new Parquizacion(precioHora, cantHoras, cantMaquinas, costoMaquinas);
		return parquizacion;
	}
	
	public void contratarUnicaVez(Cliente cliente, LocalDate fecha, Servicio servicio) {
		cliente.contratarUnicaVez(fecha, servicio);
	}
	
	public void contratarProlongada(Cliente cliente, LocalDate fecha, Servicio servicio, int cantDias) {
		cliente.contratarProlongada(fecha, servicio, cantDias);
	}
	
	public double montoAAbonarCliente(Cliente cliente) {
		return cliente.montoAAbonar();
	}
	
	public int cantMaquinasMayorAUnValor(double monto) {
		return (int) servicios.stream().filter(s -> s.calcularMonto() > monto).count();
	}
	
	
	
}
