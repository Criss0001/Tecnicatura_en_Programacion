# Sistema de Calificaciones

calificacion = float(input("Ingrese la calificación del 1 al 10: "))

if calificacion >= 0 and calificacion < 6:
    print("F")
elif calificacion >= 6 and calificacion < 7:
    print("D")
elif calificacion >= 7 and calificacion < 8:
    print("C")
elif calificacion >= 8 and calificacion < 9:
    print("B")
elif calificacion >= 9 and calificacion <= 10:
    print("A")
else:
    print("Calificación inválida")