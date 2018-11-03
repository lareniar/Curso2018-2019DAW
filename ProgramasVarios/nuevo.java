package barquitos_chulis;
import javax.swing.*;

public class nuevo {
	public static void main(String[] args) 
	{
		/* Jugadores*/
		String Nombre1="", exit="", Nombre2="", ataque1="", ataque2="", coordenada1="", coordenada2="", s1="",s2="", exitMayus="";
		
		/*Tableros para el juego y otros datos*/
		int row = 10, column = 10;
		String[][] cuadriculaVacioJ1 = new String[row][column];
		String[][] cuadriculaVacioJ2 = new String[row][column];
		String[][] cuadriculaBarcosJ1 = new String[row][column];
		String[][] cuadriculaBarcosJ2 = new String[row][column];
		String letrasArray[] = new String[] {"A","B","C","D","E","F","G","H","I","J"};
		
		/*Variables*/
		int portaaviones = 5, buque = 4, lancha = 3, velero = 2, txalupa = 1;
		boolean barcosColocados=false;
		
		
		/*Nombre de jugadores e introducción
		 * 
		 * 
		 * 
		 * Aquí el nombre del jugador 1:
		 * */
		// Hasta que el jugador no ponga el nombre, no salimos del bucle
		do{
			
			Nombre1 = JOptionPane.showInputDialog(null, "Jugador 1, Introduce tu nombre:");
			
			//Aquí entramos si el jugador le da a "cancelar" y entraremos en el proceso de cerrar o no el programa
			if (Nombre1 == null) {
				do{
					exit = JOptionPane.showInputDialog(null, "¿Seguro que quieres salir del programa? S/N");
					//Si el jugador no le da a cancelar, entramos aquí
					if (exit != null)
					{
						exitMayus = exit.toUpperCase();
						switch(exitMayus)
						{
							case "S":
								System.exit(0);
							case "N": 
								JOptionPane.showMessageDialog(null, "¡Volvemos a los barcos!");
								Nombre1 = "";
								break;
							default:
								JOptionPane.showMessageDialog(null, "Introduce una S de Sí o una N de No.");
						}
					}		
				}while((exit == null) || (exit.equals("")));
				//Aquí termina, si el jugador pone S salimos del programa, sino volvemos a elegir nombre para el jugador1
			}
				
		}while((Nombre1 == null) || (Nombre1.equals("")));
		
		/*Nombre del jugador 2
		 * 
		 * El primer do es para entrar al bucle de que el jugador introduzca el nombre
		 * 
		 */
		do{
			
			Nombre2 = JOptionPane.showInputDialog(null, "Jugador 2, Introduce tu nombre:");
			
			//Aquí entramos si el jugador le da a "cancelar" y entraremos en el proceso de cerrar o no el programa
			if (Nombre2 == null) {
				do{
					exit = JOptionPane.showInputDialog(null, "¿Seguro que quieres salir del programa? S/N");
					if (exit != null)
					{
						exitMayus = exit.toUpperCase();
						switch(exitMayus)
						{
							case "S":
								System.exit(0);
							case "N": 
								JOptionPane.showMessageDialog(null, "¡Volvemos a los barcos!");
								Nombre2 = "";
								break;
							default:
								JOptionPane.showMessageDialog(null, "Introduce una S de Sí o una N de No.");
						}
					}		
				}while((exit == null) || (exit.equals("")));
				//Aquí termina, si el jugador pone S salimos del programa, sino volvemos a elegir nombre para el jugador 2
			}
				
		}while((Nombre2 == null) || (Nombre2.equals("")));
		
		
		/* Dentro de todo esto, imprimiremos las columnas en vacio, indicado por un 0
		 * Esta es la cuadricula de Jugador1
		 **/
		
        System.out.println("ESTE ES EL TABLERO DE JUGADOR 1");
        
		for (int i = 0; i < column; i++)
		{
			System.out.print(" " + " " + i);
		}
		System.out.print("\n");
		for (int i = 0; i < row; i++) 
		{ 
			System.out.print(letrasArray[i]);
			for (int j = 0; j < column; j++) 
			{
				cuadriculaVacioJ1[i][j] = "0";
                System.out.print("[" + cuadriculaVacioJ1[i][j] + "]");
            }
            System.out.println();
            
    		
        }
		
		
		/* Dentro de todo esto, imprimiremos las columnas en vacio, indicado por un 0
		 * Esta es la cuadricula de Jugador2
		 **/
        
		System.out.println("ESTE ES EL TABLERO DE JUGADOR 2");
		for (int i = 0; i < column; i++){
			System.out.print(" " + " " + i);
		}
		
		System.out.print("\n");
		
		for (int i = 0; i < row; i++) 
		{ 
			System.out.print(letrasArray[i]);
			for (int j = 0; j < column; j++) 
			{
				cuadriculaVacioJ2[i][j] = "0";
                System.out.print("[" + cuadriculaVacioJ2[i][j] + "]");
                
			}
            System.out.println();   
            
		}
		
		/*Ahora haremos que el Jugador1 coloque los barcos
		 * 
		 */
		System.out.println("Jugador 1, Introduce la posicón de tus barcos:");
		do {
			coordenada1 = JOptionPane.showInputDialog(null, "Jugador 1, Introduce la posicón de tus barcos:");
			
			System.out.println(" TABLERO DE JUGADOR 1\n");
			/*Este será el tablero que vamos a ir rellenando
			 * de jugador 1 
			 */
			
			String[] coord1 = new String[2];
			coord1[2] = coordenada1;
			int i = 0;
			s1=s1+coord1[i].charAt(0);//s1=letra
			s2=s2+coord1[i].charAt(1);//s2=numero en version caracter
			JOptionPane.showMessageDialog(null, s1 + s2);
			i = 0;
			s2="";
			s1=s1+coord1[i].charAt(0);//s1=letra
            s2="";
            s2=s2+coord1[i].charAt(1);//s2=numero en version caracter
            i = 0;
				for (i = 0; i < column; i++)
				{
					System.out.print(" " + " " + i);
				}
				System.out.print("\n");
				for (i = 0; i < row; i++) 
				{ 
					System.out.print(letrasArray[i]);
					for (int j = 0; j < column; j++) 
					{
						cuadriculaVacioJ1[i][j] = "0";
						System.out.print("[" + cuadriculaBarcosJ1[i][j] + "]");
					}
					System.out.println();
	            
	    		
				}
		}while (barcosColocados = false);
		
		//coordenada2 = JOptionPane.showInputDialog(null, "Jugador 2, Introduce la posicón de tus barcos:");
		
		/*Ahora haremos el ataque de los barcos
		 * 
		 */
		//ataque1 = JOptionPane.showInputDialog(null, "Jugador 1, Introduce tu nombre:");
		//ataque2 = JOptionPane.showInputDialog(null, "Jugador 2, Introduce tu nombre:");
		}
}


