suma = 0
numero = int(input("Inserta un número"))

while numero != 0:

    suma = numero + suma
    numero = int(input("Inserta otro número"))

print("Has acertado el número con un total de", suma, "sumas de los números introducidos")