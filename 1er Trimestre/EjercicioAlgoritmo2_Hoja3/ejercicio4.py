"""Deseamos codificar un programa
en Java que nos permita introducir
por teclado un número entero y positivo,
posteriormente el programa nos mostrará el número
introducido en binario. El resultado se mostrará en la
pantalla de nuestro ordenador.
Por ejemplo: número introducido 53, número en binario 110101. """

num = int(input("inserta un número"))
binario = int(0)
multiplicador = int(1)
resto = num

while (num != 0):
    resto = resto%2
    print (resto)
    binario = binario + resto*multiplicador
    num = int(num/2)
    resto = num
    multiplicador = multiplicador*10

print (binario)