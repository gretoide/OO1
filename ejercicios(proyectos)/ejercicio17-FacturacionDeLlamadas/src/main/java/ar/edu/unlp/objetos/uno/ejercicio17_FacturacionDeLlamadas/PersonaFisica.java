package ar.edu.unlp.objetos.uno.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDateTime;

public class PersonaFisica extends Persona {
	private int dni;

	public PersonaFisica(String nombre, String direccion, String nroTelefono, int dni) {
		super(nombre, direccion, nroTelefono);
		this.dni = dni;
	}
	
	public int getDni() {
		return dni;
	}
	
	@Override
	public double calcularMontoTotal(LocalDateTime comienzo, LocalDateTime fin) {
		double monto = super.calcularMontoTotal(comienzo, fin);
		return monto - (monto*0.1);
	}
	
}


