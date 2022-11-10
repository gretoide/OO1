package ar.edu.unlp.info.oo1.ejercicio16_PoliticaDeDevolucion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlquilerDePropiedadesTest {
	private AlquilerDePropiedades sistema;
	
	private Usuario propietario, propietario2 ,usuario,usuario2,usuario3;
	
	private DateLapse periodo,periodo2,periodo3,periodoCalculo,periodoLapso;
	
	private PoliticaDeDevolucion estricta,flexible,moderada;
	
	private Propiedad propiedad, propiedad2, propiedad3;
	
	private Reserva reserva, reserva2, reserva3;
	
	@BeforeEach
	public void setUp() {
		sistema = new AlquilerDePropiedades();
		
		propietario = sistema.registrarUsuario("Pepe","Tolosa",44555666);
		propietario2 = sistema.registrarUsuario("Pepito","Tolosa",44555666);
		
		estricta = new Estricta();
		moderada = new Moderada();
		flexible = new Flexible();
	
		usuario = sistema.registrarUsuario("Julio", "Berisso",22333444);
		usuario2 = sistema.registrarUsuario("Jose", "Berisso",22333444);
		usuario3 = sistema.registrarUsuario("Juan", "Berisso",22333444);
		
		propiedad  = sistema.registrarPropiedad("Il Capo","Cabañita" ,"Chascomús",5000, propietario, estricta);
		propiedad2 = sistema.registrarPropiedad("Il Capo","Cabañita2","Chascomús",5000, propietario, flexible);
		propiedad3 = sistema.registrarPropiedad("Il Capo","Cabañita3","Chascomús",5000, propietario2, moderada);
		
		propietario.agregarPropiedad(propiedad);
		propietario.agregarPropiedad(propiedad2);
		propietario2.agregarPropiedad(propiedad3);

		periodo       = new DateLapse(LocalDate.of(2023, 1, 1) ,LocalDate.of(2023, 1,10));
		periodo2      = new DateLapse(LocalDate.of(2023, 1, 10),LocalDate.of(2023, 1,20));
		periodo3      = new DateLapse(LocalDate.of(2023, 1, 20),LocalDate.of(2023, 1,30));
		periodoCalculo = new DateLapse(LocalDate.of(2023, 1, 9),LocalDate.of(2023, 1,19));
		periodoLapso   = new DateLapse(LocalDate.of(2023, 1, 1),LocalDate.of(2023, 1,31));
	}
	
	@Test
	public void testRegistrarUsuario() {
		assertEquals(5,sistema.getUsuarios().size());
		sistema.registrarUsuario("Jose", "Berisso",22333444);
		sistema.registrarUsuario("Julio", "Berisso",22333444);
		assertEquals(7,sistema.getUsuarios().size());
		
	}
	
	@Test
	public void testRegistrarPropiedad() {
		assertEquals(3,sistema.getPropiedades().size());
		sistema.registrarPropiedad("Il Capo","Cabañita","Chascomús",5000,propietario, moderada);
		sistema.registrarPropiedad("Il Capo","Cabañita","Chascomús",5000,propietario, estricta);
		assertEquals(5,sistema.getPropiedades().size());
		
	}
	
	@Test
	public void testReservar() {
		sistema.reservar(periodo, propiedad, usuario);
		sistema.reservar(periodo2, propiedad, usuario);
		sistema.reservar(periodo3, propiedad, usuario3);
		assertEquals(2,usuario.getReservas().size());
		assertEquals(1,usuario3.getReservas().size());
	}
	
	@Test
	public void testBuscarPropiedadesDisponibles() {
		sistema.reservar(periodo, propiedad, usuario);
		sistema.reservar(periodo2, propiedad2, usuario2);
		sistema.reservar(periodo3, propiedad3, usuario3);
		assertEquals(1,sistema.buscarPropiedadesDisponibles(periodoCalculo).size());
	}
	
	@Test 
	 public void testEliminarReserva() { 
		sistema.reservar(periodo, propiedad, usuario);
		reserva = sistema.reservar(periodo2, propiedad2, usuario);
		sistema.reservar(periodo3, propiedad3, usuario);
		
		assertEquals(3,usuario.getReservas().size());
		
		sistema.eliminarReserva(reserva);
		
		assertEquals(2,usuario.getReservas().size()); 
	}
	
	@Test
	public void testDevolucion() {
		/*flexible*/
		reserva = sistema.reservar(periodo, propiedad, usuario);
		assertEquals(450000,sistema.devolucion(flexible, reserva, LocalDate.of(2022, 12, 12)));
		
		/*moderada*/
		reserva2 = sistema.reservar(periodo2, propiedad2, usuario);
		assertEquals(45000,sistema.devolucion(moderada, reserva3, LocalDate.of(2023, 1, 17)));
		
		/*estricta*/
		reserva3 = sistema.reservar(periodo3, propiedad3, usuario);
		assertEquals(0,sistema.devolucion(estricta, reserva, LocalDate.of(2022, 12, 12)));
	}
	
	
	@Test
	public void testObtenerReservasDeUsuario() {
		sistema.reservar(periodo, propiedad, usuario);
		sistema.reservar(periodo2, propiedad2, usuario);
		sistema.reservar(periodo3, propiedad3, usuario3);
		assertEquals(2,usuario.getReservas().size());
		assertEquals(1,usuario3.getReservas().size());
	}
	
	@Test
	public void testCalcularIngresosDePropietario() {
		sistema.reservar(periodo , propiedad, usuario);
		sistema.reservar(periodo2, propiedad2, usuario);
		sistema.reservar(periodo3, propiedad3,usuario);
		assertEquals(95000, sistema.calcularIngresosDePropietario(propietario, periodoLapso));
		assertEquals(45000, sistema.calcularIngresosDePropietario(propietario2, periodoLapso));
	}
	
}
