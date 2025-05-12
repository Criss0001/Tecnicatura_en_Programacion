# Ejercicio 6: El mayor de dos números
# Solicita al usuario dos valores, determinar cual es el mayor.
# 1. Solicitar al usuario dos valores numero1 (int), numero2 (int)
# 2. Se debe imprimir el mayor de los dos numeros.}
# (La salida debe ser identica a la siguiente):
# Digite el valor para el número1:
# Digite el vlor para el número2:
# El número mayor es: <nunmeroMayor>
numero1 = int(input("Digite el valor para el número 1: "))
numero2 = int(input("Digite el valor para el número 2: "))

if numero1 > numero2:
    print(f'El número 1 es mayor')
else:
    print(f'El número 2 es mayor')