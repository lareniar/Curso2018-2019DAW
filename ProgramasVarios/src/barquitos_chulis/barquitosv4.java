package barquitos_chulis;
import javax.swing.*;
public class barquitosv4 {
	public static void main (String[]args)
    { 
        /*VARIABLES*/
         //CUADRICULAS Y SUS TAMAÑOS(1FILA PARA LOS NUMS, 1 COLUMNA PARA LAS LETRAS Y EL RESTO PARA LOS BARCOS)
        String[][] Cuadricula1=new String[6][6];
        String[][] Cuadricula2=new String[6][6];
        //CANTIDAD DE BARCOS QUE TENDRA CADA JUGADOR
        String[] Jugador1=new String[3];
        String[] Jugador2=new String[3];
        //ARRAY DE LAS LETRAS QUE HAY QUE COLOCAR POR FILA
        String letras[]=new String[] {" ","A","B","C","D","E"};
        //CONTADORES I=EL NUMERO DE COLUMNA D=NUMERO DE FILA
        int i=0,d=1;
        int contBarcos1=0,contBarcos2=0;//cada vez que entre un barco +1, cuando vuelvan a 0 uno de los dos abrá perdido
        //PRESENTACION E INICO
        String J1=JOptionPane.showInputDialog(null,"Hola jugadores, bienvenidos a 'HUNDIR LA FLOTA',\npor favor jugador1 introduce tu nombre");
        String J2=JOptionPane.showInputDialog(null,"Hola jugador 2, dime tu nombre");
        JOptionPane.showMessageDialog(null,"Para introducir las coordenadas por favor poned primero una letra (A-E) y seguido un número(0-4)\nEjemplo:A4");
        //COLOCACION DE CADA VALOR EN LAS DOS CUADRICULAS
        for(int a=0;a<6;a++)
        {
            System.out.println(" ");
            for(int b=0;b<6;b++)
            {
                if(a==0)//si estamos en la fila 0 pon los numeros de la b (012345) a lo largo de la fila
                {
                    Cuadricula1[a][b]=Integer.toString(i);
                    Cuadricula2[a][b]=Integer.toString(i);
                }
                if(a>0 && b==0)//si no estamos en la fila o (la de los numeros) y b vale 0 (es la primera columna) asignale la letra que toque.
                {
                    Cuadricula1[a][b]=letras[d];
                    Cuadricula2[a][b]=letras[d];
                    d++;//para cambiar de posicion en el array de letras
                }
                else if(a>0 && b>0) {//en el resto de casos (si n es la fila 0 ni la columna 0) dales el valor [0]
                    Cuadricula1[a][b]= "[0]";
                    Cuadricula2[a][b]= "[0]";
                }
                System.out.print(Cuadricula1[a][b] );
                i++;
            }
        }
        i=0;
        int v=0;//vueltas
        while(v<Jugador1.length)//hasta que el array de barcos del jugador1 no este completo...
        {
            String cords=JOptionPane.showInputDialog(null,J1," introduce unas coordenadas");
            cords = cords.toUpperCase();
            for(int x=0;x<Jugador1.length;x++)
            {
                if(cords.equals(Jugador1[x]))
                {
                    do {
                        cords=JOptionPane.showInputDialog(null,"Error,introduce unas coordenadas nuevas");
                        cords = cords.toUpperCase();
                    }while(cords.equals(Jugador1[x]));
                }
                
            }
            Jugador1[i]=cords;
            contBarcos1++;
            //System.out.println("\n" +Jugador1[i] + "\ncoords");
            String s1="";
            s1=s1+Jugador1[i].charAt(0);
            String s2="";
            s2=s2+Jugador1[i].charAt(1);
            int t=Integer.valueOf(s2);
            for(int a=0;a<6;a++)
            {
                for(int b=0;b<6;b++)
                {
                    if(Cuadricula1[a][0].equals(s1)&& b==t)//si la linea empieza por la letra que esta en la posición a en el array letras y la b es igual a la introducida...[a][0]por que la letra esta en la linea en la posicion 0 de columna
                        Cuadricula1[a][b]="[1]";
                }
            }
            for(int a=0;a<6;a++)
            {
                System.out.println(" ");
                for(int b=0;b<6;b++)
                {
                    System.out.print(Cuadricula1[a][b]);//dibuja la cuadricula completa del jugador1
                    //JOptionPane.showMessageDialog(null,Cuadricula1[a][b]);
                }
                    
            }
            v++;
            i++;
        }
        JOptionPane.showMessageDialog(null,"¡Perfecto!, es el turno del jugador 2");
        for(int a=0;a<6;a++)
        {
            System.out.println(" ");
            for(int b=0;b<6;b++)
                System.out.print(Cuadricula2[a][b]);
        }
        i=0;
        v=0;//vueltas
        while(v<Jugador2.length)
        {
            String cords=JOptionPane.showInputDialog(null,J2," introduce unas coordenadas");
            cords = cords.toUpperCase();
            for(int x=0;x<Jugador2.length;x++)
            {
                if(cords.equals(Jugador2[x]))
                {
                    do {
                        cords=JOptionPane.showInputDialog(null,"Error,introduce unas coordenadas nuevas");
                        cords = cords.toUpperCase();
                    }while(cords.equals(Jugador2[x]));
                }
                
            }
            Jugador2[i]=cords;
            contBarcos2++;
            System.out.println("\n" +Jugador2[i] + "\ncoords");
            String s1="";
            s1=s1+Jugador2[i].charAt(0);
            String s2="";
            s2=s2+Jugador2[i].charAt(1);
            int t=Integer.valueOf(s2);
            for(int a=0;a<6;a++)
            {
                for(int b=0;b<6;b++)
                {
                    if(Cuadricula2[a][0].equals(s1)&& b==t)//si la linea empieza por la letra A y la b es igual a la introducida...[a][0]por que la letra esta en la linea en la posicion 0 de columna
                        Cuadricula2[a][b]="[1]";
                }
            }
            for(int a=0;a<6;a++)
            {
                System.out.println(" ");
                for(int b=0;b<6;b++)
                    System.out.print(Cuadricula2[a][b]);
            }
            v++;
            i++;
        }
        //ATAQUE
        i=0;
        boolean atack=false;
        boolean barcoFuera = true;
        while(contBarcos1>0 && contBarcos2>0)
        {
            //ATACA EL JUGADOR1
            String AtaqueJ1=JOptionPane.showInputDialog(null,"Jugador 1, ¡ATACA!");
            AtaqueJ1 = AtaqueJ1.toUpperCase();
            String s1="";
            s1=s1+AtaqueJ1.charAt(0);
            String s2="";
            s2=s2+AtaqueJ1.charAt(1);
            int t=Integer.valueOf(s2);
           
            //revisión de índices para saber si los valores están dentro del rango
            do {
            	for(int a=0;a<6;a++) {
            		if (!s1.equals(letras[a]) && barcoFuera == true) {
            			barcoFuera = true;
            		
            		}else {
            			barcoFuera = false;
            		}
            	}
            	if (barcoFuera == true) {
            		AtaqueJ1=JOptionPane.showInputDialog(null,"Jugador 1, vuelve a introducir los datos dentro del rango");
                    AtaqueJ1 = AtaqueJ1.toUpperCase();
                    s1="";
                    s1=s1+AtaqueJ1.charAt(0);
                    s2="";
                    s2=s2+AtaqueJ1.charAt(1);
                    t=Integer.valueOf(s2);
            	}
            }while (barcoFuera == true);
           
            
            for(int a=0;a<6;a++)
            {
                for(int b=0;b<6;b++)
                {
                    if(Cuadricula2[a][0].equals(s1)&& b==t && atack==false)
                        if(Cuadricula2[a][b]=="[1]")
                            atack=true;
                }
            }
            for(int a=0;a<6;a++)
            {
                System.out.println(" ");
                for(int b=0;b<6;b++)
                {
                    if((Cuadricula2[a][0].equals(s1)&& b==t) && atack==false)//NO LO HACE BIEN, SIEMPRE VA AL HUNDIDO
                    {
                        JOptionPane.showMessageDialog(null,"AGUA");
                        Cuadricula2[a][b]="[/]";
                    }
                        
                    else if((Cuadricula2[a][0].equals(s1)&& b==t) && atack==true)
                    {
                        JOptionPane.showMessageDialog(null,"BARCO HUNDIDO");
                        Cuadricula2[a][b]="[X]";
                        contBarcos2--;
                    }
                        
                    System.out.print(Cuadricula2[a][b]);
                }
                    
            }
            atack=false;
            
            
            //ATACA EL JUGADOR2
            String AtaqueJ2=JOptionPane.showInputDialog(null,"Jugador 2, ¡ATACA!");
            s1="";
            s1=s1+AtaqueJ2.charAt(0);
            s2="";
            s2=s2+AtaqueJ2.charAt(1);
            t=Integer.valueOf(s2);
            for(int a=0;a<6;a++)
            {
                for(int b=0;b<6;b++)
                {
                    if(Cuadricula1[a][0].equals(s1)&& b==t && atack==false)
                        if(Cuadricula1[a][b]=="[1]")
                            atack=true;
                }
            }
            for(int a=0;a<6;a++)
            {
                System.out.println(" ");
                for(int b=0;b<6;b++)
                {
                    if((Cuadricula1[a][0].equals(s1)&& b==t) && atack==false)//NO LO HACE BIEN, SIEMPRE VA AL HUNDIDO
                    {
                        JOptionPane.showMessageDialog(null,"AGUA");
                        Cuadricula1[a][b]="[/]";
                    }
                        
                    else if((Cuadricula1[a][0].equals(s1)&& b==t) && atack==true)
                    {
                        JOptionPane.showMessageDialog(null,"BARCO HUNDIDO");
                        Cuadricula1[a][b]="[X]";
                        contBarcos1--;
                    }
                        
                    System.out.print(Cuadricula1[a][b]);
                }
                    
            }
            atack=false;
        }
        if(contBarcos1==0)
            JOptionPane.showMessageDialog(null,"¡El jugador 2 es el gandor!");
        else
            JOptionPane.showMessageDialog(null,"¡El jugador 1 es el gandor!");

    }
}

