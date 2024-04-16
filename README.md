# API REST para Gestión de Mensajes con Spring Boot

## Descripción:

Este repositorio contiene el código fuente de una API REST desarrollada en Spring Boot para la gestión de mensajes. La API permite recibir mensajes entrantes, completarlos.

#### POST Message
![Mensaje UML secuencia](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuKfCBialKaZEoKpDAqdbIielpKj9BAfKo4qjBavCJ-M2IkZQmKIi50ByWqEue3m5e0H42L0Yo3KumDyls5N1sT_5rKh1oC10Hy44H9WQ670vfEQb0Eq30000)

#### POST Message Split
![MensajeSplit UML secuencia](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuKfCBialKaZEoKpDAqdbIielpKj9BAfKo4qjBavCJuqlBiZ9BE5AIIn9J4eiJeK95tD1DUZQeQgqKWZm3mxXGX5JG2WgHfK1Ia3DiL88SWqEyFSBTbLmzdTnjL8mCZ3GKJ014QO61bmEgNafGCS20000)

#### GET Message Split
![MensajeSplit2 UML secuencia](https://www.plantuml.com/plantuml/png/SoWkIImgAStDuKfCBialKaZEoKpDAqdbIielpKj9BAfKo4qjBavCJuqlBiZ9BE5AIIn9J4eiJeK95tD1DUZQeQgqKd1t3U62gL90b-P2uG5beSPOAGIv1WVu-mMxAZZxkxXQAHWP6EWec808KmC3BeVKl1IWMm40)

## Características:

Recepción de Mensajes: La API proporciona puntos finales para recibir mensajes entrantes desde diferentes fuentes.

Completado de Mensajes: Permite marcar mensajes como completados una vez que se han procesado.

![MensajeClass UML clases](https://www.plantuml.com/plantuml/png/ZP7DJW8n58NtynGdSGD6Ne2u07yaBem4V85hEOwNz0VlBInyUZMEefbPi6hI-tsdxUdCgrZTfzW4jH29-V9-HQzDyq1tQRcc7JGGKqnQrZlD4hl9QDndphPUCbOCUc0tzD7NtX3x3pjIGuaBrkEfkLJ2j7sjKypVzWfDkyZ4N2KLHnHehhGNUSU6kBgvW6i6qxDOMx0J4p22MrhGe0LHFY7Ggu0PYQcOocy1roLNAp7ICCNFlVnx7MH6oyVrqtYm11XzLxAVBfxaBMvxsX-bwRuKvvC9Ulv0ukMHwzxRp9Wt-nG_0000)

## Tecnologías Utilizadas:

Spring Boot: Framework de desarrollo de aplicaciones Java.

Spring Web: Módulo para desarrollo de aplicaciones web utilizando Spring.


## Instrucciones de Uso:

Clona el repositorio a tu máquina local utilizando el comando git clone.

Importa el proyecto en tu IDE favorito como un proyecto de Maven.

Ejecuta la aplicación Spring Boot utilizando el comando mvn spring-boot:run o directamente desde tu IDE.

## Ejecucion Simple: 

Descarga el dist/vigilancia-0.0.1-SNAPSHOT.jar 

Ejecuta en la consola **_java -jar vigilancia-0.0.1-SNAPSHOT.jar_** para iniciar el servidor

Navega a la url [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

![Swagger](./img/Captura.PNG)

## Contribución:

¡Las contribuciones son bienvenidas! Si tienes alguna idea de mejora o detectas algún problema, no dudes en abrir un problema o enviar una solicitud de extracción.

Licencia:

Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

Autor:

Cristian Leonardo Franco.
