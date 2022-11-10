package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
	private Carpeta carpeta;
	private Email e1,e2;
	
	
	@BeforeEach
	public void setUp() {
		carpeta = new Carpeta("NombreCarpeta");
		e1 = new Email("Nombre    ","Cuerpo    "); /*20*/
		e2 = new Email("Nombre    ","Cuerpo    "); /*20*/
	}
	
	@Test
	public void testAgregarEmail() {
		assertTrue(this.carpeta.getEmails().isEmpty());
		this.carpeta.agregarEmail(e1);
		this.carpeta.agregarEmail(e2);
		assertFalse(this.carpeta.getEmails().isEmpty());
	}
	
	@Test
	public void testEliminarEmail() {
		assertTrue(this.carpeta.getEmails().isEmpty());
		this.carpeta.agregarEmail(e1);
		this.carpeta.agregarEmail(e2);
		assertFalse(this.carpeta.getEmails().isEmpty());
		this.carpeta.eliminarEmail(e1);
		this.carpeta.eliminarEmail(e2);
		assertTrue(this.carpeta.getEmails().isEmpty());
	}
	
	@Test
	public void testBuscar() {
		assertEquals(null,this.carpeta.buscar("Nombre    "));
		this.carpeta.agregarEmail(e1);
		assertEquals(e1,this.carpeta.buscar("Nombre    "));
	}
	
	@Test
	public void testTamaño() {
		this.carpeta.agregarEmail(e1);
		this.carpeta.agregarEmail(e2);
		assertEquals(40,this.carpeta.tamañoEmails());
	}

}



