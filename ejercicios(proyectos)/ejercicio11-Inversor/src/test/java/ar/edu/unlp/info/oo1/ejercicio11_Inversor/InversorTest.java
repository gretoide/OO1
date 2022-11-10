package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	private Inversor inversor;
	private InversionEnAcciones acciones;
	private InversionEnPlazoFijo plazoFijo;
	
	
	
	@BeforeEach
	public void setUp() {
		inversor = new Inversor("Gretoide");
		}
	
	@Test
	public void testAgregarInversiones() {
		inversor.agregarInversion(acciones);
		inversor.agregarInversion(plazoFijo);
	}
	
	@Test 
	public void testValorActual() {
		acciones = new InversionEnAcciones("Pepe",10,30);
		plazoFijo = new InversionEnPlazoFijo(LocalDate.now().minusDays(10),1000,2);
		inversor.agregarInversion(acciones);
		inversor.agregarInversion(plazoFijo);
		assertEquals(1320,this.inversor.valorActual());
	}
}
