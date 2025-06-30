# Calcular estación del año

mes = None
mes = int(input("Ingresa el mes del año del 1 al 12 \n"))

if(mes >= 1 and mes <= 3):
    print("Ese mes corresponde a Verano")
elif(mes >= 4 and mes <= 6):
    print("Ese mes corresponde a Otoño")
elif(mes >= 7 and mes <= 9):
    print("Ese mes corresponde a Invierno")
else:
    print("Ese mes corresponde a Primavera")