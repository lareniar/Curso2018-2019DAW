def arbol_navidad(x):
    estrellas = 1
    espacio_tronco = x - 1
    while x > 0:
        espacio(x)
        estrella(estrellas)
        espacio(x)
        print("")
        estrellas = estrellas + 2
        x = x - 1

    tronco(espacio_tronco)


def espacio(x):
    for i in range(x-1):
        print(' ', end = "")

def estrella(x):
    for i in range(x):
        print('*', end = "")

def tronco(x):
    espacio(x)
    print("|||")
    return
#altura = int(input("Dime cual es la altura del arbol"))
#for x in range(altura):
    #arbol_nav
def factorial_recursivo(n):

    if (n == 0):
        return(1)
    else:

        return n * factorial_recursivo(n - 1)

n = int(input("dime un numero"))

print(factorial_recursivo(n))


def factorial_recursivo_invertido():
    n = int(input("dame un numero"))
    if (n == 0):
        return(0)
    else:
        print(n)
        return (n + factorial_recursivo_invertido())

resultado = factorial_recursivo_invertido()
print(resultado )
