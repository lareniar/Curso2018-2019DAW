dni = input("Inserta los números del dni")
dniLetras=["T","R","W","A","G","M","Y","F","P","Z","X","B","N","J","Z","S","Q","V","H","L","C","K","E"]

while len(dni) != 8:
    if len(dni) != 8:
            print("Por favor inserta el DNI correbtamenete")
            dni = input("Inserta los números del dni")

calculoLetra = int(dni)%23
letra = dniLetras[calculoLetra]
print("vamos a ver colega trae el dni que te calculo la letra:" , letra)