x = int(input("Inserta un número"))
while 0 < x:
    cont = x
    while 0 < cont:
        print("x", end="")
        cont = cont - 1
    x = x - 1
    print("")