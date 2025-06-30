suma_par = 0
cant_par = 0
suma_impar = 0
cant_impar = 0

n = int(input("Ingresar la cantidad de numeros -> "))

for i in range(n):
    num = int(input("Ingrese un numero ->"))

    if num % 2 == 0:
        suma_par = suma_par + num
        cant_par += 1
    else:
        suma_impar = suma_impar + num
        cant_impar += 1

promedio_impar = 0 
if cant_impar > 0:
    promedio_impar = suma_impar/cant_impar

print(f"Suma de pares: {suma_par}")
print(f"Cantidad pares: {cant_par}")
print(f"Promedio impares: {promedio_impar:.2f}")