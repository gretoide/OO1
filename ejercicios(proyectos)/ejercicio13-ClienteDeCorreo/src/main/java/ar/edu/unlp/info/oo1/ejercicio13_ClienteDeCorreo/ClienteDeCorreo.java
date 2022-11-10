package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo(String nombre) {
		inbox = new Carpeta(nombre);
		carpetas = new ArrayList<>();
	}
	
	public List<Carpeta> getCarpetas() {
		return this.carpetas;
	}
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public Carpeta getInbox() {
		return this.inbox;
	}
	
	/*recibe un mail y lo agrega en el inbox - bandeja de entrada*/
	public void recibirEmail(Email unEmail) {
		this.inbox.agregarEmail(unEmail);
	}
	
	/*agrega el email a destino y lo elimina del origen*/
	public void moverEmail(Carpeta origen, Carpeta destino, Email unEmail) {
		destino.agregarEmail(unEmail);
		origen.eliminarEmail(unEmail);
	}
	
	/*busca por todas nuestras carpetas y por todos nuestros emails, el primero
	 * que contenga el texto recibido por parametro, tanto en el titulo o en el
	 * cuerpo*/
	public Email buscarTexto(String texto) {
		return this.carpetas.stream().map(C -> C.buscar(texto)).findFirst().orElse(null);
	}

	/*recorre todas nuestras carpetas y emails sumando su tamañp*/
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(c -> c.tamañoEmails()).sum();
	}
	
}
