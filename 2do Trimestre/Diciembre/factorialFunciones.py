# En esta funcion generamos un calculo factorial de un número
def factorial(n1):
    fact = 1
    i = 1

    while(i <= n1):

        fact = fact * i
        i = i + 1

    return fact

# En esta funcion calculamos la multiplicación del resultado de diferentes factoriales

def triple_factorial(n1,n2,n3):

    resultado = factorial(n1) * factorial(n2) * factorial(n3)
    return resultado


# fact1 la peticion de la funcion en triple_factorial,donde su resultado es el que se calcula mediante factorial
fact1 = (int(input("Inserta un numero")))
fact2 = (int(input("Inserta un numero")))
fact3 = (int(input("Inserta un numero")))

print(triple_factorial(fact1, fact2, fact3))
