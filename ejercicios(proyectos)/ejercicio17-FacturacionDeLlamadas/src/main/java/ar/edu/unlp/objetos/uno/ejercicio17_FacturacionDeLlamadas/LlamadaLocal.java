package ar.edu.unlp.objetos.uno.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDateTime;

public class LlamadaLocal extends Llamada {

	LlamadaLocal(LocalDateTime comienzo, int duracion, int emisor, int receptor){
		super(comienzo, duracion, emisor, receptor);
	}
	
	public double calcularCosto(){		
		return this.calcularCosto(1);
	}
}