package prueba;
import javax.swing.*;
public class HolaMundo {
	public static void main(String[] args){
		System.out.println("Hola");
		int n = Integer.parseInt(JOptionPane.showInputDialog("Dame el valor n"));
		int x = Integer.parseInt(JOptionPane.showInputDialog("Dame el valor x"));
		System.out.println("Introduce valor a la x");
		JOptionPane.showMessageDialog(null,"Tu valor total es: " + (x+n));
	}
}