package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DespachoTest {

	@Before
	public void preparacion() {
	}

	@Test
	public void caseBase() {
		assertEquals("Pido 10 productos", 10, 10);
	}

	@Test
	public void failBase() {
		// me devuelve algo erroneo
		assertFalse(false);
	}

	@Test(expected = Exception.class)
	public void execptionBase() {
		// me devuelve una exeption
		assertEquals("exeption", 0, null);

	}

	@Test
	public void complexBase() {
		assertFalse(10 != 10);
		assertNotEquals(1, 0);
		assertEquals("Pido 10 productos", 10, 10);
	}

}
