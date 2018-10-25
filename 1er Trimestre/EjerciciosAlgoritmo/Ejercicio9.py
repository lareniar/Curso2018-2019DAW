"""Una empresa paga a sus empleados el
trabajo realizado por horas de la siguiente
forma:
- Las primeras 35 horas a una
tarifa fija
- Resto horas semanales (horas extras)
se pagan con incremento del 25% de la tarifa
fija
- Impuestos a deducir al trabajador el 17 % del
importe de su salario.
Slgoritmo que lea el número de horas
trabajadas por un empleado en la semana, así como el importe pagado
por hora y seguidamente nos muestre el salario neto que recibirá dicho empleado """

precioHora = 8
tarifaFija = 35
horasExtra = (100/25)
impuestos = (100/17)

horasTrabajadas = float(input("inserta tus horas trabajadas: "))

if horasTrabajadas <= 35:
    print("Tu sueldo restando los impuestos a deducir es de",(precioHora * horasTrabajadas) - ((precioHora*horasTrabajadas)/impuestos))
else:
    horasExtraRestante = horasTrabajadas - 35
    pagoSinImpuestos = ((precioHora * 35) + (((precioHora/horasExtra) + precioHora)*horasExtraRestante))
    print("Tu sueldo es de", pagoSinImpuestos - (pagoSinImpuestos/impuestos))