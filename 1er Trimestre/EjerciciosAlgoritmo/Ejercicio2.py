"""Algoritmo que lea dos números y
seguidamente nos diga cuál de ellos
 es el mayor o bien si ambos números son iguales """
x = int(input("Inserta un número sin decimal: "))
y = int(input("Inserta otro número sin decimal: "))
if x > y:
    print("El número", x, "es mayor.")
elif y > x:
    print("El número", y, "es mayor.")
if x == y:
    print("Tus números,", x, "y", y, "son iguales.")
