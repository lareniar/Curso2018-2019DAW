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

    #Aquí generamos la matriz3, donde tendra tantas filas de la matriz1 como columnas de la matriz2, rellenando así con "0"
    matriz3 = []

    for i in range(matrizFila1):
        matriz3.append([0] * matrizColumna2)


    #Aquí vamos a hacer la multiplicación de las matrices
    #recorremos filas
    for i in range(matrizFila1):
        #recorremos columnas
        for j in range(matrizColumna2):
            #Estas serán tanto columnas de la Matriz1 como filas de la Matriz 2, ya que son valores iguales
            for k in range(matrizColumna1):
                #aquí multiplicamos y sumamos, haciendo la suma de la matriz con la multiplicación para no borrar datos
                matriz3[i][j] += matriz1[i][k] * matriz2[k][j]
                print(matriz3)

    #imprimimos la matriz 3 en filas
    for i in (matriz3):
        print(i)

else:
    print("\n","Las columnas de la Matriz 1 y las filas de la Matriz 2 son diferentes, por lo tanto no puede multiplicarse")

print("Pues ya estaría")