class Aritmetica:
    """
    El nombre de este tipo de comentario es: DocString
    esto es documentacione de la clse en python
    Vamos a hacer en esta clase algunas operaciones de: suma, resta, multiplicacion y más
    """
    def __int__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
    # Método para sumar"
    def sumar(self):
        return self.operandoA + self.operandoB
aritmetica1 = Aritmetica(7, 9) # Le pasamos los argumentos para los operandos
print(aritmetica1.sumar())