# Calcular el factorial de un número mayor o i gual a 0
def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n-1)
    
num = int(input("Ingrese un numero que sea mayor o igual a 0: "))

if num < 0:
    print("No se puede definir para numeros negativos =(")
else:
    print(f"El factorial de {num} es {factorial(num)}")