"""Algoritmo que lea tres números y seguidamente,
si el primero es negativo, nos mostrará el producto de los tres números leídos,
si no lo es, imprimirá la suma de los tres números """

x = int(input("Inserta el primer número: "))
y = int(input("Inserta el segundo número: "))
z = int(input("Inserta el tercer número: "))

if x < 0:
    print(x*z*y)
else:
    print(x+y+z)
