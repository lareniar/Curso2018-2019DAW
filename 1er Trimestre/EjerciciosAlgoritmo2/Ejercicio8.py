"""Algoritmo que nos permita introducir por teclado un
número para seguidamente obtener su cuadrado haciendo solo sumas.
Para ello ten en cuenta que el cuadrado de un número «n» es la suma de los «n»
primeros números impares, Por ejemplo: 5(2) = 1 + 3 + 5 + 7 + 9 = 25 """


x = int(input("Inserta un número: "))
x = x * x
sumaN = -1
resultado = False
while not resultado:
    sumaN = sumaN + 2
    if sumaN > x:
     if (x % 2) == 0:
        sumaN = sumaN - 1
        resultado = True
     else:
        sumaN = sumaN - 2
        resultado = True

print("El resultado del cuadrado es: ",sumaN)