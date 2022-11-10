package ar.edu.unlp.info.oo1.ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse{
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return to;
	}
	
	public boolean equalsFrom(LocalDate date) {
		return this.from.equals(date);
	}
	
	public boolean equalsTo(LocalDate date) {
		return this.to.equals(date);
	}
	
	public int sizeInDays() {
		return (int) this.from.until(this.to, ChronoUnit.DAYS);
	}
	
	public boolean laterFrom() {
		return this.from.isAfter(LocalDate.now());
	}
	
	public boolean includesDate (LocalDate other) {
		return (other.isAfter(this.from) && other.isBefore(this.to));
	}
	
	public boolean overlaps(DateLapse lapso) {
		return (lapso.includesDate(this.from) || lapso.includesDate(this.to) || lapso.equalsTo(this.to) || lapso.equalsFrom(this.from));
	}
	
}
