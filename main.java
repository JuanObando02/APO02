package triki;
import java.util.Scanner;


public class main {
		
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String jugador_1;
		String jugador_2;
		byte cols=3, filas=3;
		byte x,valor,empieza=0,y,k,c=1,ganador=0;
		byte [][]tablero = new byte[cols][filas];
		byte []marcacion = new byte[9];
		x = 1;
		
			System.out.println("Ingresa el nombre del jugador 1:");
			jugador_1 = teclado.nextLine();
			System.out.println("Ingresa el nombre del jugador 2:");
			jugador_2= teclado.nextLine();
			System.out.printf("Nombres de los jugadores:\n1.%s\n2.%s\n\n",jugador_1,jugador_2);
			/*confirmar el valor digitado sea 1 o 2 del jugeador que empieza*/
			while (x!=0) {
					System.out.println("Digite el numero del jugador que va a comenzar.");
					empieza = teclado.nextByte();
				if (empieza == 1 || empieza == 2) {
					System.out.printf("Empieza el jugador %d con X.\n",empieza);
					x=0;
				} else {
					System.out.printf("Marcaste %d. Marca 1 0 2.\n",empieza);
					x=1;
				}
			}
			for ( int i=0 ; i<3 ; i++) {
				for( int j=0 ; j<3 ; j++){
					tablero[i][j]=0;
				}
			}
			
			System.out.println("Este es el tablero de juego:");
			for ( int i=0 ; i<3 ; i++) {
				for( int j=0 ; j<3 ; j++){
					valor = tablero [i][j];
					switch(valor) {
							case 0:
							System.out.printf(" _ ");
							break;
							case 1:
							System.out.printf(" x ");	
							break;
							case 2:
							System.out.printf(" o ");
							break;
					}
				}
				System.out.println();
			}
			System.out.printf("Marca el numero correspondiente al teclado numerico donde quieras marcar:\n");
			x=1;/*contador del turno*/
			
			do {
				 y = teclado.nextByte();
				 k=0;
					switch(y) {
					case 1:
						if(tablero [0][0]==1 || tablero [0][0]==2) {
							System.out.println("Ese numero ya esta marcado");
						} else {
							tablero [0][0] = c;
							k=2;
						}
						break;
					case 2:
						if(tablero [0][1]==1 || tablero [0][1]==2) {
							System.out.println("Ese numero ya esta marcado");
						} else {
							tablero [0][1] = c;
							k=2;
						}
						break;
					case 3:
						if(tablero [0][2]==1 || tablero [0][2]==2) {
							System.out.println("Ese numero ya esta marcado");
						} else {
							tablero [0][2] = c;
							k=2;
						}						
						break;
					case 4:
						if(tablero [1][0]==1 || tablero [1][0]==2) {
							System.out.println("Ese numero ya esta marcado");
						} else {
							tablero [1][0] = c;
							k=2;
						}						
						break;						
					case 5:
						if(tablero [1][1]==1 || tablero [1][1]==2) {
							System.out.println("Ese numero ya esta marcado");
						} else {
							tablero [1][1] = c;
							k=2;
						}						
						break;
					case 6:
						if(tablero [1][2]==1 || tablero [1][2]==2) {
							System.out.println("Ese numero ya esta marcado");
						} else {
							tablero [1][2] = c;
							k=2;
						}						
						break;
					case 7:
						if(tablero [2][0]==1 || tablero [2][0]==2) {
							System.out.println("Ese numero ya esta marcado");
						} else {
							tablero [2][0] = c;
							k=2;
						}						
						break;
					case 8:
						if(tablero [2][1]==1 || tablero [2][1]==2) {
							System.out.println("Ese numero ya esta marcado");
						} else {
							tablero [2][1] = c;
							k=2;
						}						
						break;
					case 9:
						if(tablero [2][2]==1 || tablero [2][2]==2) {
							System.out.println("Ese numero ya esta marcado");
						} else {
							tablero [2][2] = c;
							k=2;
						}						
						break;
					default:
						System.out.println("no marcaste un numero de del teclado numerico. vuelve a marcar");
						k=1;
						break;
					}
					System.out.printf("Este es el tablero de juego: Turno %d\n",x);
					for ( int i=0 ; i<3 ; i++) {
						for( int j=0 ; j<3 ; j++){
							valor = tablero [i][j];
							switch(valor) {
										case 0:
										System.out.printf(" _ ");
										break;
										case 1:
										System.out.printf(" X ");	
										break;
										case 2:
										System.out.printf(" O ");
										break;
								}
							}
							System.out.println();
						}
					if (c==1) {
						c=2;
					} else {
						c=1;
					}
					if(tablero [0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1){
						ganador=1;
					}
					if(tablero[0][0] == 2 && tablero[0][1] == 2 && tablero [0][2] == 2){
						ganador=2;
					}
					if(tablero [0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1) {
						ganador=1;
					}
					if(tablero [0][0] == 2 && tablero[1][0] == 2 && tablero[2][0] == 2) {
						ganador=2;
					}
					if(tablero[0][0] == 2 && tablero [1][1] == 2 && tablero[2][2] == 2) {
						ganador=2;
					}
					if(tablero[0][0] == 1 && tablero [1][1] == 1 && tablero[2][2] == 1) {
						ganador=1;
					}
					if(tablero[0][2] == 1 && tablero[2][0] == 1 && tablero[1][1] == 1) {
						ganador=1;
					}
					if(tablero[0][2] == 2 && tablero[2][0] == 2 && tablero[1][1] == 2) {
						ganador=2;
					}
					if(tablero[0][1] == 2 && tablero[1][1] == 2 && tablero[2][1] == 2) {
						ganador=2;
					}
					if(tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1) {
						ganador=1;
					}
					if(tablero[1][0] == 1 && tablero[1][2] == 1 && tablero[1][1] == 1) {
						ganador=1;	
					}
					if(tablero[1][0] == 2 && tablero[1][2] == 2 && tablero[1][1] == 2) {
						ganador=2;	
					}
					if(tablero[1][2] == 1 && tablero [2][2] == 1 && tablero[0][2] == 1) { 
						ganador=1;
					}
					if(tablero[1][2] == 2 && tablero [2][2] == 2 && tablero[0][2] == 2) { 
						ganador=2;
					}
					if(tablero[2][0] == 2 && tablero [2][2] == 2 && tablero[2][1] == 2 ) {	
						ganador=2;	
					}
					if(tablero[2][0] == 1 && tablero [2][2] == 1 && tablero[2][1] == 1 ) {	
						ganador=1;	
					}
					
					if(ganador==1){
						k=0;
						if(empieza==2){
						System.out.printf("El ganador es el jugador_%d: %s \nFin del juego.",ganador,jugador_2);
						}
						if(empieza==1){
							System.out.printf("El ganador es el jugador_%d: %s \nFin del juego.",ganador,jugador_1);
						}
					}
					if(ganador==2){
						k=0;
						if(empieza==2){
							System.out.printf("El ganador es el jugador_%d: %s \nFin del juego.",ganador-1,jugador_1);
						}
						if(empieza==1){
							System.out.printf("El ganador es el jugador_%d: %s \nFin del juego.",ganador+1,jugador_2);
						}
					}
						
					if (k==2) { /*turno valido y libre la casilla*/
						k=1;
						x++;/*Contador de los turnos para finalizar el juego*/
					}
					if(x>9) {/*fin de los turnos*/
						k=0;
						System.out.println("Fin del juego.");
					}	
				} while(k==1);
	}

}

