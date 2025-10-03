class Persona2:
    def __init__(self, nombre, apellido, edad):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self.__nombre} {self.__apellido} {self.__edad}')

    @property
    def nombre(self): # Método Getter
        print('Estamos utilizando el método get')
        return self.__nombre
    
    @nombre.setter
    def nombre(self, nombre): # Método Setter
        print('Estamos utilizando el método set')
        self.__nombre = nombre

    @property
    def apellido(self): # Método Getter
        print('Estamos utilizando el método get')
        return self.__apellido

    @apellido.setter
    def apellido(self, apellido): # Método Setter
        print('Estamos utilizando el método set')
        self.__apellido = apellido

    @property
    def edad(self):
        print('Estamos utilizando el método get')
        return self.__edad
    
    @edad.setter
    def edad(self, edad):
        print('Estamos utilizando el método set')
        self.__edad = edad
    
    def __del__(self):
        print(f'El objeto {self.__nombre} {self.__apellido} ')

if __name__ == '__main__':
    persona1 = Persona2('Ariel', 'Betancud', 41)
    print(persona1.nombre) # Llamamos al método get
    persona1.nombre = 'Juan Pedro' # Llamamos al método setter
    print(persona1.nombre) # Otra vez con el método getter
    print(persona1.mostrar_detalles()) # Llamamos al método mostrar detalles

print(__name__)