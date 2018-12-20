frase1 = input("Inserta una palabra: ")
frase2 = input("Inserta otra palabra: ")


palabra1 = frase1.split()
palabra2 = frase2.split()



if len(palabra1) > len(palabra2) :
    for i in range(len(palabra1)):
     print(palabra1[i], end=" ")
     if i < len(palabra2):
         print(palabra2[i], end=" ")
else:
    for i in range(len(palabra2)):
     print(palabra2[i], end=" ")
     if i < len(palabra1):
        print(palabra1[i], end=" ")

