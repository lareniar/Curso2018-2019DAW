# m1 =[[1,0,0],[3,4,2]]
# m2 =[[2,1],[0,3],[1,0]]


n1 = int(input("mete la altura de la matriz1"))
m1 = int(input("mete el ancho de la matriz1"))

n2 = int(input("mete la altura de la matriz2"))
m2 = int(input("mete el ancho de la matriz2"))

if (m1 != n2):
    print("las matrices no son multiplicables!")
else:

    # leemos la matriz 1
    matrix1 = []
    for i in range(n1):
        linea = []
        for j in range(m1):
            linea.append(int(input("dame un numero")))
        matrix1.append(linea)

    # leemos la matriz 2
    matrix2 = []
    for i in range(n1):
        linea = []
        for j in range(m1):
            linea.append(int(input("dame un numero")))
        matrix2.append(linea)

    # inicializamos matriz resultado
    resultado = [[0 for x in range(m2)] for y in range(n1)]

    for i in range(n1):
        for j in range(m2):
            res = 0
            for k in range(m1):
                res = res + matrix1[i][k] * matrix2[k][j]
            resultado[i][j] = res

    for x in matrix1:
        print(x)

    print("X")

    for x in matrix2:
        print(x)

    print("-------------------")

    for x in resultado:
        print(x)