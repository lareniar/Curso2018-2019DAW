package ejercicios002_2;
import javax.swing.*;
public class Ejercicio2 {
public static void main(String[] args) {
	int numero, digito, resto;
	boolean numEsta;
	numEsta = false;
	numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu n�mero"));
	digito = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un digito que no est� para confirmarlo"));
	do {
		resto = numero%10;
		if (resto == digito) {
			JOptionPane.showMessageDialog(null, "El n�mero s� est�.");
			numEsta = true;
		}
		numero = numero/10;
	}while (numero > 0);
	if (numEsta == false) {
	JOptionPane.showMessageDialog(null, "No has acertado.");	
	}
}
}