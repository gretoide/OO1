package ar.edu.unlp.objetos.uno.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sistema {
	private ArrayList<String> numeros;
	private ArrayList<Persona> personas;
	
	public Sistema() {
		numeros = new ArrayList<>();
		personas= new ArrayList<>();
	}
	
	public void AgregarNumeroDisponible(String unNumero){
		this.numeros.add(unNumero);
	}
	
	public String asignarNumero() {
		String numero = numeros.get(0);
		numeros.remove(numero);
		return numero;
	}
	
	protected Persona buscarEmisor(String numero) {
		return this.personas.stream().filter(p -> p.getNroTelefono().equals(numero)).findFirst().orElse(null);
		}
	
	public PersonaFisica darDeAltaPersonaFisica(String unNombre, String unaDireccion,String  unNumTelefono,int dni) {
		PersonaFisica personaFisica = new PersonaFisica(unNombre,unaDireccion,unNumTelefono,dni);
		this.personas.add(personaFisica);
		return personaFisica;
	}
	
	public PersonaJuridica darDeAltaPersonaJurica(String unNombre, String unaDireccion,String  unNumTelefono, int unCuit, String unTipo) {
		PersonaJuridica personaJuridica = new PersonaJuridica(unNombre,unaDireccion,unNumTelefono,unCuit,unTipo);
		this.personas.add(personaJuridica);
		return personaJuridica;
	}
	
	public LlamadaLocal registrarLlamadaLocal(LocalDateTime comienzo, int duracion, String  emisor, String  receptor) {
		Persona persona =  this.buscarEmisor(emisor);
		LlamadaLocal llamadaLocal = persona.registrarLlamadaLocal(comienzo,duracion,emisor,receptor);
		return llamadaLocal;
	}

	public LlamadaInterUrbana registrarLlamadaInterUrbana(LocalDateTime comienzo, int duracion, String  emisor, String  receptor, int distancia) {
		Persona persona =  this.buscarEmisor(emisor);
		LlamadaInterUrbana llamadaInterUrbana = persona.registrarLlamadaInterUrbana(comienzo,duracion,emisor,receptor,distancia);
		return llamadaInterUrbana;
	}
	
	public LlamadaInternacional registrarLlamadaInternacional(LocalDateTime comienzo, int duracion, String  emisor, String  receptor,
			String paisOrigen, String paisDestino) {
		Persona persona =  this.buscarEmisor(emisor);
		LlamadaInternacional llamadaInternacional = persona.registrarLlamadaInternacional(comienzo,duracion,emisor,receptor,paisOrigen,paisDestino);
		return llamadaInternacional;
	}

	public Factura facturarLlamada(Persona cliente, LocalDateTime comienzo, LocalDateTime fin) {
		return cliente.facturarLLamadas(comienzo, fin);
	}

		
}
