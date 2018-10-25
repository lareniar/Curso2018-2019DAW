"""Se dice que un número entero es perfecto,
cuando es igual a la suma de sus divisores propios positivos,
Ej. 6 = 1 + 2 + 3, por lo tanto 6 es un número perfecto.
Algoritmo que nos permita introducir un número por teclado y posteriormente
 nos diga si es perfecto o no (6 / 28 / 496 / 8128) """

numero = int(input("Inserta un número: "))
contador = 0
for i in range (1, numero):
    if numero % i == 0:
        contador = contador + i
if contador == numero:
    print(numero, " es un número perfecto.")
else:
    print(numero, " no es un número perfecto.")