#Ejercicio:Rango entre las edades 20 y 30 años
# 1. Preguntar la edad al usuario
# 2. Si la edad está dentro de los 20 o 30 años, esta dentro del rango
# 3. Combinamos los operadores and y or para saber si el usuario esta dentro del rango o no.
edad = int(input("Digite su edad: "))
# veinte = edad >= 20 and edad < 30
# print(veinte)
# treinta = edad >= 30 and edad < 40
# print(treinta)
# if veinte or treinta:
#if (edad >= 20 and edad < 30) or (edad >= 30 and edad < 40):
#           Sintaxis simplificadad del operador and
if (20 <= edad < 30) or (30 <= edad < 40):
    print('Estas dentro del rango de los (20\'0) y (30\'0) años')   
    # if veinte:
    #     print('Estas dentro del rango de los (20\'0) y (30\'0) años')
    # elif treinta:
    #     print('Estas dentro del rango de los (30\'0) años')
else:
    print('No estas dentro del rango de los (20\'0) y (30\'0) años')