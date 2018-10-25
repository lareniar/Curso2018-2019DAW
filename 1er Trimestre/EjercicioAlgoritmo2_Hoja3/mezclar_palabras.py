frase1 = input("Inserta una frase:")
frase2 = input("Inserta otra frase: ")

if1 = 0
if2 = 0
espacio = " "
while (if1 < len(frase1) or if2 < len(frase2)):

    while (if1 < len(frase1) and frase1[if1] != ' '):
        print(frase1[if1], end="")
        if1 = if1 + 1
    if1 = if1 + 1

    if if1 < len(frase1) or if1 == len(frase1)-1:
        print(" ", end="")

    while (if1 < len(frase1) and frase1[if1] == espacio):
        if1 = if1 + 1


    while (if2 < len(frase2) and frase2[if2] != ' '):
        print(frase2[if2], end="")
        if2 = if2 + 1
    if2 = if2 + 1

    if if2 < len(frase2):
     print(" ", end="")

    while (if2 < len(frase2) and frase2[if2] == espacio):
        if2 = if2 + 1