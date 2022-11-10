package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {
	private ClienteDeCorreo cliente;
	private Carpeta c1,c2;
	private Email e1, e2;
	private Archivo a1, a2;
	
	@BeforeEach
	public void setUp() {
		a1 = new Archivo("Nombre    ");
		a2 = new Archivo("Nombre    ");
		
		e1 = new Email("Nombre    ","Cuerpo    ");
		e2 = new Email("Nombre    ","Cuerpo    ");
		
		c1 = new Carpeta("Carpeta");
		c2 = new Carpeta("Carpeta");
    
		cliente = new ClienteDeCorreo("Soy el cliente");
	}
	
	@Test
	public void testRecibirEmail() {
    assertTrue(cliente.getInbox().getEmails().isEmpty());		
	this.cliente.recibirEmail(e1);
    assertFalse(cliente.getInbox().getEmails().isEmpty());		
	}
    
	@Test
	public void agregarCarpetaTest() {
		this.cliente.agregarCarpeta(c1);
		this.cliente.agregarCarpeta(c2);
		assertFalse(this.cliente.getCarpetas().isEmpty());
	}
    
	@Test
	public void testMoverEmail(){
	this.cliente.recibirEmail(e1); 
    this.cliente.agregarCarpeta(c1);
    this.cliente.moverEmail(this.cliente.getInbox(),c1,e1);
    assertTrue(this.cliente.getInbox().getEmails().isEmpty());
    assertFalse(this.cliente.getCarpetas().isEmpty());
	}
	
	@Test
	public void testBuscarTexto() {
		e1.agregarAdjunto(a1);
		this.cliente.recibirEmail(e1);
		this.cliente.agregarCarpeta(c1);
		this.cliente.moverEmail(this.cliente.getInbox(), c1, e1);
		
		e2.agregarAdjunto(a2);
		this.cliente.recibirEmail(e2);
		this.cliente.agregarCarpeta(c2);
		this.cliente.moverEmail(this.cliente.getInbox(), c2, e2);
		
		assertEquals(e1,this.cliente.buscarTexto("Nombre    "));
	}
	
	public void testEspacipOCupado() {
		e1.agregarAdjunto(a1);
		this.cliente.recibirEmail(e1);
		this.cliente.agregarCarpeta(c1);
		this.cliente.moverEmail(this.cliente.getInbox(), c1, e1);
		
		e2.agregarAdjunto(a2);
		this.cliente.recibirEmail(e2);
		this.cliente.agregarCarpeta(c2);
		this.cliente.moverEmail(this.cliente.getInbox(), c2, e2);
		
		assertEquals(40,this.cliente.espacioOcupado());
	}
}
