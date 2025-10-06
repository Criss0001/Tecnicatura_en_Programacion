def listarTerminos(**terminos):
    for llave, valor in terminos.items(): # kwargs significa: key word arguments
        print(f'{llave}: {valor}')
listarTerminos() # No recibe nada, nada se va a mostrar
listarTerminos(IDE='Integrated Development Environment', PK='Primary Key')
listarTerminos(Nombre='Leonel Messi')