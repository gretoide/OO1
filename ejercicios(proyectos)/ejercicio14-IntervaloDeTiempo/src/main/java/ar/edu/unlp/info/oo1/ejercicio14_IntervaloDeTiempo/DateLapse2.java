package ar.edu.unlp.info.oo1.ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;

public class DateLapse2 implements DateLapse{
	private LocalDate from;
	private int sizeInDays;
	
	
	
	public DateLapse2(LocalDate from, int Size) {
		this.from = from;
		this.sizeInDays = Size;
	}

	public LocalDate getFrom() {
		return from;
	}
	
	/*retorna la cantidad de días entre la fecha 'from' y la fecha 'to'*/
	@Override
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	
	/*recibe un objeto LocalDate y retorna true
	 *  si la fecha está entre el from y el to del receptor y false en caso contrario*/
	@Override
	public boolean includesDate(LocalDate other) {
		LocalDate to = this.from.plusDays(this.sizeInDays);
		return other.isAfter(getFrom()) && other.isBefore(to);
	}
	
}
