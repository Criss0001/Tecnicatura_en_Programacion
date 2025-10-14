class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre    
        self.edad = edad        

    # Getter y Setter de nombre 
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    # Getter y Setter de edad 
    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    # Método para mostrar información
    def mostrar_info(self):
        return f"Nombre: {self._nombre}, Edad: {self._edad}"


class Empleado(Persona):
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self.sueldo = sueldo  # Usa el setter

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self): # Override = sobreescribir
        return f'Persona: [ Nombre: {self._nombre}, Edad: {self._edad}'

    def __str__(self):
        return f'Empleado: [ Sueldo: {self._sueldo}] {super().__str__()}'
    
empleado1 = Empleado('Ariel', 40, 75000)
print("Nombre1: ",empleado1.nombre) 
print("Edad1: ",empleado1.edad)   
print("Sueldo1: ",empleado1.sueldo) 
# Tarea: Encapsular los atributos y agregar los métodos getters and setters
# Crear otro objeto, pasar los datos para nombre, edad y sueldo
# Mostrar estos datos, luego modificar y mostrar nuevamente

empleado2 = Empleado('Lucía', 30, 82000)
print("Nombre2: ",empleado2.nombre) 
print("Edad2: ",empleado2.edad)   
print("Sueldo2: ",empleado2.sueldo)

