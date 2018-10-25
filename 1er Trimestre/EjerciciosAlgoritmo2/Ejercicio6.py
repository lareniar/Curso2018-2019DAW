"""Algoritmo que nos permita introducir
por teclado una serie de números enteros que
finalizara con el número 0, el programa deberá mostrar
por pantalla el número mayor de los introducidos"""

#a y b si a es mayor que B reemplaza B sino no lo reemplaza

numero = float(input("Inserta un número: "))
numeroAlto = numero
while numero != 0:
    if numero <= numeroAlto:
        numero = float(input("Inserta un número: "))
    else:
        numeroAlto = numero
        numero = float(input("Inserta un número: "))
print(numeroAlto)