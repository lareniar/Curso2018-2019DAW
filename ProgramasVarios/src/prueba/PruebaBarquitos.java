package prueba;
import javax.swing.*;
public class PruebaBarquitos 
{
	public static void main(String[] args)
	{
		String [] Letras= new String [] {" ","1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10"};
		String [] A = new String[11];
		String [] B = new String[11];
		String [] C = new String[11];
		String [] D = new String[11];
		String [] E = new String[11];
		String [] F = new String[11];
		String [] G = new String[11];
		String [] H = new String[11];
		String [] I = new String[11];
		String [] J = new String[11];
		
		//String[][] Cuadricula=new String[][] {Letras,A,B,C,D,E,F,G,H,I,J};
		
		for(int i=0; i<11;i++)
		{
			if(i==0)
			{
				A[i] = "  A ";
				B[i] = " B ";
				C[i] = " C ";
				D[i] = " D ";
				E[i] = " E ";
				F[i] = " F ";
				G[i] = " G ";
				H[i] = " H ";
				I[i] = " I ";
				J[i] = " J ";
			}else {

				A[i] = "[ ]";
				B[i] = "[ ]";
				C[i] = "[ ]";
				D[i] = "[ ]";
				E[i] = "[ ]";
				F[i] = "[ ]";
				G[i] = "[ ]";
				H[i] = "[ ]";
				I[i] = "[ ]";
				J[i] = "[ ]";
			}
		}
		int n =0;
		for(int i=0;i<11;i++)
		{
			System.out.println( (Letras[i]) + (A[n])+(B[n])+(C[n])+(D[n])+(E[n])+(F[n])+(G[n])+(H[n])+(I[n])+(J[n]));
			n++;
		}
		//JOptionPane.showMessageDialog(null, Cuadricula);
		System.out.println("-----------------------------------------------------------------");
		String s=JOptionPane.showInputDialog(null,"Introduce unas coordenadas (letra y numero");
		if(s.charAt(0)=='A')
		{
			char c= s.charAt(1);
			int a=Integer.parseInt(String.valueOf(c));
			for(int i=0;i<11;i++)
			{
				if(i==0)
				{
					A[i] = "  A ";
					B[i] = " B ";
					C[i] = " C ";
					D[i] = " D ";
					E[i] = " E ";
					F[i] = " F ";
					G[i] = " G ";
					H[i] = " H ";
					I[i] = " I ";
					J[i] = " J ";
				}
				else 
				{
				if(i==a)
					A[i]="[#]";
				}
				System.out.println((Letras[i]+ A[i])+(B[i])+(C[i])+(D[i])+(E[i])+(F[i])+(G[i])+(H[i])+(I[i])+(J[i]));
			}
		}/*
		String Attack=JOptionPane.showInputDialog(null,"Ataca");
		if(Attack==s)
		{JOptionPane.showMessageDialog(null,"barco tocado");}
		else {Attack=JOptionPane.showInputDialog(null,"fallaste,prueba otra vez");}*/
		
	}
/*
----------------------------------------------------------------------------------------------------------------------------
v2
import javax.swing.*;
public class PruebaBarquitos 
{
	public static void main(String[] args)
	{
		String [] Letras= new String [] {" ","1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10"};
		String [] A = new String[11];
		String [] B = new String[11];
		String [] C = new String[11];
		String [] D = new String[11];
		String [] E = new String[11];
		String [] F = new String[11];
		String [] G = new String[11];
		String [] H = new String[11];
		String [] I = new String[11];
		String [] J = new String[11];
		
		//String[][] Cuadricula=new String[][] {Letras,A,B,C,D,E,F,G,H,I,J};
		
		for(int i=0; i<11;i++)
		{
			if(i==0)
			{
				A[i] = "  A ";
				B[i] = " B ";
				C[i] = " C ";
				D[i] = " D ";
				E[i] = " E ";
				F[i] = " F ";
				G[i] = " G ";
				H[i] = " H ";
				I[i] = " I ";
				J[i] = " J ";
			}else {

				A[i] = "[ ]";
				B[i] = "[ ]";
				C[i] = "[ ]";
				D[i] = "[ ]";
				E[i] = "[ ]";
				F[i] = "[ ]";
				G[i] = "[ ]";
				H[i] = "[ ]";
				I[i] = "[ ]";
				J[i] = "[ ]";
			}
		}
		int n =0;
		for(int i=0;i<11;i++)
		{
			System.out.println( (Letras[i]) + (A[n])+(B[n])+(C[n])+(D[n])+(E[n])+(F[n])+(G[n])+(H[n])+(I[n])+(J[n]));
			n++;
		}
		//JOptionPane.showMessageDialog(null, Cuadricula);
		System.out.println("-----------------------------------------------------------------");
		int v=0;
		while(v<5)
		{
			String s=JOptionPane.showInputDialog(null,"Introduce unas coordenadas\nPor ejemplo:A4");
			char cnum= s.charAt(1);
			char cletra=s.charAt(0);
			int a=Integer.parseInt(String.valueOf(cnum));
			switch(cletra)
			{
				case 'A':
					for(int i=0;i<11;i++)
					{
						if(i==0)
						{
							A[i] = "  A ";
							B[i] = " B ";
							C[i] = " C ";
							D[i] = " D ";
							E[i] = " E ";
							F[i] = " F ";
							G[i] = " G ";
							H[i] = " H ";
							I[i] = " I ";
							J[i] = " J ";
						}
						else if(i==a)
						{
							A[i]="[#]";
						}
						System.out.println((Letras[i]+ A[i])+(B[i])+(C[i])+(D[i])+(E[i])+(F[i])+(G[i])+(H[i])+(I[i])+(J[i]));
					}
					break;
				case 'B':
					for(int i=0;i<11;i++)
					{
						if(i==0)
						{
							A[i] = "  A ";
							B[i] = " B ";
							C[i] = " C ";
							D[i] = " D ";
							E[i] = " E ";
							F[i] = " F ";
							G[i] = " G ";
							H[i] = " H ";
							I[i] = " I ";
							J[i] = " J ";
						}
						else if(i==a)
						{
							B[i]="[#]";
						}
						System.out.println((Letras[i]+ A[i])+(B[i])+(C[i])+(D[i])+(E[i])+(F[i])+(G[i])+(H[i])+(I[i])+(J[i]));
					}
					break;
				case 'C':
					for(int i=0;i<11;i++)
					{
						if(i==0)
						{
							A[i] = "  A ";
							B[i] = " B ";
							C[i] = " C ";
							D[i] = " D ";
							E[i] = " E ";
							F[i] = " F ";
							G[i] = " G ";
							H[i] = " H ";
							I[i] = " I ";
							J[i] = " J ";
						}
						else if(i==a)
						{
							C[i]="[#]";
						}
						System.out.println((Letras[i]+ A[i])+(B[i])+(C[i])+(D[i])+(E[i])+(F[i])+(G[i])+(H[i])+(I[i])+(J[i]));
					}
					break;
				case 'D':
					for(int i=0;i<11;i++)
					{
						if(i==0)
						{
							A[i] = "  A ";
							B[i] = " B ";
							C[i] = " C ";
							D[i] = " D ";
							E[i] = " E ";
							F[i] = " F ";
							G[i] = " G ";
							H[i] = " H ";
							I[i] = " I ";
							J[i] = " J ";
						}
						else if(i==a)
						{
							D[i]="[#]";
						}
						System.out.println((Letras[i]+ A[i])+(B[i])+(C[i])+(D[i])+(E[i])+(F[i])+(G[i])+(H[i])+(I[i])+(J[i]));
					}
					break;
				case 'E':
					for(int i=0;i<11;i++)
					{
						if(i==0)
						{
							A[i] = "  A ";
							B[i] = " B ";
							C[i] = " C ";
							D[i] = " D ";
							E[i] = " E ";
							F[i] = " F ";
							G[i] = " G ";
							H[i] = " H ";
							I[i] = " I ";
							J[i] = " J ";
						}
						else if(i==a)
						{
							E[i]="[#]";
						}
						System.out.println((Letras[i]+ A[i])+(B[i])+(C[i])+(D[i])+(E[i])+(F[i])+(G[i])+(H[i])+(I[i])+(J[i]));
					}
					break;
				case 'F':
					for(int i=0;i<11;i++)
					{
						if(i==0)
						{
							A[i] = "  A ";
							B[i] = " B ";
							C[i] = " C ";
							D[i] = " D ";
							E[i] = " E ";
							F[i] = " F ";
							G[i] = " G ";
							H[i] = " H ";
							I[i] = " I ";
							J[i] = " J ";
						}
						else if(i==a)
						{
							F[i]="[#]";
						}
						System.out.println((Letras[i]+ A[i])+(B[i])+(C[i])+(D[i])+(E[i])+(F[i])+(G[i])+(H[i])+(I[i])+(J[i]));
					}
					break;
				case 'G':
					for(int i=0;i<11;i++)
					{
						if(i==0)
						{
							A[i] = "  A ";
							B[i] = " B ";
							C[i] = " C ";
							D[i] = " D ";
							E[i] = " E ";
							F[i] = " F ";
							G[i] = " G ";
							H[i] = " H ";
							I[i] = " I ";
							J[i] = " J ";
						}
						else if(i==a)
						{
							G[i]="[#]";
						}
						System.out.println((Letras[i]+ A[i])+(B[i])+(C[i])+(D[i])+(E[i])+(F[i])+(G[i])+(H[i])+(I[i])+(J[i]));
					}
					break;
				case 'H':
					for(int i=0;i<11;i++)
					{
						if(i==0)
						{
							A[i] = "  A ";
							B[i] = " B ";
							C[i] = " C ";
							D[i] = " D ";
							E[i] = " E ";
							F[i] = " F ";
							G[i] = " G ";
							H[i] = " H ";
							I[i] = " I ";
							J[i] = " J ";
						}
						else if(i==a)
						{
							H[i]="[#]";
						}
						System.out.println((Letras[i]+ A[i])+(B[i])+(C[i])+(D[i])+(E[i])+(F[i])+(G[i])+(H[i])+(I[i])+(J[i]));
					}
					break;
				case 'I':
					for(int i=0;i<11;i++)
					{
						if(i==0)
						{
							A[i] = "  A ";
							B[i] = " B ";
							C[i] = " C ";
							D[i] = " D ";
							E[i] = " E ";
							F[i] = " F ";
							G[i] = " G ";
							H[i] = " H ";
							I[i] = " I ";
							J[i] = " J ";
						}
						else if(i==a)
						{
							I[i]="[#]";
						}
						System.out.println((Letras[i]+ A[i])+(B[i])+(C[i])+(D[i])+(E[i])+(F[i])+(G[i])+(H[i])+(I[i])+(J[i]));
					}
					break;
				case 'J':
					for(int i=0;i<11;i++)
					{
						if(i==0)
						{
							A[i] = "  A ";
							B[i] = " B ";
							C[i] = " C ";
							D[i] = " D ";
							E[i] = " E ";
							F[i] = " F ";
							G[i] = " G ";
							H[i] = " H ";
							I[i] = " I ";
							J[i] = " J ";
						}
						else if(i==a)
						{
							J[i]="[#]";
						}
						System.out.println((Letras[i]+ A[i])+(B[i])+(C[i])+(D[i])+(E[i])+(F[i])+(G[i])+(H[i])+(I[i])+(J[i]));
					}
					break;
				default:
					JOptionPane.showMessageDialog(null,"ERROR");
					break;
				
			}
			v++;
		}
		/*
		if(s.charAt(0)=='A')
		{
			
			for(int i=0;i<11;i++)
			{
				if(i==0)
				{
					A[i] = "  A ";
					B[i] = " B ";
					C[i] = " C ";
					D[i] = " D ";
					E[i] = " E ";
					F[i] = " F ";
					G[i] = " G ";
					H[i] = " H ";
					I[i] = " I ";
					J[i] = " J ";
				}
				else 
				{
				if(i==a)
					A[i]="[#]";
				}
				System.out.println((Letras[i]+ A[i])+(B[i])+(C[i])+(D[i])+(E[i])+(F[i])+(G[i])+(H[i])+(I[i])+(J[i]));
			}
		}/*
		String Attack=JOptionPane.showInputDialog(null,"Ataca");
		if(Attack==s)
		{JOptionPane.showMessageDialog(null,"barco tocado");}
		else {Attack=JOptionPane.showInputDialog(null,"fallaste,prueba otra vez");}*/
		
	}