def parametros (a, b=3,*c):
  resultado = (a,b,c)
  return resultado


a = 2

print(parametros(a))

a = (14)
b = 3
c = 7
d = 1

def suma(*a):
  "resultado = a[2]"
  resultado = 0
  for i in range(len(a)):
    resultado = resultado + a[i]
  return resultado

print(suma(a, b, c, d))


