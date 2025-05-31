#Ciclo while (Mientras o Durante)
# contador = 0
# while contador < 3:
#     print('Ejecutando el ciclo while', contador)
#     contador += 1
# else:
#     print('Fin del ciclo while')

# Imprimir números del 0 al 5 con el ciclo while
# maximo = 5
# contador = 0
# while contador <= maximo:
#     print('Número:', contador)
#     contador += 1

# # Imprimir números del 5 al 0 con el ciclo while
# minimo = 1
# contador = 5
# while contador >= minimo:
#     print('Número:', contador)
#     contador -= 1
# #Ciclo for
# cadena = 'Hello'
# for letra in cadena:
#     print(letra)
# else:
#     print('Fin del ciclo for')

# # Palabra reservada break
# for letra in 'Alemania':
#     if letra == 'a':
#         print(f'Letra encontrada: {letra}')
#         break #rompe el ciclo
# else: 
#     print('fin del ciclo for')

# Palabra reservsada continue
for i in range(6):
    if i % 2 == 0:
        print(f'Valor: {i}')

for i in range(6):
    if i % 2 != 0:
        continue #salta a la siguiente iteración
    print(f'Valor: {i}')