# API REST - Sitios de Buceo
## Pablo Hebrero-Practica 4

Este proyecto es una API REST desarrollada con Spring Boot que permite gestionar sitios de buceo. Contiene operaciones de creación, lectura, actualización y borrado (CRUD).

## Endpoints

| Método | Ruta              | Cuerpo (JSON)                                                       | Descripción                         | Respuestas posibles                     |
|--------|-------------------|----------------------------------------------------------------------|-------------------------------------|-----------------------------------------|
| GET    | `/sites`          | -                                                                    | Lista todos los sitios de buceo     | 200 OK                                  |
| GET    | `/sites/{id}`     | -                                                                    | Recupera un sitio por su ID         | 200 OK, 404 Not Found                   |
| POST   | `/sites`          | `{ "name": "", "location": "", "description": "", "depth": 0, "level": "" }` | Crea un nuevo sitio de buceo        | 201 Created, 400 Bad Request            |
| PUT    | `/sites/{id}`     | `{ "name": "", "location": "", "description": "", "depth": 0, "level": "" }` | Actualiza un sitio existente        | 200 OK, 404 Not Found                   |
| DELETE | `/sites/{id}`     | -                                                                    | Elimina un sitio por su ID          | 204 No Content, 404 Not Found           |

## Tecnologías

- Java 17
- Spring Boot

## Cómo ejecutar

```bash
./mvnw spring-boot:run
