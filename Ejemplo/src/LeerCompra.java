import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("datos.bin"))) {
			Compra c = (Compra) is.readObject(); // el objeto se debe castear al tipo concreto
			System.out.println(c);
			} catch (IOException e) {
			System.out.println("Error. No se pudo deserializar el objeto. " + e.getMessage());
			} catch (ClassNotFoundException e) {
			System.out.println("Error. No se pudo encontrar la clase asociada. " + e.getMessage());
			}
	}

}
