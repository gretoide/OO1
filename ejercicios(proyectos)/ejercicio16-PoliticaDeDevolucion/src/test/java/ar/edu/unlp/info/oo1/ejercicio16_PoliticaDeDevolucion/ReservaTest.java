package ar.edu.unlp.info.oo1.ejercicio16_PoliticaDeDevolucion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservaTest {
	private Reserva reserva, reserva2;
	private DateLapse periodo, periodo2, periodo3;
	private Propiedad propiedad;
	private Usuario propietario;
	
	@BeforeEach
	public void setUp() {
		propietario = new Usuario("ElMasCapo","La Facul",43888777);
		periodo = new DateLapse(LocalDate.of(2023, 5, 1),LocalDate.of(2023, 5, 10));
		periodo2 = new DateLapse(LocalDate.of(2022, 5, 1),LocalDate.of(2022, 5, 10));
		periodo3 = new DateLapse(LocalDate.of(2022, 5, 3),LocalDate.of(2022, 5, 9));
		propiedad = new Propiedad("Chalet: Il Capo", "Solo apto para capos"
				,"A donde solo los capos saben llegar",5000,propietario, null);
		reserva = new Reserva(periodo,propiedad);
		reserva2 = new Reserva(periodo2,propiedad);
	}
	
	@Test
	public void testCalcularPrecioReserva() {
		assertEquals(45000,reserva.calcularPrecioReserva());
	}
	
	@Test
	public void testInicioPosteriorAFechaActual() {
		assertFalse(reserva2.inicioPosteriorFechaActual());
		assertTrue(reserva.inicioPosteriorFechaActual());
	}
	
	@Test
	public void testOverlaps() {
		assertFalse(reserva2.overlaps(periodo3));
		assertTrue(reserva2.overlaps(periodo2));
	}
}
