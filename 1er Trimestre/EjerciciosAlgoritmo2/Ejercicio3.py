"""Algoritmo que nos permita introducir dos números por teclado (base y potencia)
y posteriormente nos calcule el valor de elevar la base a la potencia introducida
(basePotencia), el resultado se mostrará por pantalla.
La potencia la obtendremos mediante multiplicaciones sucesivas,
es decir: 7(5) = 7 * 7 * 7 * 7 * 7"""

base = int(input("Inserta un número base: "))
potencia = int(input("Inserta su potencia: "))
resultado = 1

while potencia != 0:
    potencia -= 1
    resultado = resultado * base
print(resultado)