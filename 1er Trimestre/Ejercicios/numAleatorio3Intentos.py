import random
#Primero declaramos el número aleatorio, el número a meter por el usuario y un contador de intentos.
#El contador de intentos empieza al 3, ya que al entrar a loop se le resta 1 y se muestran 2 intentos más
x = int(random.randrange(10))
y = int(input("\nInserta un número para manipular a la máquina: "))
intentos = 3
#En el loop empezamos a restar los intentos y mostramos la cantidad restante
while x != y:
    intentos -= 1
    print("\nTe quedan", intentos, "intento(s).")
#en el caso de que intentos llegue a cero, rompemos el loop con el break
    if intentos == 0:
        print("\n¡Felicidades, no has conseguido controlar a la máquina y os habéis quedado moñecos!")
        break
#Como todavía no llegará a cero, hacemos que el usuario inserte otro número
    else:
        y = int(input("\nInserta un número para manipular a la máquina de nuevo: "))
#En el caso de que el loop se rompa, se acabará el juego
#Si el usuario acierta el número aleatorio, se acabará el juego también con este if
if x == y:
    print("¡\nFelicidades, estás controlando a la máquina y así al mundo!")