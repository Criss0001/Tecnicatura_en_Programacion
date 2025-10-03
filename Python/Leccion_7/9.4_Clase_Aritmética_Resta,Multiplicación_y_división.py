class Aritmetica:
    # """
    # El nombre de este tipo de comentario es: DocString
    # esto es documentacione de la clse en python
    # Vamos a hacer en esta clase algunas operaciones de: suma, resta, multiplicacion y más
    # """
    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
    # Método para sumar
    def sumar(self):
        return self.operandoA + self.operandoB
    
    def resta(self):
        return self.operandoA - self.operandoB
    
    def multiplicacion(self):
        return self.operandoA * self.operandoB
    
    def division(self):
        return self.operandoA / self.operandoB
    
aritmetica1 = Aritmetica(7, 9) # Le pasamos los argumentos para los operandos
print(f'La suma de los números es: {aritmetica1.sumar()}')
print(f'La resta de los números es: {aritmetica1.resta()}')
print(f'La multiplicación de los números es: {aritmetica1.multiplicacion()}')
print(f'La división de los números es: {aritmetica1.division():.2f}')
