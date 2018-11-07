# Se desea codificar en Java un programa
# que nos permita introducir por
# teclado una cadena de caracteres, seguidamente una letra,
# el programa deberá indicarnos el número de palabras de la cadena que
# finalizan con dicha letra. Por ejemplo:
# Cadena introducida: La casa de Carlota tiene chimenea.
# Letra ……………..: a
# Resultado………...: 4 palabras finalizan con la letra «a
#split and endswith

frase = input("Escribe una frase: ")
frase = frase.lower()
letraUsuario = input("Escribe una letra: ")
letraUsuario = letraUsuario.lower()
contador = 0
espacio = ' '
for letra in range(len(frase)):
    #mientras frase sea total-1 cuenta palabra si hay espacios, comas o exclamacion
    if letra < (len(frase)-1):
        if frase[letra] == letraUsuario and frase[letra + 1] == espacio:
                contador += 1
        if frase[letra + 1] == ',' and frase[letra] == letraUsuario:
            contador += 1
        if frase[letra + 1] == '!' and frase[letra] == letraUsuario:
            contador += 1
    #si frase acaba con punto cuenta palabra
    if frase[letra] == '.' and frase[letra - 1] == letraUsuario:
            contador += 1
    #si frase acaba sin punto cuenta palabra
    if letra == len(frase) - 1:
        if letraUsuario == frase[letra]:
         contador +=1
print(contador, "palabras acaban en la letra", letraUsuario)
