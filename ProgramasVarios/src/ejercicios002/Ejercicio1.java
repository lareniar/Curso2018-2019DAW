package ejercicios002;
import javax.swing.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador, resultado;
		contador = 1;
		resultado = 0;
		while (contador <= 10) {
			resultado = resultado + contador;
			contador++;
		}
		JOptionPane.showMessageDialog(null,"El número es " + resultado);
	}

}
