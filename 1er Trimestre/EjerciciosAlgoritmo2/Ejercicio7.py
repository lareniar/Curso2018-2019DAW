"""Algoritmo que nos permita introducir por teclado dos números,
y posteriormente proceda a obtener el cociente y resto de la división
entera mediante restas y sumas. El resultado se mostrará por pantalla.
 6/2 = 3 (Cociente)"""

x = int(input("Inserta un número: "))
y = (int(input("Inserta otro número: ")))
resultado = False
total = 0
cociente = 0
while not resultado:
     while total < x:
        cociente = cociente + 1
        total = y + total
        #cociente es uno de mas, se consiguen el resto correcto y el cociente
        if total >= x:
            resto = x - (total - y)
            if resto != 0:
                cociente = cociente - 1
            resultado = True
print("El resto es de ", resto, "y el cociente de ", cociente)