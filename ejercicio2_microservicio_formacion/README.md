# Microservicio de Formación

## Descripción

Este microservicio forma parte de un sistema de gestión educativa y se encarga de manejar las formaciones. Interactúa con el microservicio de cursos para proporcionar una capa adicional de abstracción y funcionalidad.

## Características

- Obtención de formaciones basadas en los cursos existentes
- Creación de nuevas formaciones
- Cálculo automático de asignaturas basado en la duración del curso
- Generación de códigos de curso a partir del nombre de la formación

## Tecnologías

- Java 17
- Spring Boot 3.x
- Spring RestClient
- Maven
- Lombok

## Configuración

1. Asegúrate de tener instalado Java 17 y Maven.
2. Clona este repositorio:


## Ejecución

1. Asegúrate de que el microservicio de cursos esté en ejecución.
2. Ejecuta la aplicación:

## Uso

### Endpoints

- `GET /formacion`: Obtiene todas las formaciones
- `POST /formacion`: Crea una nueva formación

### Ejemplos de Peticiones

#### Obtener Formaciones

#### Crear Formación
POST http://localhost:8080/formacion
Content-Type: application/json
{
"curso": "Introducción a Spring Boot",
"asignaturas": 6,
"precio": 299.99
}

## Dependencias

Este microservicio depende del microservicio de cursos. Asegúrate de que esté en ejecución y accesible antes de usar este servicio.
