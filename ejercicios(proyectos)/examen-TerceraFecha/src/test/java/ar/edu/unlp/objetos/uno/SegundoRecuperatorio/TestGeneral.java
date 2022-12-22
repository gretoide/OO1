package ar.edu.unlp.objetos.uno.SegundoRecuperatorio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGeneral {
	private Sistema sistema;
	private Cliente c1, c2;
	private Servicio SSabado, SViernes;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new Sistema();
		
		c1 = sistema.registrarCliente("lionel", "argentina");
		c2 = sistema.registrarCliente("emiliano martinez (dibu)", "argentina");
		
		SSabado = sistema.registrarLimpieza(100, 3, 400);
		SViernes = sistema.registrarLimpieza(100, 4, 350);
		
		sistema.contratarUnicaVez(c1, LocalDate.of(2022, 12, 17), SSabado);
		sistema.contratarUnicaVez(c2, LocalDate.of(2022, 12, 16), SViernes);
	}
	
    @Test
    public void testServicio() {
        assertEquals((400 +((400/100)*15)), sistema.montoAAbonarCliente(c1)); /*mismo problema que el anterior, no se si lo multipliqué en vez de sumarlo*/
        assertEquals(400, sistema.montoAAbonarCliente(c2));
    }
}
