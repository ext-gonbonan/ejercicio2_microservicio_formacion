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
![imagen](https://github.com/ext-gonbonan/ejercicio2_microservicio_formacion/assets/173496006/c6686a73-5043-4d80-b8bf-1356769e1793)


#### Crear Formación
POST http://localhost:9000/formacion
![imagen](https://github.com/ext-gonbonan/ejercicio2_microservicio_formacion/assets/173496006/4a7e7cb3-1ae0-4690-93f6-159dadc4de09)


## Dependencias

Este microservicio depende del microservicio de cursos. Asegúrate de que esté en ejecución y accesible antes de usar este servicio.
