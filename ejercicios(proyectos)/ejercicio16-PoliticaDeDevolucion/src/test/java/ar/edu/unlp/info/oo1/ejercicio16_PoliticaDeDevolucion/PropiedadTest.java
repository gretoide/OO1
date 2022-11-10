package ar.edu.unlp.info.oo1.ejercicio16_PoliticaDeDevolucion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropiedadTest {
	private Propiedad propiedad;
	private Usuario propietario;
	private Reserva reserva, reserva2;
	private DateLapse periodo, periodo2, periodo3, periodoCalculo;


	@BeforeEach
	public void setUp() {
		propietario = new Usuario("Pepe","Tolosa",44555666);
		
		periodo= new DateLapse(LocalDate.of(2023, 1, 1),LocalDate.of(2023, 1,10));
		periodo2= new DateLapse(LocalDate.of(2023, 1, 10),LocalDate.of(2023, 1,20));
		periodo3= new DateLapse(LocalDate.of(2023, 1, 20),LocalDate.of(2023, 1,30));
		periodoCalculo= new DateLapse(LocalDate.of(2023, 1, 1),LocalDate.of(2023, 1,31));
		
		propiedad = new Propiedad("Il Capo","Cabañita","Chascomús",5000,propietario, null);
		
		reserva = new Reserva(periodo,propiedad);
		reserva2 = new Reserva(periodo2,propiedad);
	}
	@Test
	public void testAgregarReserva() {
		assertEquals(0, propiedad.getReservas().size());
		propiedad.agregarReserva(reserva);
		assertEquals(1,propiedad.getReservas().size());
	}

	@Test
	public void testEliminarReserva() {
		propiedad.agregarReserva(reserva);
		assertEquals(1, propiedad.getReservas().size());
		propiedad.eliminarReserva(reserva);
		assertEquals(0,propiedad.getReservas().size());
	}
	
	@Test
	public void testDisponibilidad() {
		propiedad.agregarReserva(reserva);
		propiedad.agregarReserva(reserva2);
		
		assertTrue(propiedad.disponibilidad(periodo3));
		assertFalse(propiedad.disponibilidad(periodo2));
	}
	
	@Test
	public void testCalcularIngresoDePropiedad() {
		propiedad.agregarReserva(reserva);
		propiedad.agregarReserva(reserva2);
		
		assertEquals(95000,propiedad.calcularIngresosDePropiedad(periodoCalculo));
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(50000,propiedad.calcularPrecio(10));
	}
}