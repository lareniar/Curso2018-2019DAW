package barquitos_chulis;
import javax.swing.*;
public class pruebaArray {
public static void main(String[] args) {
	int i;
	i = 0;
String[][] cadena=new String[6][6];
String result="";
for (int j=0; j<= 3; j++)
{
      result+= cadena[i][j] + "\t";
}
JOptionPane.showInputDialog(null,result);
System.out.println(cadena);


 }
}