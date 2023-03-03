package actividadclase5;
import java.util.Scanner;

public class banco {

	public static void main( String args[] ) {
		int monto,x=1;
		cuenta c1 = new cuenta (100.0);
		cuenta cuenta2 = new cuenta (200.0);
		cuenta cuenta3 = new cuenta (-100.0);
		
		System.out.printf("Saldo de cuenta1: $%.2f\n",c1.obtenersaldo());
		System.out.printf("Saldo de cuenta1: $%.2f\n",cuenta2.obtenersaldo());
		System.out.printf("Saldo de cuenta1: $%.2f\n",cuenta3.obtenersaldo());
		
		Scanner leer = new Scanner (System.in); 
		
		while(x!=0) {
			System.out.println("Bienvenido al banco.\nQue desea realizar:\n1.Consultar Saldo.\n2.Abonar a tu cuenta.\n3.Realizar un retiro a tu cuenta.\n4.salir.");
			x = leer.nextInt();
			switch(x) {
			case 1:
				System.out.println("");
				break;
			case 2:
				System.out.println("");
				break;
			case 3:
				System.out.println("");
				break;
			case 4:
				System.out.println("Gracias por visitarnos hasta la proxima.\n");
				x=0;
				break;
			default:
				System.out.println("No marcaste ninguna de las opciones validas.\n");
				break;
			}
		}
	}
}
