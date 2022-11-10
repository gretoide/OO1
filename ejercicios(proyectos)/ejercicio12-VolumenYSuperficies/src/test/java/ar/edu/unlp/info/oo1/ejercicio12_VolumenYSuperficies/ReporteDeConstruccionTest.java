package ar.edu.unlp.info.oo1.ejercicio12_VolumenYSuperficies;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {
	private ReporteDeConstruccion reporte;
	private Cilindro cilindro;
	private Esfera esfera;
	private PrismaRectangular prisma;
	
	@BeforeEach
	public void setUp() {
		reporte = new ReporteDeConstruccion();
		cilindro = new Cilindro("Plastico","Mierda",5,5); 
		/*superficie = 172.787596  / volumen = 392.699082 */
		
		esfera = new Esfera("Plastico","Mostaza",5); 
		/*superficie = 314.159265/ volumen = 523.598776*/
		
		prisma = new PrismaRectangular ("Madera","Mostaza",5,5,5); 
		/*superficie = 150 / volumen = 125 */
	}
	
	@Test
	public void testVolumen() {
		assertEquals(0,this.reporte.getVolumenDeMaterial("Plastico"));
		this.reporte.agregarPiezas(prisma);
		this.reporte.agregarPiezas(prisma);
		this.reporte.agregarPiezas(esfera);
		this.reporte.agregarPiezas(cilindro);
		assertEquals(916.297858,reporte.getVolumenDeMaterial("Plastico"),1);
	}
	
	    /*SOY UN CAPO COMO ADRIAN ADRIAN ADRIAN...........*/
	
	@Test
	public void testSuperficie() {
		assertEquals(0,this.reporte.getSuperficieDeColor("Mostaza"));
		this.reporte.agregarPiezas(prisma);
		this.reporte.agregarPiezas(prisma);
		this.reporte.agregarPiezas(esfera);
		assertEquals(614.159265,reporte.getSuperficieDeColor("Mostaza"),1);
	}
}
