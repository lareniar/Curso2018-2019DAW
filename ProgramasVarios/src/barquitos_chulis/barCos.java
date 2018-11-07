package barquitos_chulis;
import javax.swing.*;

public class barCos {
	 public static void main (String[]args){
            /*VARIABLES*/
               //STRING PARA IMPRIMIR LA CUADRÍCULA EN JOPTIONPANE
               String Cuadricula="";
            //CUADRICULAS Y SUS TAMAÑOS(1FILA PARA LOS NUMS, 1 COLUMNA PARA LAS LETRAS Y EL RESTO PARA LOS BARCOS)
            String[][] Cuadricula1=new String[11][11];
            String[][] Cuadricula2=new String[11][11];
            
            //COPIA DE LAS CUADRICULAS PARA QUE LAS VEA EL ENEMIGO (SIN LOS BARCOS COLOCADOS PERO CON LAS MARCAS DE ATAQUE)-probablemente las quitaremos y lo haremos de otro modo-
            String[][] Cuadricula1Copia=new String[11][11];
            String[][] Cuadricula2Copia=new String[11][11];
           
            //CANTIDAD DE BARCOS QUE TENDRA CADA JUGADOR
            String[] Jugador1=new String[3];
            String[] Jugador2=new String[3];
           
            //ARRAY DE LAS LETRAS QUE HAY QUE COLOCAR POR FILA
            String letras[]=new String[] {" ","A","B","C","D","E","F","G","H","I","J"};
            
            //DECLARACION DE JUGADORES
            String J1=" ";
            String J2=" ";
           
            //STRINGS PARA SEPARAR LA LETRA Y EL NÚMERO QUE INTROCUZCAN LOS JUGADORES COMO COORDENADAS
            String cords="";
            String s1="";
            String s2="";
            
            //STRINGS DE ATAQUE
            String AtaqueJ1=" ";
            String AtaqueJ2=" ";
           
            //COMPROBADOR DEL RESULTADO DEL ATAQUE
            boolean attack = false;
           
            //COMPROBADOR DEL RANGO DE LAS COORDENADAS DE ATAQUE
            boolean barcoFuera = true;
           
            //COMPROBAR SI LAS COORDENADAS INTRODUCIDAS VALEN Y NO ESTÁN REPETIDAS
            boolean cordsValidas=true;
            //PARA GUARDAR EL NÚMERO QUE INTRODUZCAN COMO COORDENADA
            int t=0;
            //CONTADORES I=EL NUMERO DE COLUMNA D=NUMERO DE FILA
            int i=0,d=1;
            int contBarcos1=0,contBarcos2=0;//cada vez que entre un barco +1, cuando vuelvan a 0 uno de los dos habrá perdido
            //PRESENTACION E INICO
            
            do{	
            	J1=JOptionPane.showInputDialog(null,"Bienvenidos a HUNDIR LA FLOTA\n\nJugador1, introduce tu nombre:\n" + " ");
            }while((J1 == null) || (J1.equals(""))); //((J1 == null) || (J1.equals(" ")));
            
            do{
            	J2=JOptionPane.showInputDialog(null,"Jugador 2, introduce tu nombre:\n" + " ");
            }while((J2 == null) || (J2.equals("")));
            
            JOptionPane.showMessageDialog(null,"Instrucciones de juego: \n Cada jugador colocará los siguientes barcos:\n 1 Portaaviones (5 Casillas)\n 2 Buques (3 casillas)\n 2 Lanchas (2 Casilas)\n 1 Velero (1 casilla)\nPara introducir las coordenadas, poned primero una letra (A-J) y seguido un número(0-10)\nEjemplo:A4");
            //COLOCACION DE CADA VALOR EN LAS DOS CUADRICULAS
            
            for(int a=0;a<11;a++)
            {
                System.out.println(" ");
                for(int b=0;b<11;b++)
                {
                    if(a==0)//si estamos en la fila 0 pon los numeros de la b (012345) a lo largo de la fila
                    {
                        Cuadricula1[a][b]=" " + Integer.toString(i) + " ";
                        Cuadricula2[a][b]=" " + Integer.toString(i) + " ";
                        Cuadricula1Copia[a][b]=" " + Integer.toString(i) + " ";
                        Cuadricula2Copia[a][b]=" " + Integer.toString(i) + " ";
                    }
                    if(a>0 && b==0)//si no estamos en la fila 0 (la de los numeros) y b vale 0 (es la primera columna) asignale la letra que toque.
                    {
                        Cuadricula1[a][b]=letras[d];
                        Cuadricula2[a][b]=letras[d];
                        Cuadricula1Copia[a][b]=letras[d];
                        Cuadricula2Copia[a][b]=letras[d];
                        d++;//para cambiar de posicion en el array de letras
                    }
                    else if(a>0 && b>0) {//en el resto de casos (si n es la fila 0 ni la columna 0) dales el valor [0]
                        Cuadricula1[a][b]= "[0]";
                        Cuadricula2[a][b]= "[0]";
                        Cuadricula1Copia[a][b]= "[0]";
                        Cuadricula2Copia[a][b]= "[0]";
                    }
                    Cuadricula+=Cuadricula1[a][b];//GUARDAMOS LOS DATOS EN UN STRING PARA PODER IMPRIMIRLO EN EL JOPTION
                    System.out.print(Cuadricula1[a][b] );
                    i++;
                }
                Cuadricula+="\n";//AÑADIMOS UN SALTO DE LÍNEA CADA VEZ QUE EMPIEZA UNA LINEA NUEVA
            }
            //JOptionPane.showMessageDialog(null,Cuadricula);//IMPRIMIR EN JOptionPane el string Cuadricula
           // Cuadricula="";//Limpiamos el string por que si no lo hacemos en la proxima impresión nos sacara esta cuadricula y la siguiente(las va acumulando)
            i=0;
            int v=0;//vueltas
            while(v<Jugador1.length)//hasta que el array de barcos del jugador1 no este completo...
            {
               do{
            	   cords=JOptionPane.showInputDialog(J1+" introduce unas coordenadas: \n" + Cuadricula).toUpperCase(); //.toUpperCase nos saca del bucle o en el while cords.equals(""), si se quita el .toUpperCase nos quedamos en el bucle
               }while((cords == null) || (cords.equals("")));
                Cuadricula="";
               
                //COMPROBAR LA COORDENADA INTRODUCIDA, QUE NO ESTE FUERA DE RANGO Y QUE NO ESTE YA INTRODUCIDA EN OTRA POSICIÓN ANTERIOR
                do{
                    for(int x=0;x<Jugador1.length;x++)//Recorremos el array de los barcos 
                    {
                        if(cords.equals(Jugador1[x]))//si la coordenada coincide con alguna que ya esté en el array de barcos entra
                        {
                            do {
                            	do{
                                    cords=JOptionPane.showInputDialog(null,"Error,introduce unas coordenadas nuevas").toUpperCase();
                                    //cords = cords.toUpperCase();
                                }while((J2 == null) || (J2.equals("")));
                                x=0;//para que al introducir la nueva coordenada vuelva a recorrer todo el array de barcos
                            }while(cords.equals(Jugador1[x]));
                        }
                        
                    }
                    cordsValidas=false;//si has salido del for es por que la coord no se repite asique cambiamos la bool
                    Jugador1[i]=cords;//asignamos la coordenada al jugador en la posición que esté libre
                    s1="";
                    s1=s1+Jugador1[i].charAt(0);//s1=letra
                    s2="";
                    s2=s2+Jugador1[i].charAt(1);//s2=numero en version caracter
                    if(cords.length()>2)
                    	s2=s2+Jugador1[i].charAt(2);
                    
                    t=Integer.valueOf(s2);//convertimos el caracter numero a int 
                    for(int a=0;a<letras.length;a++) {
                        if (s1.equals(letras[a]) && (t>0 && t<letras.length)) //si la coordenada está en el rango (si la letra está en una de las filas y el num en una columna)
                            barcoFuera = false;//cambiamos la bool 
                    }
                    //Si al salir del for el bool no ha cambiado es porque esta fuera de rango asique entramos al if y pedimos nuevas coordenadas
                    if(barcoFuera==true)
                    {
                    do{
                        cords=JOptionPane.showInputDialog(null,"Error,introduce unas coordenadas nuevas").toUpperCase();
                        System.out.println("NO ESTA EN EL RANGO, DA OTRA VUELTA!");
                    }while((J2 == null) || (J2.equals("")));
                   }
                        
                }while(cordsValidas==true || barcoFuera==true);//si esta fuera de rango o repite la coordenada da otra vuelta para pedir coords nuevas y revisarlas
                //volvemos a poner las bools en true para la siguiente vuelta 
                cordsValidas=true;
                barcoFuera=true;
                contBarcos1++;//añadimos al cont 1 para representar que se ha introducido un barco bien
                for(int a=0;a<11;a++)//Cambiamos el diseño de la coordenada de 0 a 1
                {
                    for(int b=0;b<11;b++)
                    {
                        if(Cuadricula1[a][0].equals(s1)&& b==t)//si la linea empieza por la letra que esta en la posición a en el array letras y la b es igual a la introducida...[a][0]por que la letra esta en la linea en la posicion 0 de columna
                            Cuadricula1[a][b]="[1]";
                    }
                }
                for(int a=0;a<11;a++)
                {
                    System.out.println(" ");
                    for(int b=0;b<11;b++)
                    {
                        Cuadricula+=Cuadricula1[a][b];
                        System.out.print(Cuadricula1[a][b]);//dibuja la cuadricula completa del jugador1
                    }
                    Cuadricula+="\n";
                }
                //JOptionPane.showMessageDialog(null, Cuadricula);
                //Cuadricula="";
                v++;//el numero de vueltas +1
                i++;
            }
            Cuadricula="";
            
            /////SIGUIENTE JUGADOR/////////////////////////////////////////////////////////////
            JOptionPane.showMessageDialog(null,"¡Perfecto!, es el turno de "+J2);
            
            //ENSEÑAMOS LA CUADRICULA DEL2
            for(int a=0;a<11;a++)
            {
                System.out.println(" ");
                for(int b=0;b<11;b++)
                {
                    Cuadricula+=Cuadricula2[a][b];
                    System.out.print(Cuadricula2[a][b]);
                }
                Cuadricula+="\n";   
            }
            //LIMPIAMOS LAS VARIABLES PARA REUTILIZARLAS Y NO HACER UNA VARIABLE POR PERSONA
            i=0;
            v=0;//vueltas
            
            //EMPEZAMOS A COLOCAR LOS BARCOS(IGUAL QUE EL PRIMER JUGADOR)
            while(v<Jugador2.length)
            {
                cords=JOptionPane.showInputDialog(J2+" introduce unas coordenadas: \n" + Cuadricula).toUpperCase();
                Cuadricula="";
                //COMPROBAR LA COORDENADA INTRODUCIDA, QUE NO ESTE FUERA DE RANGO Y QUE NO ESTE YA INTRODUCIDA EN OTRA POSICIÓN ANTERIOR
                do {
                    for(int x=0;x<Jugador2.length;x++)//Recorremos el array de los barcos 
                    {
                        if(cords.equals(Jugador2[x]))//si la coordenada coincide con alguna que ya esté en el array de barcos entra
                        {
                            do {
                                cords=JOptionPane.showInputDialog(null,"Error,introduce unas coordenadas nuevas").toUpperCase();
                                //cords = cords.toUpperCase();
                                x=0;//para que al introducir la nueva coordenada vuelva a recorrer todo el array de barcos
                            }while(cords.equals(Jugador2[x]));
                        }
                        
                    }
                    cordsValidas=false;//si has salido del for es por que la coord no se repite asique cambiamos la bool
                    Jugador2[i]=cords;//asignamos la coordenada al jugador en la posición que esté libre
                    s1="";
                    s1=s1+Jugador2[i].charAt(0);//s1=letra
                    s2="";
                    s2=s2+Jugador2[i].charAt(1);//s2=numero en version caracter
                    if(cords.length()>2)
                    	s2=s2+Jugador2[i].charAt(2);
                    t=Integer.valueOf(s2);//convertimos el caracter numero a int 
                    for(int a=0;a<letras.length;a++) {
                        if (s1.equals(letras[a]) && (t>0 && t<letras.length)) //si la coordenada está en el rango (si la letra está en una de las filas y el num en una columna)
                            barcoFuera = false;//cambiamos la bool 
                    }
                    //Si al salir del for el bool no a cambiado es porque esta fuera de rango asique entramos al if y pedimos nuevas coordenadas
                    if(barcoFuera==true)
                    {
                        cords=JOptionPane.showInputDialog(null,"Error,introduce unas coordenadas nuevas").toUpperCase();
                        System.out.println("NO ESTA EN EL RANGO, DA OTRA VUELTA!");
                    }
                        
                }while(cordsValidas==true || barcoFuera==true);//si esta fuera de rango o repite la coordenada da otra vuelta para pedir coords nuevas y revisarlas
                //volvemos a poner las bools en true para la siguiente vuelta 
                cordsValidas=true;
                barcoFuera=true;
                contBarcos2++;//añadimos al cont 1 para representar que se ha introducido un barco bien
                for(int a=0;a<11;a++)//Cambiamos el diseño de la coordenada de 0 a 1
                {
                    for(int b=0;b<11;b++)
                    {
                        if(Cuadricula2[a][0].equals(s1)&& b==t)//si la linea empieza por la letra que esta en la posición a en el array letras y la b es igual a la introducida...[a][0]por que la letra esta en la linea en la posicion 0 de columna
                            Cuadricula2[a][b]="[1]";
                    }
                }
                for(int a=0;a<11;a++)
                {
                    System.out.println(" ");
                    for(int b=0;b<11;b++)
                    {
                        Cuadricula+=Cuadricula2[a][b];
                        System.out.print(Cuadricula2[a][b]);//dibuja la cuadricula completa del jugador1
                    }
                    Cuadricula+="\n";
                }
                //JOptionPane.showMessageDialog(null, Cuadricula);
                //Cuadricula="";
                v++;//el numero de vueltas +1
                i++;
            }
            Cuadricula="";
            
//////////////////////////////////////////////////////////////////////ATAQUE/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            JOptionPane.showMessageDialog(null, "¡AL ATAQUE!");
            i=0;
            attack=false;//ATAQUE FALLIDO
            barcoFuera = true;//BARCO FUERA DE RANGO
            //MIENTRAS UNO DE LOS DOS NO HAYA LLEGADO A 0 (SE QUEDA SIN BARCOS) SIGUE EN EL WHILE
            while(contBarcos1>0 && contBarcos2>0) {
                if(contBarcos1>0 && contBarcos2>0)//SI LOS DOS SIGUEN TENIENDO BARCOS, ESTO ES PARA QUE SI EN LA VUELTA ANTERIOR HA GANADO EL J2 Y POR ALGUN MOTIVO SIGUE EN EL WHILE, PARA QUE NO HAGA ESTO MAS
                {
                    for(int a=0;a<11;a++)//RECORREMOS LA CUADRICULA PARA IMPRIMIRLA
                    {
                        System.out.println(" ");
                        for(int b=0;b<11;b++)
                        {
                            System.out.print(Cuadricula2Copia[a][b]);
                            Cuadricula+=Cuadricula2Copia[a][b];
                        }
                        Cuadricula+="\n";  
                    }
                   
                    //ATACA EL JUGADOR1
                    AtaqueJ1=JOptionPane.showInputDialog(Cuadricula + J1 + ", ¡ATACA!").toUpperCase();//COORDENADAS DE ATAQUE + IMPRIMIMOS LA CUADRICULA PARA QUE EL JUGADOR LA VEA MIENTRAS ATACA
                    Cuadricula="";
                    s1="";
                    s1=s1+AtaqueJ1.charAt(0);
                    s2="";
                    s2=s2+AtaqueJ1.charAt(1);
                    if(AtaqueJ1.length()>2)
                    	s2=s2+AtaqueJ1.charAt(2);
                    t=Integer.valueOf(s2);
                   
                    //revisión de índices para saber si los valores están dentro del rango
                    do {
                        for(int a=0;a<letras.length;a++) {
                            if (s1.equals(letras[a]) && (t>0 && t<letras.length)) {
                                barcoFuera = false;
                            }
                        }
                        if (barcoFuera == true) {//si el barco esta fuera de rango pedimos coordenadas nuevas y actualizamos las variables
                            AtaqueJ1=JOptionPane.showInputDialog(null, J1 + ", vuelve a introducir los datos dentro del rango").toUpperCase();
                            //AtaqueJ1 = AtaqueJ1.toUpperCase();
                            s1="";
                            s1=s1+AtaqueJ1.charAt(0);
                            s2="";
                            s2=s2+AtaqueJ1.charAt(1);
                            if(AtaqueJ1.length()>2)
                            	s2=s2+AtaqueJ1.charAt(2);
                            t=Integer.valueOf(s2);
                        }
                    }while (barcoFuera == true);//SAL CUANDO LA COORDENADA INTRODUCIDA NO ESTE FUERA DE RANGO
                   //////PODRIAMOS SUSTITUIR ESTO POR COMPROBAR SI LA COORD DE ATAQUE COINCIDE CON UNA DE LAS DEL ENEMIGO Y ASI NO TENER COPIAS DEL TABLERO
                    //COMPROBAR LA COORDENADA QUE SIMBOLO TIENE EN LA CUADRICULA DEL ENEMIGO (0,1,/,X)
                    for(int a=0;a<11;a++)
                    {
                        for(int b=0;b<11;b++)
                        {
                            if(Cuadricula2[a][0].equals(s1)&& b==t)//CUANDO COINCIDA CON UNA DE LAS COORDENADAS DEL TABLERO
                                //COMPROBAMOS SI EN ESA CUADRICULA HAY 0 O  1
                                if(Cuadricula2[a][b]=="[1]")//SI HAY UN 1 HAS DADO A UN BARCO
                                {
                                    attack=true;
                                    //JOptionPane.showMessageDialog(null,"BARCO HUNDIDO");
                                    Cuadricula2[a][b]="[X]";
                                    Cuadricula2Copia[a][b]="[X]";
                                    contBarcos2--;
                                }else if (Cuadricula2[a][b]!="[1]" && attack==false)//SI HAY UN 0 NO HAS ACERTADO
                                {
                                    //JOptionPane.showMessageDialog(null,"AGUA");
                                    Cuadricula2[a][b]="[/]";
                                    Cuadricula2Copia[a][b]="[/]";
                                }    
                        }
                    }
                    for(int a=0;a<11;a++)//RECORREMOS LA CUADRICULA PARA IMPRIMIRLA DESPUES CON LOS CAMBIOS REALIZADOS (/ o X)
                    {
                        System.out.println(" ");
                        for(int b=0;b<11;b++)
                        {
                            System.out.print(Cuadricula2Copia[a][b]);
                            Cuadricula+=Cuadricula2Copia[a][b];
                        }
                        Cuadricula+="\n";  
                    }//SI EL ATAQUE ES TRUE, ES POR QUE LE HA DADO ASIQUE...
                    if(attack==true)
                    {
                        Cuadricula+="\n"+"BARCO HUNDIDO"; 
                        JOptionPane.showMessageDialog(null,Cuadricula);
                    }
                    else//SI EL ATAQUE ES FALSE (NO A DADO A NADA) 
                    {
                        Cuadricula+="\n"+"AGUA"; 
                        JOptionPane.showMessageDialog(null,Cuadricula);
                    }
                    //LIMPIAMOS LAS VARIABLES (SON REUTILIZABLES)
                    attack=false;
                    barcoFuera=true;
                    //SI HAS ACABADO CON TODOS LOS BARCOS DEL JUGADOR 2 
                    if(contBarcos2==0)
                    {
                        Cuadricula+="\n"+"¡"+J1+"es el ganador!" ;
                        JOptionPane.showMessageDialog(null,Cuadricula);
                    }
                    Cuadricula="";  
                }
                //SI NINGUNO DE LOS DOS HA GANADO AUN ATACA EL JUGADOR2 (SI HA SALIDO EL MENSAJE DE J1 GANADOR AQUI YA NO ENTRARA Y DIRECTAMENTE SALDRA DEL WHILE)
                if(contBarcos1>0 && contBarcos2>0)
                {
                    for(int a=0;a<11;a++)//RECORREMOS LA CUADRICULA PARA IMPRIMIRLA
                    {
                        System.out.println(" ");
                        for(int b=0;b<11;b++)
                        {
                            System.out.print(Cuadricula1Copia[a][b]);
                            Cuadricula+=Cuadricula1Copia[a][b];
                        }
                        Cuadricula+="\n";  
                    }
                    
                    AtaqueJ2=JOptionPane.showInputDialog(Cuadricula +J2+", ¡ATACA!").toUpperCase();
                    Cuadricula="";
                    s1="";
                    s1=s1+AtaqueJ2.charAt(0);
                    s2="";
                    s2=s2+AtaqueJ2.charAt(1);
                    if(AtaqueJ2.length()>2)
                    	s2=s2+AtaqueJ2.charAt(2);
                    t=Integer.valueOf(s2);
                    
                  //revisión de índices para saber si los valores están dentro del rango
                    do {
                        for(int a=0;a<letras.length;a++) {
                            if (s1.equals(letras[a]) && (t>0 && t<letras.length)) {
                                barcoFuera = false;
                            }
                        }
                        if (barcoFuera == true) {
                            AtaqueJ2=JOptionPane.showInputDialog(null, J2 + ", vuelve a introducir los datos dentro del rango").toUpperCase();
                            //AtaqueJ2 = AtaqueJ2.toUpperCase();
                            s1="";
                            s1=s1+AtaqueJ2.charAt(0);
                            s2="";
                            s2=s2+AtaqueJ2.charAt(1);
                            if(AtaqueJ2.length()>2)
                            	s2=s2+AtaqueJ2.charAt(2);
                            t=Integer.valueOf(s2);
                        }
                    }while (barcoFuera == true);
                    
                    for(int a=0;a<11;a++)
                    {
                        for(int b=0;b<11;b++)
                        {
                            if(Cuadricula1[a][0].equals(s1)&& b==t)
                                if(Cuadricula1[a][b]=="[1]")
                                {
                                    attack=true;
                                    //JOptionPane.showMessageDialog(null,"BARCO HUNDIDO");
                                    Cuadricula1[a][b]="[X]";
                                    Cuadricula1Copia[a][b]="[X]";
                                    contBarcos1--;
                                }else if(Cuadricula1[a][b]!="[1]" && attack==false)
                                {
                                    //JOptionPane.showMessageDialog(null,"AGUA");
                                    Cuadricula1[a][b]="[/]";
                                    Cuadricula1Copia[a][b]="[/]";
                                }
                        }
                    }
                    for(int a=0;a<11;a++)
                    {
                        System.out.println(" ");
                        for(int b=0;b<11;b++)
                        {
                            System.out.print(Cuadricula1Copia[a][b]);
                            Cuadricula+=Cuadricula1Copia[a][b];
                        }
                        Cuadricula+="\n";
                    }
                    //JOptionPane.showMessageDialog(null, Cuadricula);
                    if(attack==true)
                    {
                        Cuadricula+="\n"+"BARCO HUNDIDO"; 
                        JOptionPane.showMessageDialog(null,Cuadricula);
                    }
                    else
                    {
                        Cuadricula+="\n"+"AGUA"; 
                        JOptionPane.showMessageDialog(null,Cuadricula);
                    }
                    attack=false;
                    barcoFuera=true;
                    if(contBarcos1==0)
                    {
                        Cuadricula+="\n"+"¡" + J2 + "es el ganador!";
                        JOptionPane.showMessageDialog(null,Cuadricula);
                    }
                    Cuadricula="";
                }
            }
	 }
}

