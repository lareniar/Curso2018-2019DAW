"""Algoritmo que lea tres números y seguidamente
nos muestre ordenados de mayor a menor los tres números leído"""

x = int(input("Inserta el primer número: "))
y = int(input("Inserta el segundo número: "))
z = int(input("Inserta el tercer número: "))
if x < y and x < z and y > z:
    print("El número mayor es: ", y, z, x)
elif x < y and x < z and z > y:
    print("El número mayor es: ", z, y, x)
elif y < x and y < z and x > z:
    print("El número mayor es: ", x, z, y)
elif z < y and z < x and x > y:
    print("El número mayor es: ", x, y ,z)
elif y < x and y < z and z > x:
    print("El número mayor es: ", z, x, y)
elif z < y and z < x and y > x:
    print("El número mayor es: ", y, x, z)