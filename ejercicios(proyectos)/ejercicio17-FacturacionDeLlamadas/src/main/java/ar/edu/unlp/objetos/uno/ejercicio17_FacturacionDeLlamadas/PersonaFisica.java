package ar.edu.unlp.objetos.uno.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDateTime;

public class PersonaFisica extends Persona {
	private int dni;

	public PersonaFisica(String nombre, String direccion, int nroTelefono, int dni) {
		super(nombre, direccion, nroTelefono);
		this.dni = dni;
	}
	
	public int getDni() {
		return dni;
	}
	
	public double calcularMonto(LocalDateTime comienzo, LocalDateTime fin) {
		double monto = this.calcularMontoTotal(comienzo, fin);
		return monto - (monto*0.1);
	}
	
}


