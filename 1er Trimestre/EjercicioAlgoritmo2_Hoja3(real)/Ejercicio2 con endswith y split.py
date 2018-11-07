# Se desea codificar en Java un programa
# que nos permita introducir por
# teclado una cadena de caracteres, seguidamente una palabra,
# el programa deberá indicarnos el número de palabras de la cadena que
# finalizan con dicha palabra. Por ejemplo:
# Cadena introducida: La casa de Carlota tiene chimenea.
# palabra ……………..: a
# Resultado………...: 4 palabras finalizan con la palabra «a
#split and endswith

frase = input("Escribe una fraseSeparada: ")
frase = frase.lower()
letraUsuario = input("Escribe la letra que quieres encontrar: ")
letraUsuario = letraUsuario.lower()
fraseSeparada = frase.split(' ')
contador = 0
espacio = ' '
for palabra in range(len(fraseSeparada)):
    if palabra < (len(fraseSeparada)-1):
        if fraseSeparada[palabra] == letraUsuario and fraseSeparada[palabra + 1] == espacio:
                contador += 1
        if fraseSeparada[palabra + 1] == ',' and fraseSeparada[palabra] == letraUsuario:
            contador += 1
        if fraseSeparada[palabra + 1] == '!' and fraseSeparada[palabra] == letraUsuario:
            contador += 1
    #si fraseSeparada acaba con punto cuenta palabra
    if fraseSeparada[palabra] == '.' and fraseSeparada[palabra - 1] == letraUsuario:
            contador += 1
    #si fraseSeparada acaba sin punto cuenta palabra
    if palabra == len(fraseSeparada) - 1:
        if letraUsuario == fraseSeparada[palabra]:
         contador +=1

