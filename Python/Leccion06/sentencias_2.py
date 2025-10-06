# Ejercicio 2:
# Determinar la solución lógica de la siguiente operación.

# ((3 + 5 x 8 ) < 3 and ((- 6/3 x 4 ) + 2 < 2)) or ( a > b)

print('((3 + 5 x 8 ) < 3 and ((- 6/3 x 4 ) + 2 < 2)) or ( a > b)')
print('Ingrese los siguientes números')
a = int(input('a:'))
b = int(input('b:'))

ejercicio1 = (3+5*8) < 3
ejercicio2 = ((- 6/3 * 4 ) + 2 ) < 2
ejercicio3 = a > b
resultado = ejercicio1 and ejercicio2 or ejercicio3

print('El resultado es:', resultado )