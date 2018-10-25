"""Algoritmo que nos permite
introducir por teclado las calificaciones que ha obtenido un alumno,
posteriormente nos mostrará la calificación media obtenida por dicho alumno.
(La calificación media se obtiene sumando las calificaciones obtenidas dividiendo
 entre el número de notas que has sumado)"""

calificaciones = float(input("inserta la cantidad de notas que vas a meter: "))
total = 0
contador = calificaciones
while contador != 0:
    contador -= 1
    notas = float(input("Introduce una nota: "))
    #la suma de las notas en variable total
    total = notas + total
if calificaciones == 0:
    print("Has sacado un cero")
else:
    media = total / calificaciones
    (print("Tu media es de", media))
