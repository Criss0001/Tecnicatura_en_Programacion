# Etapas de vida

edad = int(input("Ingresa tu edad y se mostrará en consola en que etapa de la vida estás \n"))

if edad >= 0 and edad <= 10:
    print("La infancia es increíble y bella")
elif edad >= 11 and edad <= 19:
    print("Tienes muchos cambios, mucho que estudiar")
elif edad >= 20 and edad <= 29:
    print("Amor y comienza el trabajo")
elif edad >= 30 and edad <= 39:
    print("Consolidación profesional y personal")
elif edad >= 40 and edad <= 49:
    print("Madurez plena, reflexión y crecimiento")
elif edad >= 50 and edad <= 59:
    print("Sabiduría y experiencia se hacen notar")
elif edad >= 60 and edad <= 69:
    print("Comienza una etapa de jubilación y disfrute")
elif edad >= 70 and edad <= 79:
    print("Tiempo de descanso y compartir con los seres queridos")
elif edad >= 80 and edad <= 89:
    print("Tesoro de recuerdos y legado para las nuevas generaciones")
elif edad >= 90:
    print("Una vida longeva llena de historias y aprendizajes")
else:
    print("Edad no válida")