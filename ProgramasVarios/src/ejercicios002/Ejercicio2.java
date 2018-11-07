
package ejercicios002;
import javax.swing.*;
public class Ejercicio2 {
	
	public static void main(String[] args) {
		int contador, n;
		contador = 1;
		n = Integer.parseInt(JOptionPane.showInputDialog("Dime un número del 1 al 10"));
			if ((n < 0) || (n > 10)){
				n = Integer.parseInt(JOptionPane.showInputDialog("Vuelve a insertar otro n"));
			}else{	
				while (n != 0) {
					contador = contador * n;
					n = n - 1;
					;
				}
			}
		JOptionPane.showMessageDialog(null, contador);
		JOptionPane.showMessageDialog(null,"Y ya estaría");	
	}
}
