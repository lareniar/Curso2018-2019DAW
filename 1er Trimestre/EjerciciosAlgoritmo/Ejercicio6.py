"""Una tienda ofrece un descuento del 15
sobre el total de la compra durante el mes
de octubre. Algoritmo que dado un mes y un importe
nos indique cuál es el importe que deberá abonar el cliente,
por ejemplo, mes introducido = 7, importe 175, deberá indicar que
el importe a pagar es de 175 €, mes introducido = 10, importe 100,
deberá indicar que el importe a pagar es de 85 €. """

descuento = (100/15)
octubre = 10
mes = int(input("indica el número del mes que hiciste la compra (del 1 al 12): "))
importe = float(input("indica el importe de tu compra: "))
if mes != octubre:
    print("Tu valor es", importe, "€")
else:
    print("Tu importe es", importe - (importe/descuento), "€")