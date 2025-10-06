class Persona: #  Creamos una clase
    def __init__(self, nombre, apellido, edad): # Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
persona1 = Persona()
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)