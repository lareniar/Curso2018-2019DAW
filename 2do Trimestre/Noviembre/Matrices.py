matriz = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

i = 0
a = 0
b = 0

for i in matriz:
    print(i)

    #para acceder a una posición

print("para acceder a una posición")
print(matriz[1][2])


i = 0

print("Para recorrer elementos de una lista y pares")
for i in matriz:
    for j in i:
        if (j%2 == 0):
            print(j)

print("Para recorrer la lista mediante indices")
for i in range(len(matriz)):
    for j in range(len(matriz[i])):
        if matriz[i][j] % 2 == 0:
            print(matriz[i][j])

#crear una lista de forma dinámica
print("crear una lista de forma dinámica")
matriz = []

filas = 3
columnas = 4

for i in range(filas):

    linea = []

    for j in range(columnas):

     linea.append(j)

    matriz.append(linea)

print(matriz)

# crear una lista de forma dinámica con datos del usuario
print("crear una lista de forma dinámica con datos del usuario")
matriz = []

filas = int(input("Introduce el número de filas"))
columnas = int(input("Introdue el número de columnas"))

for i in range(filas):

    linea = []

    for j in range(columnas):
        num = input("introduce un número")
        linea.append(num)

    matriz.append(linea)

print(matriz)