# Ejercicio 3: 
# Intercambiar el valor de dos variables.
# Por ejemplo: 
# a = 10    ->    a = 5
# b = 5     ->     b = 10

# Hacemos que el usuario ingrese los valores de a y b
a = int(input('Digite el valor de a: '))
b = int(input('Digite el valor de b: '))

#Imprimimos los valores de a y b antes de intercambiarlos
print(f'Antes de intercambiar los valores:')
print(f'El valor de a es: {a}')
print(f'El valor de b es: {b}')

# Imprimimos los valores de a  y b intercambiados
print(f'Despues de intercambiar los valores: ')
a, b = b, a
print(f'El valor de a es: {a}')
print(f'El valor de b es: {b}')