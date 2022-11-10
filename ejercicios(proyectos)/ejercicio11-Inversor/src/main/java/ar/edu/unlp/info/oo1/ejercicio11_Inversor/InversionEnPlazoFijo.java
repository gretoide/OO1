package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import java.time.LocalDate;

public class InversionEnPlazoFijo implements Inversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	
	public InversionEnPlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado,
			double porcentajeDeInteresDiario) {
		super();
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}


	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}


	public double getMontoDepositado() {
		return montoDepositado;
	}


	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}


	@Override
	/*El valor del actual del plazo fijo, equivale al monto depositado, incrementado como corresponda
	 * por el porcentaje de interes diario. Desde la fecha de constitucion a la fecha actual*/
	public double valorActual() {
		double dias = this.getFechaDeConstitucion().until(LocalDate.now()).getDays(); /*Cuenta la cantidad de dias*/
		return this.montoDepositado + (this.getPorcentajeDeInteresDiario() * dias);
	}

}
