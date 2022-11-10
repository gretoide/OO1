package ar.edu.unlp.info.oo1.ejercicio8_distruibuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String domicilio;
	private String nombre;
	private ArrayList<Factura> facturas; /*0..**/
	private ArrayList<Consumo> consumos; /*0..**/
	
	public Usuario(String domicilio, String nombre) {
		super();
		this.domicilio = domicilio;
		this.nombre = nombre;
		this.facturas = new ArrayList<Factura>();
		this.consumos = new ArrayList<Consumo>();
	}

	/*metodos pedidos*/
	public void agregarMedicion(Consumo medicion) {
		consumos.add(medicion);
	}
	
	/*agregar una factura a nuestra coleccion*/
	public void agregarFactura(Factura factura) {
		facturas.add(factura);
	}
	
	/*buscamos el ultimo consumo (el de la fecha mas reciente)
	 * metodo privado que reutilizamos*/
	public Consumo ultimoConsumo() {
		return consumos.stream().max((consumo1,consumo2) -> consumo1.fecha().compareTo(consumo2.fecha())).orElse(null);
	}
	
	/*genera una factura donde dependiendo del cas*/
	public Factura facturarEnBaseA(double precioKWh) {
		Consumo ultimo = this.ultimoConsumo();
		if(ultimo != null) {
			if(ultimo.factorDePotencia() > 0.8) {
				return new Factura(ultimo.costoEnBaseA(precioKWh),10,this);
			}
			return new Factura(ultimo.costoEnBaseA(precioKWh),0,this);
		}
		return new Factura(0,0,this);
	}
	
	
	public String getDomicilio() {
		return domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Factura> facturas(){
		return this.facturas;
	}
	
	/**
	 * Obtiene el consumo de energía activa desde el consumo con fecha más reciente.
	 * Si no hay ningún consumo, retorna 0
	 */
	public double ultimoConsumoActiva() {
		if(this.ultimoConsumo() != null) {
			return this.ultimoConsumo().getConsumoEnergiaActiva();
		}
		return 0d;
	}
	
}
