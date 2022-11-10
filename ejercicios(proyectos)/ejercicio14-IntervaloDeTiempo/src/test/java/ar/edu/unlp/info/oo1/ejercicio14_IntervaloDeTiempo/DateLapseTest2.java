package ar.edu.unlp.info.oo1.ejercicio14_IntervaloDeTiempo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest2 {
	private DateLapse2 lapsoDeTiempo;
	private LocalDate from;
	private LocalDate to;
	private LocalDate other,other2;
	
	
	@BeforeEach
	public void setUp() {
		from = LocalDate.of(2001, 01, 1);
		to = LocalDate.of(2002, 01, 1);
		other = LocalDate.of(2001, 10, 27);
		other2 = LocalDate.of(2020,02,02);
		lapsoDeTiempo = new DateLapse2(from,365);
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
}
