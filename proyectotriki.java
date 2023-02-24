package triki;
import java.util.Scanner;

public class proyectotriki {


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
			
			int x=1;
			tablero = new char [NUM_FILAS][NUM_COLUMNAS];
			Scanner teclado = new Scanner(System.in);
			
			while(x != 0) {
				
				iniciar_tablero();
				System.out.printf("Escriba el nombre el jugador 1:\n");
				jugador_1 = teclado.nextLine();
				System.out.printf("Escriba el nombre el jugador 2:\n");
				jugador_2 = teclado.nextLine();
				
				while(x != 0) {
					imprimir_tablero();
					
				}
			}
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
		
		public static boolean validar (char jugador) 
		{
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


}
