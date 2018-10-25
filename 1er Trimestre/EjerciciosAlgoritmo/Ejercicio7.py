"""Algoritmo que lea dos números y seguidamente nos muestre siempre la división del mayor entre el menor"""
x = float(input("Inserta el primer número: "))
y = float(input("Inserta el segundo número: "))

if x >= y:
    print(x/y)
else:
    print(y/x)