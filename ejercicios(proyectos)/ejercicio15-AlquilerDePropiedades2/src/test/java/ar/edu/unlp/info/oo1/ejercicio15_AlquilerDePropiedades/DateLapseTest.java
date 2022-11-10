package ar.edu.unlp.info.oo1.ejercicio15_AlquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	private DateLapse lapsoDeTiempo,lapsoDeTiempoFuturo,LapsoDeTiempoSolapado;
	private LocalDate from;
	private LocalDate to;
	private LocalDate other,other2;
	
	
	@BeforeEach
	public void setUp() {
		from = LocalDate.of(2001, 01, 1);
		to = LocalDate.of(2002, 01, 1);
		other = LocalDate.of(2001, 10, 27);
		other2 = LocalDate.of(2020,02,02);
		lapsoDeTiempo = new DateLapse(from,to);
		lapsoDeTiempoFuturo = new DateLapse(LocalDate.of(2040, 5, 5),LocalDate.of(2050, 5,5));
		LapsoDeTiempoSolapado = new DateLapse(LocalDate.of(2040, 5, 3),LocalDate.of(2040, 5, 10));
	}
	
	@Test
	public void testSizeInDays() {
		assertEquals(365,this.lapsoDeTiempo.sizeInDays());
	}
	
	@Test
	public void testIncludesDate() {
		assertTrue(lapsoDeTiempo.includesDate(other));
		assertFalse(lapsoDeTiempo.includesDate(other2));
	}
	
	@Test
	public void testEqualsTo() {
		assertFalse(lapsoDeTiempo.equalsTo(other));
		assertTrue(lapsoDeTiempo.equalsTo(to));
	}
	
	@Test
	public void testEqualsFrom() {
		assertFalse(lapsoDeTiempo.equalsFrom(other));
		assertTrue(lapsoDeTiempo.equalsFrom(from));
	}
	
	@Test
	public void testLaterFrom() {
		assertFalse(lapsoDeTiempo.laterFrom());
		assertTrue(lapsoDeTiempoFuturo.laterFrom());
	}
	
	@Test
	public void testOverlaps() {
		assertFalse(lapsoDeTiempoFuturo.overlaps(lapsoDeTiempo));
		assertTrue(lapsoDeTiempoFuturo.overlaps(LapsoDeTiempoSolapado));
	}
	
	
}
