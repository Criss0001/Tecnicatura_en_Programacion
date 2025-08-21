# Lista = Ariel, Liliana, Natalia, Osvaldo
# Colecciones en Python

# Las listas es lo que conoce en otros lenguajes como arreglos o vectores

nombres = ["Naty", "Osvaldo", "Lily", "Ariel"]
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1]) # Para poner el ultimo elemento de la lista sin saber el largo
print(nombres[-2]) # Para poner el penultimo elemento de la lista sin saber el largo
print(nombres[0:2]) # Imprime desde el 0 al 1 pero no el indice 2
# ir al inicio de la lista al indice (sin incluirlo)
print(nombres[:3]) # Imprime desde el inicio hasta el indice 3
print(nombres[1:]) # Imprime desde el indice 1 hasta el final de la lista
nombres[2] = 'Liliana'
nombres[0] = 'Natalia' # Cambia el valor del indice 0
print(nombres) # Imprime la lista actualizada
# Iterar una lista
for nombre in nombres: # nombre es singular, la lista es plural
    print(nombre)
else:
    print("Se acacbaron los nombres en la lista")

# Preguntamos cuantos elementos tiene la lista
print(len(nombres)) # le pasamos como parametro la lista

# Agregamos un elemento
nombres.append('Marcelo')
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append(7)
print(nombres)

# Insertamos un elemento en una posicion especifica
nombres.insert(1, 'Alberto')
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)

# Eliminamos un elemento
nombres.remove('Alberto')
print(nombres)

# Eliminamos el ultimo elemento
nombres.pop()
print(nombres)

# Eliminamos un indice especifico
del nombres[2]
print(nombres)

# Eliminar, borrar o limpiar todos los elementos de la lista
nombres.clear()
print(nombres)

# Eliminar la lista completa
del nombres
#print(nombres)

# Definimos una TUPLA
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

# Acceder a un elemento, para esto utlizaremos corchetes no parentesis
print(cocina[0])
# Mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango
print(cocina[0:2])
# Ejemplo
verduras = ('papa',) # Una tupla necesita aunquesea un elemento con coma
# De lo contrario solo seria un tipo str cadena
print(verduras)

# Recorremos los elementos de la tupla
for cocinar in cocina:
    print(cocinar, end =' ') # Print esta usando \n para saltos de líneas

cosinaLista = list(cocina)
cosinaLista[0] = 'Plato'
cocina = tuple(cosinaLista) # Convertimos la lista de nuevo a tupla
print('\n', cocina)

# del cocina # esto es para eliminar una tupla

# Tipo set
planetas = {'Marte', 'Júpiter', 'Venus'}
print(len(planetas)) # Usamos la funcon len = length significa largo

# Revisa si un elemento existe dentro de set
print('Marte' in planetas)

# Agregar un elemento
planetas.add('Tierra') # add es una función
print(planetas)

# Eliminar elementos, puede arrojar error si el elemento no existe
planetas.remove('Venus')
print(planetas)

# Eliminar un elemento sin arrojar error si no existe
planetas.discard('Tierra') # discard no arroja error si no existe

# Limpiar el set
planetas.clear()
print(planetas) 

# Eliminar set o conjunto
# del planetas
# print(planetas)  # Esto generará un error porque planetas ya no existe

# 'Maradona':10 un diccionario esta compuesto por dos elementos
# La clave es 'Maradona' y el valor es 10
# UNA LLAVE Y UN VALOR
# dict(key,value)
diccionario = {
    'IDE':'Integrated Development Enviroment',
    'POO':'Programación Orientada a Objetos',
    'SABD':'Sistema de Administración de Vase de Datos',
}
# Verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

# Aceder a un diccionario con la llave(key)
print(diccionario['IDE']) 

# Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificamos elementos
diccionario['Ide'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Como recorrer los elemtnos
for termino in diccionario:
    print(termino)

# Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys(): # Estamos usando una función
    print(termino)  # Muestra solo las lalves

for valor in diccionario.values(): # Usamos una funcion para acceder al diccionario
    print(valor)

# Comprobar la existencia de algun elemento
print('IDE' in diccionario)  # Devuelve un booleano

# Agregar un elemento
diccionario['PK'] = 'Primary key'
print(diccionario)

# Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario
diccionario.clear()


# ELiminar diccionario
# del diccionario # el diccionario ya no existe

# Concatenamos listas
lista1 = [1,2,3,1]
lista2 = [4,5,6,1]
lista3 = lista1+lista2
print(lista3)

lista3.extend([7,8,9,1])
print(lista3)
print(lista3.index(5))
#print(lista3.index(0)) # Arroja error porque no existe el elemento

# Como saber cuantos valores hay dentro de la lista
print(lista3.count(1)) # Cuenta cuantos valores iguales hay

# Para poner al reves una lista
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

# Métodos de ordenamiento
lista3.sort() # Ordena de menor a mayor
print(lista3)
lista3.sort(reverse=True) # Ordena de mayor a menor
print(lista3)

# Repasos de Tuplas
tupla = (4,'Hola',6.78,[1,2,78],4,'HOLA')
print(tupla)

print(4 in tupla) # Acción booleana, su respuesta es de tipo booleana
# Lo que podemos usar dentro de tuplas son: index, count, len
# En tuplas se puede convertir de tupla a lista y viceversa