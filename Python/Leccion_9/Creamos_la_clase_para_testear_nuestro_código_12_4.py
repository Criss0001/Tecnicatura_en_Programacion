from Creamos_la_clase_hija_Cuadrado_12_3 import Cuadrado
from Solucion_Tarea1_y_Tarea2_Creación_de_la_clase_Rectángulo_12_8 import Rectangulo

cuadrado1 = Cuadrado(5, 'Azul')
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Cálculo del área del cuadrado: {cuadrado1.calcular_area()}')

rectangulo1 = Rectangulo(3, 8, 'verde')
print(rectangulo1.ancho)
print(rectangulo1.alto) 
print(f'Calculo del area del rectangulo: {rectangulo1.calcular_area()}')