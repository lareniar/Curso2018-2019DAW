"""Se desea codificar en Java un programa que nos permita
introducir por teclado una palabra, seguidamente el programa
deberá indicarnos si  la palabra introducida es un palíndromo o no.
Por ejemplo:
Palabra introducida:  Azulejo  Resultado:  No es palíndromo.
Palabra introducida:  Reconocer Resultado:  Es palíndromo. """

palabra = str(input("Introduce una palabra"))
suma = ''
suma = (suma + palabra[::-1])
print(suma)
if suma == palabra:
    print("Tu palabra es palíndroma")
else:
    print("Tu palabra no es palíndroma")