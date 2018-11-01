package ejercicios002;
import javax.swing.*;
public class Ejercicio6 {
 /*Algoritmo que nos permita introducir
  * por teclado una serie de números enteros
  * que finalizara con el número 0, el programa
  * deberá mostrar por pantalla el número mayor 
  *de los introducidos. */
	public static void main(String[] args) {
		int entero, mayor;
		entero = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta un número entero"));
		mayor = entero;
		do {
			entero = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta otro número, puedes terminar la secuencia con un 0"));
			if (entero > mayor) {
				mayor = entero;
			}
		}while (entero != 0);
		JOptionPane.showMessageDialog(null, "Tu número mayor es: " + mayor);
		}
}
