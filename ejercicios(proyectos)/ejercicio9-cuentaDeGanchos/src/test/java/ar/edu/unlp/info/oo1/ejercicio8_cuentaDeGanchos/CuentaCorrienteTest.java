package ar.edu.unlp.info.oo1.ejercicio8_cuentaDeGanchos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	private CuentaCorriente cuentaCorriente;
	private CuentaCorriente cuentaATransferir;
	
	@BeforeEach
	public void setUp() {
		cuentaCorriente = new CuentaCorriente();
		cuentaATransferir = new CuentaCorriente();
	}
	
	@Test
	public void testConstructor() {
		assertEquals(0,cuentaCorriente.getSaldo());
		assertEquals(0,cuentaCorriente.getDescubierto());
	}
	
	@Test
	public void testExtraer() {
		cuentaCorriente.setDescubierto(10000);
		cuentaCorriente.depositar(2000);
		assertFalse(cuentaCorriente.puedeExtraer(13000));
		assertTrue(cuentaCorriente.puedeExtraer(12000));
		cuentaCorriente.extraer(12000);
		assertEquals(-10000,cuentaCorriente.getSaldo());
	}
	
	@Test void testDepositar() {
		cuentaCorriente.depositar(500);
		assertEquals(500,cuentaCorriente.getSaldo());
	}
	
	@Test void testTransferir() {
		cuentaCorriente.setDescubierto(500);
		cuentaCorriente.depositar(100);
		assertTrue(cuentaCorriente.transferirACuenta(500, cuentaATransferir));
		cuentaCorriente.transferirACuenta(500, cuentaATransferir);
		assertEquals(500,cuentaATransferir.getSaldo());
	}
}
