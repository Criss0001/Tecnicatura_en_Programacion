# Diseñar un programa que ingresando un año. nos devuelva por consola si es un año bisiesto o no, repetir la acción hasta quue el usuario lo decida.

def es_bisiesto(anio):
    return (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0)

while True:
    anio = int(input("Ingrese un año: "))

    if es_bisiesto(anio):
        print(f"El año {anio} es bisiesto.")
    else:
        print(f"El año {anio} no es bisiesto.")

    continuar = input("¿Desea ingresar otro año? (s/n): ").lower()
    if continuar != 's':
        print("Programa finalizado.")
        break



    