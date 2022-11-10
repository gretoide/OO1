package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	
	private String texto;
	private int likes;
	private boolean destacado;
	
	/*constructor*/
	public WallPostImpl() { 
		this.texto = "Undefined post";
		this.likes = 0;
		this.destacado = false;
	}
	
	/*retorna el texto de la publicación*/
	public String getText() {
		return this.texto;
	}
	
	/*setea el texto de la publicación*/
	public void setText(String unTexto) {
		this.texto = unTexto;
	}
	
	/*retorna la cantidad de likes*/
	public int getLikes() {
		return this.likes;
	}
	
	/*incrementa en uno la cantidad de likes*/
	public void like() {
		this.likes++;
	}
	
	/*decrementa en uno la cantidad de likes*/
	public void dislike() {
		if(this.likes != 0) {
			this.likes--;
		}
	}
	
	/*retorna destacado*/
	public boolean isFeatured() {
		return this.destacado;
	}
	
	public void toggleFeatured() {
		if(this.destacado == true) {
			this.destacado = false;
		}
		else {
			this.destacado = true;
		}
	}
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }


}
