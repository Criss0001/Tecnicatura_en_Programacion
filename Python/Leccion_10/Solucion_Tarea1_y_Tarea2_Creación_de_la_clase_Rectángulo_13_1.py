from abc import ABC, abstractmethod
# ABC significa: Abstract Base Class, convierte una clase en abstract
from Creamos_la_clase_hija_Cuadrado_13_1 import FiguraGeometrica, Color
from Creamos_las_clases_padre_13_1 import FiguraGeometrica, Color


class FiguraGeometrica(ABC):
    def __init__(self, ancho, alto):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self._ancho = 0
            print(f'Valor erroneo para el ancho: {ancho}')
        if self._validar_valores(alto):
            self._alto = alto
        else:
            self._alto = 0
            print(f'Valor erroneo para el alto: {alto}')

    @property
    def ancho(self):
        return self._ancho
    
    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            print(f'Valor erroneo para el ancho: {ancho}')

    @property
    def alto(self):
        return self._alto
    
    @alto.setter
    def alto(self, alto):
        if self._validar_valores(alto):
            self._alto = alto
        else:
            print(f'Valor erroneo para el alto: {alto}')

    @abstractmethod
    def calcular_area(self):
        pass

    def __str__(self):
        return f'FiguraGeometrica [Ancho: {self._ancho}, Alto: {self._alto}]'
    
    def _validar_valores(self, valor): # Método Encapsulado
        return True if 0 < valor < 10 else False

class Color:
    def __init__(self, color):
        self._color = color

    @property
    def color(self):
        return self._color
    
    @color.setter
    def color(self, color):
        self._color = color

    def __str__(self):
        return f'Color: [Color: {self._color}]'

class Cuadrado(FiguraGeometrica, Color):
    def __init__(self, lado, color):
        FiguraGeometrica.__init__(self, lado, lado)
        Color.__init__(self, color)

    def calcular_area(self):
        return self._ancho * self._alto

    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)}, {Color.__str__(self)}'
    
# print(cuadrado1)
print(Cuadrado.mro())


class Rectangulo(FiguraGeometrica, Color):
    def __init__(self, ancho, alto, color):
        FiguraGeometrica.__init__(self, ancho, alto)
        Color.__init__(self, color)

    def calcular_area(self):
        return self._ancho * self._alto

    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)}, {Color.__str__(self)}'  
    

