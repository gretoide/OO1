package ar.edu.unlp.info.oo1.ejercicio8_cuentaDeGanchos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	private CajaDeAhorro caja1, caja2;
	
	@BeforeEach
	public void setUp() {
		caja1 = new CajaDeAhorro();
		caja2 = new CajaDeAhorro();
	}
	
	@Test
	public void testConstructor() {
		assertEquals(0,caja1.getSaldo());
		assertEquals(0,caja2.getSaldo());
	}
	
	/*corrobora que se apliquen los porcentajes*/
	@Test
	public void testDepositar() {
		caja1.depositar(500);
		assertEquals(490,caja1.getSaldo());
	}
	
	/*corrobora que se apliquen bien las extracciones, con los porcentajes*/
	@Test
	public void testExtraer() {
		caja1.depositar(1000);
		assertFalse(caja1.puedeExtraer(2000));
		assertTrue(caja1.puedeExtraer(600));
		caja1.extraerSinControlar(600);
		assertEquals(368,caja1.getSaldo());
	}
	/*corrobora que podamos hacer las transferencias con los porcentajes aplicados*/
	@Test 
	public void testTransferir() {
		caja1.depositar(200);
		caja1.transferirACuenta(100, caja2);
		assertEquals(98,caja2.getSaldo());
		assertEquals(94,caja1.getSaldo());
	}
}
