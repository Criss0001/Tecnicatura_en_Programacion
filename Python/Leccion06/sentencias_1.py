# Ejercicio 1:
# Escribir la siguiente expresión en forma de expresión algorítmica.

# a3 x (b2 – 2ac)
# 2b
# Pedimos al usuario 3 valores = a, b, c
# Mostramos el resultado final
print('Ingrese los números')
a = int(input('a:'));
b = int(input('b:'));
c = int(input('c:'));

ejercicio = ((a*3) * ((b*2) - (2*a*c)) / (2*b))

print('El resultado es:', ejercicio)
