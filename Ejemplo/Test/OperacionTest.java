import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperacionTest {
	@Test
	public void testSumar() {
		//Probar el metodo sumar
		Operacion o = new Operacion();
		int v = o.sumar(2, 3);
		assertEquals(5, v);
	}
}
