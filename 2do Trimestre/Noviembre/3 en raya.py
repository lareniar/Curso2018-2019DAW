####################################################################
#                                                                  #
#                   Texto del Ejercicio                            #
#                                                                  #
####################################################################
#funciones
def coord(coordenadas):
    coordenada1 = coordenadas[0]
    coordenada2 = coordenadas[1]
    # verificamos que el string esté dentro de las coordenadas, sino se repite la inserción de coordenadas
    if ((coordenada1 == '0' or coordenada1 == '1' or coordenada1 == '2') and (
            coordenada2 == '0' or coordenada2 == '1' or coordenada2 == '2')):
        correcto = True
    else:
        print("Coordenadas fuera de lugar, inserta las coordenadas de 0 a 2.")
    coordenada1 = int(coordenada1)
    coordenada2 = int(coordenada2)

    # Comprobación de coordenadas para la X e insertar X
    if tablero[coordenada1][coordenada2] == '':
        tablero[coordenada1][coordenada2] = 'X'
        for i in tablero:
            print(i)
        # print(tablero)
        letra = True
    else:
        print("El espacio está ocupado, prueba en otro")
        letra = False
        correcto = False

    return correcto

def comprobacion(tablero):
    if tablero[0][0] == 'X' and tablero[0][1] == 'X' and tablero[0][2] == 'X':
        print("X ha ganado")
        fin = True
    if tablero[1][0] == 'X' and tablero[1][1] == 'X' and tablero[1][2] == 'X':
        print("X ha ganado")
        fin = True
    if tablero[2][0] == 'X' and tablero[2][1] == 'X' and tablero[2][2] == 'X':
        print("X ha ganado")
        fin = True
    #diagonal comprobacion
    if tablero[0][0] == 'X' and tablero[1][1] == 'X' and tablero[2][2] == 'X':
        print("X ha ganado")
        fin = True
    if tablero[2][0] == 'X' and tablero[1][1] == 'X' and tablero[0][2] == 'X':
        print("X ha ganado")
        fin = True

    if tablero[0][0] == 'O' and tablero[0][1] == 'O' and tablero[0][2] == 'O':
        print("O ha ganado")
        fin = True
    if tablero[1][0] == 'O' and tablero[1][1] == 'O' and tablero[1][2] == 'O':
        print("O ha ganado")
        fin = True
    if tablero[2][0] == 'O' and tablero[2][1] == 'O' and tablero[2][2] == 'O':
        print("O ha ganado")
        fin = True
    #diagonal comprobacion
    if tablero[0][0] == 'O' and tablero[1][1] == 'O' and tablero[2][2] == 'O':
        print("O ha ganado")
        fin = True
    if tablero[2][0] == 'O' and tablero[1][1] == 'O' and tablero[0][2] == 'O':
        print("O ha ganado")
        fin = True
    return(fin)

###################################################################################
###################################################################################
###################################################################################
###################################################################################
###################################################################################

#Primero creamos el tablero de juego
tablero = [['', '', ''], ['', '', ''], ['', '', '']]

filas = 3
columnas = 3
contador = 0
correcto = False
letra = False

#bucle para finalizar el juego
fin = False
while(fin != True):
    #Sale de este bucle cuando se puede colocar la letra, sino se vuelve a pedir posición
    while(letra != True):
        # Estas son las coordenadas para el jugador X
        while(correcto != True):
            coordenadas = str(input("Mete las coordenadas para X. (Ejemplo: 01): "))
            coord(coordenadas)

    #reinicio de las booleanas para que el jugador O coloque
    letra = False
    correcto = False

    fin = comprobacion(tablero)
    if fin == True:
        break;





    while(letra != True):
        # Estas son las coordenadas para el jugador O
        while(correcto != True):
            coordenadas = str(input("Mete las coordenadas para O. (Ejemplo: 31): "))
            print(coord(coordenadas))

    #filas comprobacion
    fin = comprobacion(tablero)

    correcto = False
    letra = False
    contador += 1

    if contador == 9:
        print("Ha acabado en empate")
        fin = True
