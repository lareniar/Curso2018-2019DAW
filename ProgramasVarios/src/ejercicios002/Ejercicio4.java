package ejercicios002;
import javax.swing.*;
public class Ejercicio4 {
public static void main(String[] args) {
	
	/* Algoritmo que nos permite introducir por teclado las
	 * calificaciones que ha obtenido un alumno, posteriormente nos mostrar�
	 * la calificaci�n media obtenida por dicho alumno.
	 * (La calificaci�n media se obtiene sumando las calificaciones obtenidas
	 * dividiendo entre el n�mero de notas que has sumado) */
	
	int calificaciones, contador;
	float notas, total, resultado;
	total = 0;
	calificaciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime cu�ntas calificaciones vas a meter"));
	contador = calificaciones;
	/*Haremos que las notas introducidas se guarden en una variable para luego hacer la suma de estas */
	do {
		contador = contador - 1;
		notas = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta la nota"));
		total = notas + total;
	}while (contador != 0);
	resultado = total/calificaciones;
	JOptionPane.showMessageDialog(null, "Tu nota media es de: " + resultado);
		
	}







	}

