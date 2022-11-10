package ar.edu.unlp.info.oo1.ejercicio15_AlquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	private Usuario propietario,usuario;
	private DateLapse periodo,periodo2,periodo3,periodoCalculo;
	private Propiedad propiedad;
	private Reserva reserva, reserva2, reserva3;
	
	@BeforeEach
	public void setUp() {
		propietario = new Usuario("Pepe","Tolosa",44555666);
		usuario = new Usuario("Jose", "Berisso",22333444);
		
		periodo= new DateLapse(LocalDate.of(2023, 1, 1),LocalDate.of(2023, 1,10));
		periodo2= new DateLapse(LocalDate.of(2023, 1, 10),LocalDate.of(2023, 1,20));
		periodo3= new DateLapse(LocalDate.of(2023, 1, 20),LocalDate.of(2023, 1,30));
		periodoCalculo= new DateLapse(LocalDate.of(2023, 1, 1),LocalDate.of(2023, 1,31));
		
		propiedad = new Propiedad("Il Capo","Cabañita","Chascomús",5000,propietario);
		
		reserva = new Reserva(periodo,propiedad);
		reserva2 = new Reserva(periodo2,propiedad);
		reserva3 = new Reserva(periodo3,propiedad);
	}
	
	@Test
	public void testAgregarReserva() {
		assertEquals(0, usuario.getReservas().size());
		usuario.agregarReserva(reserva);
		assertEquals(1,usuario.getReservas().size());
	}
	
	@Test
	public void eliminarReserva() {
		usuario.agregarReserva(reserva);
		assertEquals(1, usuario.getReservas().size());
		usuario.eliminarReserva(reserva);
		assertEquals(0,usuario.getReservas().size());
	}
	
	@Test
	public void testAgregarPropiedad() {
		assertEquals(0, usuario.getPropiedades().size());
		usuario.agregarPropiedad(propiedad);
		assertEquals(1,usuario.getPropiedades().size());
	}
	
	@Test
	public void eliminarPropiedad() {
		usuario.agregarPropiedad(propiedad);
		assertEquals(1, usuario.getPropiedades().size());
		usuario.eliminarPropiedad(propiedad);
		assertEquals(0,usuario.getPropiedades().size());
	}
	
	@Test
	public void testCalcularIngresosDePropietario() {
		propietario.agregarPropiedad(propiedad);
		propiedad.agregarReserva(reserva);
		propiedad.agregarReserva(reserva2);
		propiedad.agregarReserva(reserva3);
		assertEquals(145000,propietario.calcularIngresosDePropietario(periodoCalculo));
	}
	
}
