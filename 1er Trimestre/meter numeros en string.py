#meter numeros en un array y luego visualizar el más alto
lista = []
cero = False
suma = 0
numMayor = 0

while cero != True:

    num = int(input("Mete un número"))
    cero = False
    lista.append(num)
    if num == 0:
        cero = True

"""esto hace que sumes el contenido y no el contenido de la posición
for i in range(len(lista)):
    suma = suma + i
    if lista[i] >= numMayor:
        numMayor = lista[i]"""

#esto hace que sumes el contenido de la posición y no el contenido

for i in range(len(lista)):
    suma = suma + lista[i]
    if lista[i] >= numMayor:
        numMayor = lista[i]

print(suma)
print(numMayor)