"""Deseamos codificar un programa en Java que nos permita
introducir por teclado un número en binario, posteriormente
el programa verificará que el número introducido
representa correctamente a un número binario,
en caso de que algún dígito del número introducido
no sea 0 o 1, se indicará que el número se ha introducido erróneamente.
Si el número introducido representa un número en binario,
el programa deberá obtener su equivalente en decimal.
Por ejemplo: número introducido 110101, equivalente en decimal 53 """

num = int(input("inserta un número binario: "))
error = False
resto = num
baseDos = 1
decimal = 0
while num > 0:

    resto = int(num%10)

    #Mientras sea binario hace la conversión decimal
    if resto == 0 or resto == 1:
        decimal = decimal + resto*(1*baseDos)
        baseDos= baseDos*2
        num = int(num / 10)
    #Si no es binario sale del ciclo
    else:
        print("has fallado inserta otro número: ")
        num = int(input("inserta otro número binario: "))
#si no es binario, no sale resultado
print(decimal)