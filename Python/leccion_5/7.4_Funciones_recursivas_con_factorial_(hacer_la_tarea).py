# Funciones Recursivas
def factorial(numero):
    if numero == 1: # Caso Base
        return 1
    else:
        return numero * factorial(numero-1) # Caso Recursivo

# El usuario ingresa un numero y se guarda en la variable 'numero'
numero = int(input('Ingrese un número para calcular su factorial: '))

resultado = factorial(numero) # Lo hacemos en código duro
print(f'El factorial del número {numero} es: {resultado}') # Tarea que el usuario ingrese el número para calcular el factorial