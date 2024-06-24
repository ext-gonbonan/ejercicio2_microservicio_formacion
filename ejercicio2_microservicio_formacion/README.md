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
  - https://github.com/ext-gonbonan/ejercicio1_desarrollo_microservicio_crud_cursos.git

## Ejecución

1. Asegúrate de que el microservicio de cursos esté en ejecución.
2. Ejecuta la aplicación:
   - mvn spring-boot:run

## Uso

### Endpoints

- `GET /formacion`: Obtiene todas las formaciones
- `POST /formacion`: Crea una nueva formación

### Ejemplos de Peticiones

#### Obtener Formaciones
GET http://localhost:8080/formacion

#### Crear Formación
POST http://localhost:9000/formacion
Content-Type: application/json
{
"curso": "Introducción a Vaadin",
"asignaturas": 17,
"precio": 299.99
}

## Dependencias

Este microservicio depende del microservicio de cursos. Asegúrate de que esté en ejecución y accesible antes de usar este servicio.
