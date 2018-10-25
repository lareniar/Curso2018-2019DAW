"""Algoritmo que nos permita introducir por teclado
un número y posteriormente nos diga si el número
introducido es primo o no. Un número es primo cuando
solamente es divisible por dicho número y la unidad,
por ejemplo: 5 es primo solo es divisible entre 5 y entre 1, 6 no es primo,
 ya que es divisible entre 1, 2, 3 y 6 """

primo = int(input("Inserta un número: "))
contador = 0
for resultado in range(1, primo+1):
    resultado = primo%resultado
    print(resultado)
    if resultado == 0:
        contador = contador + 1
if contador > 2 or contador == 1 or contador == 0:
    print("Primo, tu número no es primo")
else:
    print("Primo, tu número es primo")