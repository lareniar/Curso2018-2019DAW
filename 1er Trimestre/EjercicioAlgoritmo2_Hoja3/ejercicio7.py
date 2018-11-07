"""Deseamos codificar un programa en Java,
que nos permita introducir por teclado un número entero y positivo,
un dígito (0 – 9), posteriormente el programa nos devolverá el número introducido
sin las apariciones del dígito. Por ejemplo: número introducido 152682685,
dígito introducido 2, número resultante que se mostrará por pantalla 1568685 """

num = int(input("Inserta un número: "))
aparece = int(input("Dime el numero que queieres buscar"))
resto = num
multiplicador = 1
total = 0
while num > 0:
    resto = int(num%10)
    if resto == aparece:
        num = num/10
        resto = num
    else:
        total = total + (resto*multiplicador)
        num = num/10
        resto = num
        multiplicador = multiplicador*10

print(total)