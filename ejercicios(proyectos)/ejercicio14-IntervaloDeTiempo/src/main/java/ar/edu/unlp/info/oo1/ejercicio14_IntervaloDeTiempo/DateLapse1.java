package ar.edu.unlp.info.oo1.ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse1 implements DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	
	
	public DateLapse1(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return to;
	}
	
	/*retorna la cantidad de días entre la fecha 'from' y la fecha 'to'*/
	@Override
	public int sizeInDays() {
		return (int) this.from.until(this.to, ChronoUnit.DAYS);
	}
	
	
	/*recibe un objeto LocalDate y retorna true
	 *  si la fecha está entre el from y el to del receptor y false en caso contrario*/
	@Override
	public boolean includesDate (LocalDate other) {
		return (other.isAfter(this.from) && other.isBefore(this.to));
	}
	
}
