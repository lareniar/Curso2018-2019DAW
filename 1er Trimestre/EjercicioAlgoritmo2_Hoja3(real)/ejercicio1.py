#Se desea codificar en Java un programa que nos permita introducir
#  por teclado una cadena de caracteres, seguidamente una letra,
#  el programa deberá indicarnos el número de palabras de la cadena
#  que comienzan con dicha letra. Por ejemplo:
# Cadena introducida:   La casa de Carlota tiene chimenea.
# Letra ……………..: c
# Resultado………...: 3 palabras comienzan con la letra «c»

frase = input("Dime una frase: ")
frase = frase.lower()
letraUsuario = input("Escribe la letra que quieres encontrar: ")
letraUsuario = letraUsuario.lower()
contador = 0
espacio = ' '
for letra in range(len(frase)):
    if letra == 0: #si la posicion 0 comienza con letraUsuario
        if frase[letra] == letraUsuario:
            contador += 1
    if frase[letra] == letraUsuario and frase[letra-1] == espacio:
        contador += 1
print(contador, "palabras empiezan por la letra", letraUsuario)
