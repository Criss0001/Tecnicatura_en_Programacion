# Dadas las horas trabajadas de 5 personas y la tarifa de pago
# calcular el salario y la sumatoria de todos los salarios
salarios = []
total_salarios = 0

for i in range (5):
    print(f"\nPersona {i+1}:")
    horas = float(input("Ingrese la cantidad de horas trabajadas: "))
    tarifa = float(input("Ingrese la tarifa por hora: "))

    salario = horas*tarifa
    salarios.append(salario)
    total_salarios += salario

print("\nSalarios individuales:")
indice = 1
for salario in salarios:
    print(f"Persona {indice}: ${salario:.2f}")
    indice += 1

print(f"\nLa suma de todos los salarios es: ${total_salarios:.2f}")