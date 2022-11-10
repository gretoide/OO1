package ar.edu.unlp.info.oo1.ejercicio8_distruibuidoraElectrica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWh;
	private ArrayList<Usuario> usuarios;
	
	public Distribuidora(double precioKWh) {
		this.precioKWh = precioKWh;
		this.usuarios = new ArrayList<Usuario>();
	}
		
	public double getPrecioKW() {
		return this.precioKWh;
	}
	
	/*metodos pedidos*/
	public void agregarUsuario(Usuario unUsuario) {
		usuarios.add(unUsuario);
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public List<Factura> facturar(){
	 return this.usuarios.stream().map((Usuario usu)-> usu
			 .facturarEnBaseA(this.getPrecioKW()))
			 .collect(Collectors.toList());
	}
	
	public double consumoTotalActiva() {
		 return this.usuarios.stream().mapToDouble((Usuario usu)-> usu.ultimoConsumoActiva()).sum();
	}
	
	public void precioKWh(double precioKWh) {
		
	}
	
	
}

	
