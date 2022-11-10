package ar.edu.unlp.info.oo1.ejercicio6_redDeAlumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean estado;
	private ArrayList<Farola> redAlumbrado;
	
	public Farola() {
		redAlumbrado = new ArrayList<Farola>();
		estado = false;
	}
	/*IsONn*/
	public boolean isOn() {
		return estado;
	}
	/*turnOn y turnOff*/
	public void turnOn() {
		if(this.isOn() == false) {
			this.estado=true;
			this.redAlumbrado.forEach(farola -> farola.turnOn());
		}
	}
	
	public void turnOff() {
		if(this.isOn() == true) {
			this.estado=false;
			this.redAlumbrado.forEach(farola -> farola.turnOff());
		}
	}
	
	/*crea la relacion vidireccional de farolas*/
	public void pairWithNeighbor(Farola otraFarola) {
		if(!redAlumbrado.contains(otraFarola)) {
			redAlumbrado.add(otraFarola);
			otraFarola.agregarme(this);
		}
	}
	/*me agrego en la coleccion*/
	public void agregarme(Farola unaFarola) {
		this.redAlumbrado.add(unaFarola);
	}
	
	/*retorna las farolas vecinas*/
	public List<Farola> getNeighbors() {
		return this.redAlumbrado;
	}
	

	
}
