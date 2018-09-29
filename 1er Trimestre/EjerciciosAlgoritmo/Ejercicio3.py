"""Algoritmo que lea tres números y
 seguidamente nos diga cuál de ellos es el mayor """
x = int(input("Inserta el primer número: "))
y = int(input("Inserta el segundo número: "))
z = int(input("Inserta el tercer número: "))

if x < y and x < z and y > z:
    print("El número mayor es: ", y)
elif x < y and x < z and z > y:
    print("El número mayor es: ", z)
elif y < x and y < z and x > z:
    print("El número mayor es: ", x)
elif z < y and z < x and x > y:
    print("El número mayor es: ", x)
elif y < x and y < z and z > x:
    print("El número mayor es: ", z)
elif z < y and z < x and y > x:
    print("El número mayor es: ", y)

