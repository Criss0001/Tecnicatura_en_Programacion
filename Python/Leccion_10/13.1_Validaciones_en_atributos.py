from Creamos_la_clase_hija_Cuadrado_13_1 import Cuadrado
from Solucion_Tarea1_y_Tarea2_Creación_de_la_clase_Rectángulo_13_1 import Rectangulo

print('Creación de objeeto clase Cuadrado'.center(50, '-'))
cuadrado1 = Cuadrado(5, 'Azul')
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Cálculo del área del cuadrado: {cuadrado1.calcular_area()}')

# MRO - Method Resolution Order
print(Cuadrado.mro())
print(Rectangulo.mro())


rectangulo1 = Rectangulo(3, 8, 'verde')
print('Creación de objeeto clase Rectangulo'.center(50, '-'))
# print(rectangulo1.ancho)
# print(rectangulo1.alto) 
print(f'Calculo del area del rectangulo: {rectangulo1.calcular_area()}')
print(rectangulo1)

