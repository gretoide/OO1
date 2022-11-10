package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionEnAccionesTest {
	private InversionEnAcciones acciones;
	
	@BeforeEach
	public void setUp() {
		acciones = new InversionEnAcciones("Pepe",10,30);
	}
	
	@Test
	public void testValorActual() {
		assertEquals(300,this.acciones.valorActual());
	}
}
