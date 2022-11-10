package ar.edu.unlp.info.oo1.ejercicio5_genealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	/*familia*/
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero() {
		
	}

	public Mamifero(String identificador) {
		this.identificador = identificador;
	}

	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	/*abuelos maternos*/
	public Mamifero getAbueloMaterno() {
		if(madre==null) {
			return null;
		}
		else {
			return madre.getPadre();
		}
	}
	
	public Mamifero getAbuelaMaterna() {
		if(madre==null) {
			return null;
		}
		else {
			return madre.getMadre();
		}
	}
	/*abuelos paternos*/
	
	public Mamifero getAbueloPaterno() {
		if(padre==null) {
			return null;
		}
		else {
			return padre.getPadre();
		}
	}
	
	public Mamifero getAbuelaPaterna() {
		if(padre==null) {
			return null;
		}
		else {
			return padre.getMadre();
		}
	}
	
	/*tiene como ancestro a*/
	public boolean tieneComoAncestroA(Mamifero unMamifero){
		return ((this.padre == unMamifero || this.madre == unMamifero) /*si es la madre o el padre*/
				|| (this.padre != null && this.padre.tieneComoAncestroA(unMamifero)) /*si se cumple que no es null llama*/
				|| (this.madre != null && this.madre.tieneComoAncestroA(unMamifero))); /*si se cumple que no es null llama*/  
	}
	
	/*getters y setters*/
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
