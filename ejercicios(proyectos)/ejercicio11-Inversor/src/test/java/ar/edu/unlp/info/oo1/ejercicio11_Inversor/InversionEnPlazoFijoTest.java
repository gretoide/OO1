package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionEnPlazoFijoTest {
	private InversionEnPlazoFijo plazoFijo;
	
	@BeforeEach
	public void setUp() {
		plazoFijo = new InversionEnPlazoFijo(LocalDate.now().minusDays(10),1000,10);
	}
	
	@Test
	public void testValorActual() {
		
		assertEquals(1100,this.plazoFijo.valorActual());
	}
}
