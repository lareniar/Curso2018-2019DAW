 ###############################
#                               #
#                               #
#           FUNCIONES           #
#                               #
#                               #
 ###############################


def alturaMatriz(matriz):
    altura = len(matriz)
    return(altura)

def generarMatrizVacia(fila, altura, elemento):
    matriz = []
    for i in range(fila):
        matriz.append([elemento] * altura)
    return(matriz)

def alturaMatriz():
    d

def datosUsuarioMatriz():
    for i in range(matrizFila1):
        linea = []
        for j in range(matrizColumna1):
            cont = str(i)
            num = input("Fila " + cont + ":")
            linea.append(int(num))
        matriz1.append(linea)
    #imprimir la matriz completa
    for i in matriz1:
        print(i)

def multiplicacionMatrices(filasMatriz1, columnasMatriz2, columnasMatriz1):
    for i in range(filasMatriz1):
        #recorremos columnas
        for j in range(columnasMatriz2):
            #Estas serán tanto columnas de la Matriz1 como filas de la Matriz 2, ya que son valores iguales
            for k in range(columnasMatriz1):
                #aquí multiplicamos y sumamos, haciendo la suma de la matriz con la multiplicación para no borrar datos
                matriz3[i][j] += matriz1[i][k] * matriz2[k][j]
    return(matriz3)

def impresionMatriz(matriz):
    for i in matriz:
        print(i)

 ###############################
#                               #
#                               #
#           EJERCICIO           #
#                               #
#                               #
 ###############################


matriz1 = []
matriz2 = []

matrizFila1 = int(input("Introduce el número de filas: "))
matrizColumna1 = int(input("Introdue el número de columnas: "))
matrizFila2 = int(input("Introduce el número de filas: "))
matrizColumna2 = int(input("Introdue el número de columnas: "))

if matrizColumna1 == matrizFila2:
    #meter datos de la Matriz 1
    print("Vamos a meter datos de la Matriz 1, por filas (de arriba a abajo).")


    #Meter datos de la Matriz 2
    print("Vamos a meter datos de la Matriz 2, por filas (de arriba a abajo).")
    for i in range(matrizFila2):
        linea = []
        for j in range(matrizColumna2):
            cont = str(i)
            num = input("Fila " + cont + ":")
            linea.append(int(num))
        matriz2.append(linea)    #sacamos en pantalla la Matriz 2
    for i in matriz2:
        print(i)

    matriz3 = generarMatrizVacia(matrizFila1, matrizColumna2, 5)

    matriz3 = multiplicacionMatrices(matrizFila1,matrizColumna2,matrizColumna1)

    imprimir = impresionMatriz(matriz3)

    print("\n", "Ya estaría")
else:
    print("\n","Las columnas de la Matriz 1 y las filas de la Matriz 2 son diferentes, por lo tanto no puede multiplicarse.")


