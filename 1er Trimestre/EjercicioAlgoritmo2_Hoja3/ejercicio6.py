"""Deseamos codificar un programa en Java,
que nos permita introducir por teclado un número entero y positivo,
seguidamente lo descompondrá en dos números,
uno formado con los dígitos pares del número y otro con los dígitos impares.
El resultado se mostrará por pantalla.
Por ejemplo: 1526984, número con dígitos par 2684, número con dígitos impar 159.
Observación, la secuencia de dígitos tendrá el mismo orden que en el número introducido."""

num = int(input("Inserta un número: "))
par = 0
impar = 0
multiplicadorImpar = 1
multiplicadorPar = 1
while num > 0:
    resto = int(num%10)
    if (resto%2) == 1:
        impar = impar + resto*multiplicadorImpar
        multiplicadorImpar = multiplicadorImpar*10
    if (resto%2) == 0:
        par = int(par + resto*multiplicadorPar)
        multiplicadorPar = multiplicadorPar*10
    num = num/10
    resto = num

print(par)
print(impar)