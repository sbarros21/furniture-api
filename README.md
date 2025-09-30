### FurniStore

### Descripción

FurniStore es una reconocida tienda de muebles que busca digitalizar toda su operación para mejorar la experiencia de sus clientes. Actualmente, la gestión se hace en hojas de cálculo y facturas manuales, lo que genera errores, demoras en las entregas y falta de trazabilidad.

FurniStore cuenta con diferentes tipos de muebles, como sofas, sillas, sofa camas, camas, etc; manejados en diferentes estilos visuales como lo son los muebles clasicos, modernos, goticos, minimalistas, etc.
La dirección de la empresa ha confiado en usted para diseñar y construir una solución tecnológica robusta, escalable y profesional, aplicando buenas prácticas de ingeniería de software

### Scaffolding y dependencias iniciales

![alt text](spring.png)

JUnit y Jacoco fueron añadidos como dependencias en el pom. Lombok fue agregado como dependencia al momento de generar el repositorio con spring-initialzr.

### Estrategia de ramas

main: versión estable para producción.

develop: rama de desarrollo principal.

feature/*: nuevas funcionalidades.

bugfix/*: correcciones de errores.

release/*: preparación de versiones.

### Tecnologías utilizadas

Java 17
Spring Boot
MongoDB
Swagger (OpenAPI)
JaCoCo (cobertura de pruebas)
SonarQube (análisis estático de código)
Maven (gestión de dependencias y build)


### Diagramas

Diagrama de contexto

![alt text](rosadoDiagramaContexto.png)

https://lucid.app/lucidchart/008e78bc-3130-45bc-aa62-0db68c07b82d/edit?viewport_loc=-21%2C-203%2C2107%2C904%2CHWEp-vi-RSFO&invitationId=inv_46655d2d-b141-4aa9-a35d-0c9fada0b644

Diagrama de Casos de Uso

![alt text](rosadoCasosDeUso.png)

https://lucid.app/lucidchart/c5f19fa5-6d1c-48a6-aa98-bfd931353966/edit?viewport_loc=-21%2C150%2C2074%2C890%2C.Q4MUjXso07N&invitationId=inv_a5c51ed2-dc2d-4910-bbfa-19d1e4f33ca2

Diagrama de Clases preliminar

![alt text](rosadoClases.png)

https://lucid.app/lucidchart/ae55851d-b8ce-4979-ba5a-46065daf1303/edit?viewport_loc=-2412%2C-525%2C6923%2C2542%2CHWEp-vi-RSFO&invitationId=inv_28616f1e-3761-45cd-9137-f7c14378faa7

### Patrones

1. Abstract Factory

Este patrón creacional es ideal para crear familias de objetos relacionados, en este caso distintos tipos muebles con diferentes estilos. Como hay muchas combinaciones posibles de muebles para adquirir, con este patrón se pueden crear de una manera adecuada. Ademas, nos ayuda a cumplir los principios SOLID ya que, por ejemplo, si quiero agregar un nuevo tipo de mueble o un nuevo estilo para los muebles existentes, no debo modificar el codigo existente, sino extenderlo creando clases nuevas. De igual forma, se separana las responsabilidades para cumplir con el principio de reponsabilidad unica, donde cada clase tendra solo una responsabilidad. Tambien nos evitamos que el usuario dependa de interfaces que no utiliza por medio de este patrón.

