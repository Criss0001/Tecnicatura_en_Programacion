# Se tiene un conjunto de calificaciones de un 
# grupo de 10 alumnos. Realizar un algoritmo para calcular 
# la calificación promedio y la calificación más baja de todas

suma = 0
calif_baja = 10  

for i in range(1, 11):
    calificacion = float(input(f"{i}. Digite una calificación: "))
    suma += calificacion

    if calificacion < calif_baja:
        calif_baja = calificacion

calif_promedio = suma / 10

print("La calificación promedio es:", calif_promedio)
print("La calificación más baja es:", calif_baja)
