package ar.edu.unlp.objetos.uno.SegundoRecuperatorio;

public class Parquizacion extends Servicio {
	private int cantMaquinas;
	private double costoMantenimiento;
	
	public Parquizacion(double precioHora, int cantHoras, int cantMaquinas, double costoMantenimiento) {
		super(precioHora, cantHoras);
		this.cantMaquinas = cantMaquinas;
		this.costoMantenimiento = costoMantenimiento;
	}

	public int getCantMaquinas() {
		return cantMaquinas;
	}


	public double getCostoMantenimiento() {
		return costoMantenimiento;
	}


	@Override
	double calcularMonto() {
		return this.montoBasico() + this.costoMantenimiento();
		
	}
	
	public double costoMantenimiento() {
		return this.getCostoMantenimiento() * this.getCantMaquinas();
	}
	
	
	
}
