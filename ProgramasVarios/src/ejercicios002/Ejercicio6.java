package ejercicios002;
import javax.swing.*;
public class Ejercicio6 {
 /*Algoritmo que nos permita introducir
  * por teclado una serie de n�meros enteros
  * que finalizara con el n�mero 0, el programa
  * deber� mostrar por pantalla el n�mero mayor 
  *de los introducidos. */
	public static void main(String[] args) {
		int entero, mayor;
		entero = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta un n�mero entero"));
		mayor = entero;
		do {
			entero = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta otro n�mero, puedes terminar la secuencia con un 0"));
			if (entero > mayor) {
				mayor = entero;
			}
		}while (entero != 0);
		JOptionPane.showMessageDialog(null, "Tu n�mero mayor es: " + mayor);
		}
}
