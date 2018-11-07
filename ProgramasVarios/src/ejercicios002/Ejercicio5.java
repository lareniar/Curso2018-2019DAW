package ejercicios002;
import javax.swing.*;
public class Ejercicio5 {
public static void main(String[] args) {
	
	/*Algoritmo que nos permita introducir por teclado un número
	 * y posteriormente nos diga si el número introducido es primo o no.
	 * Un número es primo cuando solamente es divisible por dicho número y
	 * la unidad, por ejemplo: 5 es primo solo es divisible entre 5 y entre 1, 6 no es primo,
	 * ya que es divisible entre 1, 2, 3 y 6
	 */
	
	int numPrimo, contador;
	float division;
	
	numPrimo = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un número para saber si es primo o no"));
	contador = numPrimo;
	
	do {
		contador -= 1;
		division = numPrimo/contador;
	}while (division == numPrimo);
	
	if (division != numPrimo) {
		JOptionPane.showMessageDialog(null,"Tu número no es primo");
	}else {
		JOptionPane.showMessageDialog(null, "Tu número es primo");
	}
	}
}
