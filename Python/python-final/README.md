# Actualizar pip

1. Abrir la terminal de Git Bash o terminal en Linux, debe ser como administrador en Window

2. Creamos una carpeta o directorio: 

mkdir python-final

3. Entramos en ella: 

cd python-final

4. Iniciamos el repositorio:

git init

5. Creamos un archivo:

touch finales.py

6. Abrimos VSC:

code .

7. En terminal ingresamos el comando para saber la versión de Python que tenemos instalada:

python -V

python3 -V

8. Creamos el entorno virtual en Python:

python3 -m venv venv #Creamos el entorno virtual

9. Activamos el entorno virtual:

source venv/bin/activate #Activamos el entorno virtual en Linux

venv/scripts/activate #En windows

10. Hacemos actualización del pip de Python

python3 -m pip install --upgrade pip #Actualizamos el pip

11.

## ¿Qué es el pip y porque lo actualizamos?

```sh
pip
```

Es el sistema de gestión de paquetes oficial de Python. Su nombre viene de "Pip Installs Packages" y se utiliza principalmente para

1. Instalar paquetes desde PyPI (Python Package Index).
2. Desinstalar paquetes.
3. Actualizarlos.
4. Listar los que tenés instalados.
5. Administrar dependencias de proyectos en archivos como requirements.txt.

Se actualiza por varias razones:

1. Seguridad: para corregir vulnerabilidades que pueden ser explotadas al instalar paquetes de terceros.
2. Compatibilidad: versiones nuevas de Python pueden requerir nuevas versiones de pip para funcionar correctamente.
3. Nuevas funciones: con cada actualización se añaden mejoras, comandos nuevos, mejor manejo de errores, etc.
4. Rendimiento: cada versión puede ser más rápida o eficiente.
