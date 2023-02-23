package tri;
import java.util.Scanner;

public class pruebacalificaciones {

	public static void main(String []args) {
		
		Librocalificaciones milibro = new Librocalificaciones();
		System.out.println("Digite su nombre de curso:");
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine(); 
		milibro.mostrarMensaje(nombre);
	}
	
}
