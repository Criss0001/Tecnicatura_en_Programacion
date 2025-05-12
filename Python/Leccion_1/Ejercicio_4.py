#Ejercicio 4: Operador or, Operador not
#Un padre peude asistir al juego de su hijo?
#1. Verificamos si tiene vacaciones
#2. Verificamos si tiene el día libre
#3. Usar estructura 'if else´ con el operador or
#4. Imprimir
vacaciones = False
diaDescanso = False
if not (vacaciones or diaDescanso):
    print("Tiene trabajo que hacer")
else:
    print('Puede asistir al juego')
