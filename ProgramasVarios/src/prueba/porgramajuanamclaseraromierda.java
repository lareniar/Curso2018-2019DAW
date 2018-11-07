package prueba;
import javax.swing.*;
public class porgramajuanamclaseraromierda {
	public static void main(String[] args){
		/* programa sumar numero octal
		 *  comprobar que es b ase  octal
		 */
		int num1, num2, octal1, octal2, contador,suma, suma1, suma2, resto, resto1, resto2, total;
		boolean intentos = false;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserta un número en base octal: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta un número en base octal: "));
		suma = 0;
		octal1 = num1;
		octal2 = num2;
		contador = 0;
		do{
			if (contador == 3){
				JOptionPane.showMessageDialog(null,  "No te quedan más intentos.");
				break;
			}else{
				/* saber si num1 es octal*/
				resto = num1%10;
				if (resto >= 9){
					num1 = Integer.parseInt(JOptionPane.showInputDialog("El primer número no está en base octal"));
					contador += 1;
					octal1 = num1;
					num1 = num1*10;
				}else{	
					num1 = num1/10;
				}

		/*saber si num2 es octal*/
			
				resto2 = num2%10;
				if (resto2 >= 9){
					num2 = Integer.parseInt(JOptionPane.showInputDialog("El segundo número no está en base octal"));
					contador += 1;
					octal2 = num2;
					num2 = num2*10;
				}else{	
					num2 = num2/10;
				}
			}
		}while (num1 >= 0 );
		
	 /* hasta aqui los numeros son octales*/
		if (intentos == true){
			JOptionPane.showMessageDialog(null, "No has aprobado");
		}else{
			/* suma de octales*/
			do{
				num1 = octal1;
			
			num2 = octal2;
			resto1 = num1%10;
			resto2 = num2%10;
			suma = (resto1 + resto2);
				if (suma > 8){
					total = (resto1 + resto2) - 8;		
				}else{
				num1 = num1/10;
				num2 = num2/10;
				}
			}while (num2 >= 0);
			
			JOptionPane.showMessageDialog(null, octal2 + octal1);
		}JOptionPane.showMessageDialog(null, octal2 + octal1);
	}
}

