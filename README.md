# HDT8 - Sistema de Atención de Pacientes

## Autor
Pablo Méndez, Universidad del Valle de Guatemala

## Descripción
Este repositorio contiene el código para el sistema de atención de pacientes en un hospital. El sistema utiliza una cola de prioridad para manejar a los pacientes en función de la gravedad de sus síntomas.

## Estructura del Proyecto
El proyecto consta de tres clases principales:

- `Paciente`: Representa a un paciente individual en el hospital.
- `Hospital`: Maneja la cola de prioridad de los pacientes y proporciona métodos para agregar y atender a los pacientes.
- `App`: Contiene el método `main` que se ejecuta al iniciar el programa.

## Cómo usar
Para usar este sistema, debes tener un archivo `pacientes.txt` en el directorio raíz del proyecto. Este archivo debe contener los datos de los pacientes, con los campos separados por comas.

Una vez que tienes el archivo `pacientes.txt`, puedes ejecutar el programa. Se te presentará una interfaz de usuario en la línea de comandos que te permitirá atender a los pacientes en orden de prioridad.


