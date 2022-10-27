package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import Model.Paciente;

public class Tester {
	private Paciente paciente;

	@Before
	public void preparacion() {
		paciente = new Paciente();
	}
	
	@Test
	public void testBienEscrito3() {
	 try {
	 assertEquals(null, paciente.inverso(null));
	 fail("deberia haber lanzado una excepcion");
	 } catch (Exception e) {
	 // funciona correctamente
	 }
	}
	
	@Test
	public void testBienEscrito1() throws Exception {
	 assertEquals("cba", paciente.inverso("abc"));
	}
	
	@Test(expected = Exception.class)
	public void testMalEscrito1() throws Exception {
	 assertEquals("cba", paciente.inverso("abc"));
	}
	
	@Test
	public void testMalEscrito2() throws Exception {
	 assertEquals(null, paciente.inverso(null));
	}


}
