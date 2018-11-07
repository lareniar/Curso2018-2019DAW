package ejercicioPseudocodigoOrdinogrma;
import javax.swing.*;
public class Ejercicio1 {
	public static void main(String[] args) {
		float x, n;
		x = Float.parseFloat(JOptionPane.showInputDialog("Dame el valor de x"));
		n = Float.parseFloat(JOptionPane.showInputDialog("introduce el valor de y"));
		JOptionPane.showMessageDialog(null, "Tus valores son: " + "\nsuma: " + (x+n) + "\nresta: " + (x-n) + "\ndivisión: " + (x/n) + "\nmultiplicación: " +  (x*n));
	
	}
}
