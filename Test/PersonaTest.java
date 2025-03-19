import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonaTest {

	@Test
	public void testNombre() {
		Persona p = new Persona("Jon", "Ibarreche", 21);
		String n = p.getNombre();
		assertEquals("Jon", n);
	}
	@Test
	public void testApellido() {
		Persona p = new Persona("Jon", "Ibarreche", 21);
		String a = p.getApellido();
		assertEquals("Ibarreche", a);
	}
	@Test
	public void testNombreCompleto() {
		Persona p = new Persona("Jon", "Ibarreche", 21);
		String nc = p.getNombreCompleto();
		assertEquals("Ibarreche"+", "+ "Jon", nc);
	}
	@Test
	public void testEdad() {
		Persona p = new Persona("Jon", "Ibarreche", 21);
		assertEquals(21, p.getEdad());
	}
	@Test
	public void testEsMayorEdad() {
		Persona p = new Persona("Jon", "Ibarreche", 21);
		assertEquals(21, p.getNombreCompleto());
	}
	
}
