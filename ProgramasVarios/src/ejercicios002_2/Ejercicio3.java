package ejercicios002_2;
import javax.swing.*;
public class Ejercicio3 {

public static void main (String[] args) {
	/*Deseamos codificar un programa en Java que nos permita
	 introducir por teclado un número entero y positivo,
	 posteriormente el programa invertirá el número introducido,
	 mostrando el resultado en la pantalla. 
	 Por ejemplo, número introducido 1526984, número invertido 4896251. */
	
int num, cont, i, cuenta;

num = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta un número"));
i = num;
	do {
		i = i%10;
		for (cuenta = 0; cuenta >= num; cuenta++);
			JOptionPane.showMessageDialog(null, cuenta);
	}while(num >= 0);
}
}
