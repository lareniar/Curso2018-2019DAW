"""Entrada
La entrada consta de una serie de casos de prueba consistentes en dos valores entre 1 y 99,
el primero correspondiente al canal en el que me encuentro y el segundo al canal al que quiero llegar.
 La entrada termina cuando los dos números son 0.

Salida
Para cada caso de prueba se escribirá una línea en la que aparecerá el número de veces que tengo que saltar de
 canal para conseguir mi objetivo de forma óptima

 Entrada de ejemplo
2 5
2 99
5 63
63 5
0 0
Salida de ejemplo
3
2
41
41"""

"""import time
start = time.time()"""

canal = []
canal2 = []
cont = False
i = 0
while cont != True:
    canal.append(int(input("Introduce el canal en el que estás")))
    canal2.append(int(input("Introduce el canal al que quieres ir")))
    if canal[i] == 0 and canal2[i] == 0:
            cont = True
            i = 0
    i = i + 1
i = 0
while i != len(canal):
    if canal[i] < canal2[i]:
        if canal2[i] < 50:
            print(canal2[i] - canal[i])
        else:
            print(99 - canal2[i] + canal[i])
    if canal2[i] < canal[i]:
        if canal[i] < 50:
            print(canal[i] - canal2[i])
        else:
            print(99 - canal[i] + canal2[i])
    i = i +1

"""print(time.process_time())"""
