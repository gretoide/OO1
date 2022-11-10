package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<>();
	}
	
	public List<Email> getEmails(){
		return this.emails;
	}
	
	/*agrega email a nuestra coleccion*/
	public void agregarEmail(Email unEmail) {
		this.emails.add(unEmail);
	}
	
	/*elimina email de nuestra coleccion*/
	public void eliminarEmail(Email unEmail) {
		this.emails.remove(unEmail);
	}
	
	/*recorre nuestra lista de emails, buscando el primero que contenga el texto
	 * recibido por parametro, tanto en el titulo como en el cuerpo*/
	 public Email buscar(String texto) {
		    return this.emails.stream().filter(m -> m.contiene(texto)).findFirst().orElse(null);
	}
	 
	/*recorre nuestra lista de emails, sumando el tamaño de cada uno*/
    public int tamañoEmails(){
         return this.emails.stream().mapToInt(e -> e.tamaño()).sum();
    }

	public String getNombre() {
		return nombre;
	}
	
}
