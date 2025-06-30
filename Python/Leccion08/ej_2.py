# Ejercicio 2: Imprime los números del 1 al 10, pero salta el número 5
for i in range(1, 11):
    if i == 5:
        continue
    print(i)