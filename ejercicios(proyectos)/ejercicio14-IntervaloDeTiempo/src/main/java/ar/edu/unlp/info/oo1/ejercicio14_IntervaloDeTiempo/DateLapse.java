package ar.edu.unlp.info.oo1.ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;

public interface DateLapse {
	int sizeInDays();
	boolean includesDate(LocalDate other);
}
