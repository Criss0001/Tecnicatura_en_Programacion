# Ejercicio 3: Valor dentro de un rango
valor = int(input("Digite un número dentro del rango de 0 a 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f'El valor {valor} está dentro del rango')
else:
    print(f'El valor {valor} NO esta dentro del rango')
