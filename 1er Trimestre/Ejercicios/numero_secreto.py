import random
x = float(random.randrange(10))
y = float(input("Inserta un número para manipular a la máquina"))
while x != y:
    print ("Te has confundido")
    y = float(input ("Inserta otro número"))
print("Felicidades, estás controlando a la máquina y así al mundo")