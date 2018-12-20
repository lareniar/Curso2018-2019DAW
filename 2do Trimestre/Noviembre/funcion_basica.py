def saludo(nombre):
    print("Hola", nombre)

def suma(num, num2):
    resultado = num + num2
    return(resultado)
print(suma(4,5))
#no podemos imprimir el resultado como tal ya que es una variable local dentro de la función
print(resultado)
saludo("jon")
nombre = input("Dame un nombre: ")
saludo(nombre)

