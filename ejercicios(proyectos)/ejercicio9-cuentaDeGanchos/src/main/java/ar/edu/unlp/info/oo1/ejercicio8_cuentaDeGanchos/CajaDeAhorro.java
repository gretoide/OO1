package ar.edu.unlp.info.oo1.ejercicio8_cuentaDeGanchos;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro() {
		super();
	}
	
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto + (monto * 0.02));
	}
	
	/*deposita con el 2% aplicado*/
	public void depositar(double monto) {
		super.depositar(monto - (monto * 0.02));
	}

	@Override
	public boolean puedeExtraer(double monto) {
		if(this.getSaldo() >= monto + (monto * 0.02)){
			return true;
		}
		return false;
	}
	

}
