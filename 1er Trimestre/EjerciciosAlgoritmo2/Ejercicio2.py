"""Algoritmo que nos permita introducir un número por
teclado en el rango (1 – 10) y
posteriormente nos calcule el
factorial de ese número, el resultado se
mostrará por pantalla. El
factorial de un número se obtiene: 5! = 5 * 4 * 3 * 2 * 1
"""
conta = 1
num = int(input("Inserta un número del 1 al 10: "))
suma = 0
while num < 0 or num > 10:
    num = int(input("Vuelve a insertar un número entre 1 y 10"))
while num != 0:
    conta = conta * num
    num = num - 1
print(conta)




