package ejercicios002;
import javax.swing.*;
public class Ejercicio3 {
 public static void main(String[] args) {
	 /* Algoritmo que nos permita introducir dos números por teclado (base y potencia)
	  * y posteriormente nos calcule el valor de elevar la base a la potencia introducida
	  * (basePotencia), el resultado se mostrará por pantalla.
	  * La potencia la obtendremos mediante multiplicaciones sucesivas, es decir: 75 = 7 * 7 * 7 * 7 * 
	  */
	 int base, potencia,resultado;
	 base = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la base: "));
	 potencia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la potencia"));
	 resultado = 1;
	 if (potencia == 0) {
	 }else {
	 	do {
	 		potencia = potencia - 1;
	 		resultado = resultado * base;
		 
	 	}while(potencia != 0 );
	 }
	 JOptionPane.showMessageDialog(null,"Vamos a ver el resultado es: " + resultado);
 }
	 }
 
 
