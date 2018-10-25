"""Algoritmo que lea las medidas
de los lados de un triángulo y seguidamente nos indique de
qué tipo de triangulo se trata (Equilátero, Isósceles o Escaleno) """

x = int(input("Inserta el primer número: "))
y = int(input("Inserta el segundo número: "))
z = int(input("Inserta el tercer número: "))

if (x+y) > z or (x+z) > y or (y+z) > x:
    if x == y and x == y and y == z:
        print("Tu triángulo es equilátero")
    elif x == y or x == z or y == z:
        print("Tu triángulo es isósceles")
    else:
        print("Tu triángulo es escaleno")