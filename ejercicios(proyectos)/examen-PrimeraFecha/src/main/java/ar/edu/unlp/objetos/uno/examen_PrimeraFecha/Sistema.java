package ar.edu.unlp.objetos.uno.examen_PrimeraFecha;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
private ArrayList<Contribuyente> contribuyentes;
	
	public Sistema() {
		
		contribuyentes = new ArrayList<>();		
	}
	
	public Contribuyente darAltaContribuyente(String nombre, String direccion, String dni, String eMail, String localidad) {
		
		Contribuyente contribuyente = new Contribuyente(nombre, direccion, dni, eMail, localidad);
		contribuyentes.add(contribuyente);
		return contribuyente;
	}
	
	public Inmueble darAltaInmueble(String numeroDePartida, double valorLote, double valorEdificacion, Contribuyente contribuyente) {
		
		return contribuyente.registrarInmueble(numeroDePartida, valorLote, valorEdificacion);
	}
	
	public Automotor darDeAltaAutomotor(String patente, LocalDate fecha, double valor,  String marca, String modelo, Contribuyente contribuyente) {
		return contribuyente.registrarAutomotor(patente, fecha, valor, marca, modelo);
	}

	public Embarcacion darDeAltaEmbarcacion(String patente, LocalDate fecha, double valor, String nombre, Contribuyente contribuyente){
		
		return contribuyente.registrarEmbarcacion(patente, fecha, valor, nombre);
	}
	
	public double calcularImpuesto(Contribuyente contribuyente) {
		
		return contribuyente.calcularImpuestos();
	}
	
	public List<Contribuyente> masPagaPorLocalidad(String localidad, int N){
		return contribuyentes.stream()
				.filter(c -> c.getLocalidad().equals(localidad))
				.sorted((c1,c2) -> c2.calcularImpuestos().compareTo(c1.calcularImpuestos()))
				.limit(N)
				.toList();
	}
}
