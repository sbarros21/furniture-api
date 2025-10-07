### FurniStore


### Semana 1


---

### Descripción

---

FurniStore es una reconocida tienda de muebles que busca digitalizar toda su operación para mejorar la experiencia de sus clientes. Actualmente, la gestión se hace en hojas de cálculo y facturas manuales, lo que genera errores, demoras en las entregas y falta de trazabilidad.

FurniStore cuenta con diferentes tipos de muebles, como sofas, sillas, sofa camas, camas, etc; manejados en diferentes estilos visuales como lo son los muebles clasicos, modernos, goticos, minimalistas, etc.
La dirección de la empresa ha confiado en usted para diseñar y construir una solución tecnológica robusta, escalable y profesional, aplicando buenas prácticas de ingeniería de software

### Scaffolding y dependencias iniciales

---

![alt text](/docs/images/spring.png)

JUnit y Jacoco fueron añadidos como dependencias en el pom. Lombok fue agregado como dependencia al momento de generar el repositorio con spring-initialzr.

### Estrategia de ramas

---

main: versión estable para producción.

develop: rama de desarrollo principal.

feature/*: nuevas funcionalidades.

bugfix/*: correcciones de errores.

release/*: preparación de versiones.

### Tecnologías utilizadas

---

Java 17

Spring Boot

MongoDB

JaCoCo (cobertura de pruebas)

Maven (gestión de dependencias y build)


### Diagramas

---

Diagrama de contexto

![alt text](/docs/images/rosadoDiagramaContexto.png)

https://lucid.app/lucidchart/008e78bc-3130-45bc-aa62-0db68c07b82d/edit?viewport_loc=-21%2C-203%2C2107%2C904%2CHWEp-vi-RSFO&invitationId=inv_46655d2d-b141-4aa9-a35d-0c9fada0b644

---

Diagrama de Casos de Uso

![alt text](/docs/images/rosadoCasosDeUso.png)

https://lucid.app/lucidchart/c5f19fa5-6d1c-48a6-aa98-bfd931353966/edit?viewport_loc=-21%2C150%2C2074%2C890%2C.Q4MUjXso07N&invitationId=inv_a5c51ed2-dc2d-4910-bbfa-19d1e4f33ca2

---

Diagrama de Clases preliminar

![alt text](/docs/images/rosadoClases.png)

https://lucid.app/lucidchart/ae55851d-b8ce-4979-ba5a-46065daf1303/edit?viewport_loc=-2412%2C-525%2C6923%2C2542%2CHWEp-vi-RSFO&invitationId=inv_28616f1e-3761-45cd-9137-f7c14378faa7

---

### Patrones

Abstract Factory

Este patrón creacional es ideal para crear familias de objetos relacionados, en este caso distintos tipos muebles con diferentes estilos. Como hay muchas combinaciones posibles de muebles para adquirir, con este patrón se pueden crear de una manera adecuada. Ademas, nos ayuda a cumplir los principios SOLID ya que, por ejemplo, si quiero agregar un nuevo tipo de mueble o un nuevo estilo para los muebles existentes, no debo modificar el codigo existente, sino extenderlo creando clases nuevas. De igual forma, se separana las responsabilidades para cumplir con el principio de reponsabilidad unica, donde cada clase tendra solo una responsabilidad. Tambien nos evitamos que el usuario dependa de interfaces que no utiliza por medio de este patrón.

---

### Semana 2

Diagramas Actualizados

Diagrama de Clases

A este diagrama se añadieron y modificaron algunas clases. Primero, se modifico la clase Bill existente para añadir los atributos mencionados en el enunciado, y con el fin de aplicar el patrón Decorator, por lo cual, también se añadió la interfaz BillInterface, y la clases BillDecorator, IVA, Delivery y Discount. Además, se modificó la clase Client para incluir un poco más de información acerca de los cientes. Por último, la clase Producto se incluyo como una clase abstracta, y la clase Furniture hereda de ella, ya que esta clase es un producto en la tienda.

![alt text](/docs/images/DiagramaClasesDecorator.png)

Diagrama de Casos de Uso

Para incluir el flujo de facturación, se extendió uno de los casos de uso del cliente. Más especificamente, luego de que un ciente realice el pedido, se incluye la generacion de la factura, el calculo del subtotal, del total y realizar el pago.

![alt text](/docs/images/CasosDeUsoFlujoFacturacion.png)

---

### Backlog

Historia de Usuario 1:

Como usuario, quiero realizar el inicio de sesión, para poder utilizar las funcionalidades que ofrece el sistema FurniStore.

Criterios de aceptación:
- El sistema recibe las creedenciales del usuario y las valida. 

Historia de Usuario 2:

Como cliente, quiero ver el catalogo de la tienda, para poder conocer los productos que ofrece la tienda y tomar una decision acerca de mi compra.

Criterios de aceptación:
- El usuario puede ver los productos ofrecidos en el catalogo, incluyendo nombre, precio y estilo.

Historia de Usuario 3:

Como cliente, quiero gestionar mi carrito de compras, para añadir o quitar productos antes de realizar el pedido.

Criterios de aceptación:
- El cliente puede añadir productos a su carrito
- El cliente puede quitar productos que esten en su carrito


Historia de Usuario 4:

Como gerente, quiero gestionar los productos que ofrece la tienda, para ofrecer a los clientes los productos adecuados que se tienen en la tienda.

Criterios de aceptación:
- El gerente puede añadir o quitar los productos ofrecidos en el catalogo.

Historia de Usuario 5:

Como cliente, quiero generar una factura, para poder ver en detalle el precio subtotal y total de mi pedido y efectuar el pago de mi pedido.

Criterios de aceptación:
- Se genera una factura con los productos del pedido, junto al IVA, los costos de envio y descuentos.

---

### Planeación del sprint

HU1: Usuarios ingresan al sistema

Tarea: Crear la clases Usuario, Cliente y Gerente y añadir el flujo de autenticación.
Rama: feature/authentication
Estimación: 1

HU2: Cliente consulta el catalogo

Tarea: Crear las clases Furniture y lo relacionado al patrón Abstract Factory, junto a Catalog.
Rama: feature/catalog
Estimación: 1

HU3: Cliente gestiona el carrito de compras

Tarea: Crear la clase ShoppingCart
Rama: feature/shoppingCart
Estimación: 1

HU4: Gerente gestiona el catalogo

Tarea: Implementar la clase Gerente y la lógica para que modifique el catalogo
Rama: feature/manager
Estimación: 1

HU5: Cliente genera factura

Tarea: Implementar las clases Bill y lo relacionado al patrón Decorator.
Rama: feature/bill
Estimación: 1

### Implementación del modulo de facturación

En la carpeta src/main/java/eci/edu/dosw/furniture_api se encuentra la implementacion de las clases necesarias para este modulo. Adicionalmente, con la ayuda de la IA generativa Claude, cree una clase llamada TestFurnitureSystem, para probar que funciona la implementacion realizada, en el screenshot se evidencia el output en consola.

![alt text](/docs/images/outputModuloFacturacion.png)
