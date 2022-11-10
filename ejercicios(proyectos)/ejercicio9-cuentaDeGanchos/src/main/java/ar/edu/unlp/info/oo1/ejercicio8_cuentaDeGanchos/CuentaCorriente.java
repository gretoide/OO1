package ar.edu.unlp.info.oo1.ejercicio8_cuentaDeGanchos;

public class CuentaCorriente extends Cuenta {
	
	private double descubierto;
	
	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}

	public void setDescubierto(double unDescubierto) {
		this.descubierto = unDescubierto;
	}
	
	public double getDescubierto() {
		return this.descubierto;
	}


	@Override
	public boolean puedeExtraer(double monto) {
		return this.getSaldo() + this.getDescubierto() >= monto;
	}
		
}
