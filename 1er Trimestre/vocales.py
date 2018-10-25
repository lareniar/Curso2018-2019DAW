frase = input("dame una frase: ")


# in frase(split) para separar por palabra
for indice in range(len(frase)):

    if frase[indice] == 'a' or frase[indice] == 'e' or frase[indice] == 'y' or frase[indice] == 'o' or frase[indice] == 'u':
        print(frase[indice])
indice = 0
while indice < len(frase):
    if frase[indice] == 'a' or frase[indice] == 'e' or frase[indice] == 'y' or frase[indice] == 'o' or frase[indice] == 'u':
        print(frase[indice])
        indice += 1
    indice += 1