# Calcular la suma de los "N" primeros numeros
# S = 1+2+3+... +N

N = int(input("Digite la cantidad de números a sumarse: "))

suma = 0

# Sumar del 1 hasta N
for i in range(1, N + 1):
    suma += i  # suma = suma + i

# Mostrar el resultado
print("La suma es:", suma)

