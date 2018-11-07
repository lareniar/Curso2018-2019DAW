package ejercicios002_2;
import javax.swing.*;
public class Ejercicio1 {
public static void main(String[] args) {
	int numero, contador, restoNumero, resto;
	numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta un número"));
	contador = 0;
	do {
		restoNumero = numero%10;
		numero = numero/10;
		resto = restoNumero%2;
			if (resto == 0) {
				contador += 1;
			}	
	}while (numero > 0 );
	JOptionPane.showMessageDialog(null,"hay " + contador + " números pares.");
}
}
