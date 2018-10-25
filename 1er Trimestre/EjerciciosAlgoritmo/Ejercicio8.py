"""Algoritmo que lea un número y seguidamente nos diga si ese número es par o impar. """
x = int(input("Inserta el primer número: "))

resto = x % 2
if resto == 0:
    print("Tu número es par")
else:
    print("Es impar")