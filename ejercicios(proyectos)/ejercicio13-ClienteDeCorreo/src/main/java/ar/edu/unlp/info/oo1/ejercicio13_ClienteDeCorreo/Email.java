package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo, cuerpo;
	private int tamaño;
	private ArrayList<Archivo> adjuntos;
	
	
	
	public Email(String titulo, String cuerpo) {
		this.tamaño = 0;
		this.adjuntos = new ArrayList<>();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}

	/*tamaño total del email, cuerpo + titulo + adjuntos*/
    public int tamaño(){
    	return this.titulo.length() + this.cuerpo.length() + this.adjuntos.stream().mapToInt(a -> a.tamañoArchivo()).sum();
  }

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public int getTamaño() {
		return tamaño;
	}
	
	/*agrega un archivo a nuestra coleccion de adjuntos*/
	public void agregarAdjunto(Archivo archivo) {
		this.adjuntos.add(archivo);
	}

	/*retorna todos nuestros archivos adjuntos de un email*/
	public List<Archivo> adjuntos(){
		return this.adjuntos;
	}

	/*metodo dentro de email*/
	public boolean contiene(String texto) {
			return (this.titulo.equals(texto)) || (this.cuerpo.equals(texto));
		}
	
	
}
