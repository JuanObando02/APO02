package codigos;
import java.util.Scanner;

public class clas5act1 {
	
			/*variables*/
		static char tablero[][];
		static final byte ganador = 1, perdedor = 2 , empate = 0;
		static char turno;
		
		/*variables y constantes*/
		
		static final int NUM_FILAS = 3, NUM_COLUMNAS = 3;
		static final int NUM_JUGADORES = 2;
		static final char vacio = '_';
		static final char casilla_x = 'X';
		static final char casilla_o = 'O';
		static String jugador_1;
		static String jugador_2;
		
		public static void main(String[] args) {
			
			int x=1,contador=0;
			boolean movimiento,ganador;
			
			tablero = new char [NUM_FILAS][NUM_COLUMNAS];
			Scanner teclado = new Scanner(System.in);
			
			while(x != 2) {
				
				ganador=false;
				iniciar_tablero();
				contador=0;
				solicitar_nombres();
				
				for(contador=0;contador<9;contador++) {
					imprimir_tablero();
					if (contador%2 == 0) {
						do {
							movimiento = solicitar_movimiento (jugador_1,casilla_x);
						} while (movimiento == false);
						ganador = validar(casilla_x);
						if (ganador == true) {
							System.out.println("Ganaste: "+jugador_1+"\nFelicidades.");
							contador=10;
						}
					}
					
					if (contador%2 == 1) {
						do {
							movimiento = solicitar_movimiento (jugador_2,casilla_o);
						} while (movimiento == false);
						ganador = validar(casilla_o);
						if (ganador == true) {
							System.out.println("Ganaste: "+jugador_2+"\nFelicidades.");
							contador=10;
						} 
					}
					if (contador == 9) {
						System.out.println("No hay ganador. Empate");
						contador = 10;
					}
				}
				do{
				System.out.println("¿Quieren volver a jugar? Si:1 o No:2");
				x = teclado.nextInt();
				System.out.println(x);
				} while (x<=0 || x>2);
				
			}
		}
		
		public static boolean solicitar_movimiento (String jugador,char ficha) {
			Scanner leer = new Scanner (System.in);
			System.out.println("Digita el movimiento:"+jugador);
			byte pos = leer.nextByte();
			boolean valido=false;
			
				switch(pos) {
					case 1:
						if (tablero[0][0] == vacio) 
						{
							tablero[0][0]= ficha;
							valido = true;
						} else {
							System.out.println("Casilla ocupada.");
						}
					break;
					case 2:
						if (tablero[0][1] == vacio) 
						{
							tablero[0][1]= ficha;
							valido = true;
						} else {
							System.out.println("Casilla ocupada.");
						}
					break;
					case 3:
						if(tablero[0][2] == vacio) 
						{
							tablero[0][2]= ficha;
							valido = true;
						} else {
							System.out.println("Casilla ocupada.");
						}
					break;
					case 4:
						if(tablero[1][0] == vacio) 
						{
							tablero[1][0]= ficha;
							valido = true;
						} else {
							System.out.println("Casilla ocupada.");
						}
					break;
					case 5:
						if(tablero[1][1] == vacio) 
						{
							tablero[1][1]= ficha;
							valido = true;
						} else {
							System.out.println("Casilla ocupada.");
						}
					break;
					case 6:
						if(tablero[1][2] == vacio) 
						{
							tablero[1][2]= ficha;
							valido = true;
						} else {
							System.out.println("Casilla ocupada.");
						}
					break;
					case 7:
						if(tablero[2][0] == vacio) 
						{
							tablero[2][0]= ficha;
							valido = true;
						}else {
							System.out.println("Casilla ocupada.");
						}
					break;
					case 8:
						if(tablero[2][1] == vacio) 
						{
							tablero[2][1]= ficha;
							valido = true;
						} else {
							System.out.println("Casilla ocupada.");
						}
					break;
					case 9:
						if(tablero[2][2] == vacio) 
						{
							tablero[2][2]= ficha;
							valido = true;
						} else {
							System.out.println("Casilla ocupada.");
						}
					break;
					default:
						System.out.println("Digita un numero valido.");
						valido = false;
					break;
			}
				return valido;
		}
			
		// reiniciar tablero
		
		public static void iniciar_tablero() {
			for(int i=0 ; i<3 ; i++) {
				for(int j=0 ; j<3 ; j++) {
					tablero[i][j]= vacio;
				}
			}
		}
		
		// Imprimir tablero
		
		public static void imprimir_tablero() {
			System.out.printf("Este es el tablero de juego:\n");
			for (int i=0;i<3;i++) {
				for (int j=0;j<3;j++) {
					System.out.printf(" %s ",tablero[i][j]);
				}
				System.out.println();
			}
		}
		
		//validar ganador
		
		public static boolean validar (char jugador) {
			boolean ValorRetorno = false; 
				if(		tablero[0][0] == jugador && 
						tablero[1][1] == jugador && 
						tablero [2][2] == jugador )  
				{
					ValorRetorno = true;
				} else if(	tablero[0][2] == jugador && 
							tablero[1][1] == jugador && 
							tablero[2][0] == jugador) 
				{
					ValorRetorno = true;
				} 
				
				for(int i=0 ;i<2 ;i++) {
					if(	tablero[i][0] == jugador &&
						tablero[i][1] == jugador &&
						tablero[i][2] == jugador ) 
					{
						ValorRetorno = true;
					} else if(	tablero[0][i] == jugador &&
								tablero[1][i] == jugador &&
								tablero[2][i] == jugador) 
					{
						ValorRetorno = true;
					}
				}
			return ValorRetorno;
		}
		
		//solicitar nombres
		
		public static void solicitar_nombres() {
			Scanner leer = new Scanner(System.in);
			System.out.printf("Escriba el nombre el jugador 1:\n");
			jugador_1 = leer.nextLine();
			System.out.printf("Escriba el nombre el jugador 2:\n");
			jugador_2 = leer.nextLine();
		}
		

}

	

