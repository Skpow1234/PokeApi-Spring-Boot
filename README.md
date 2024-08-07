# PokeApi-Spring-Boot

Este proyecto es una implementación de una aplicación Spring Boot que consume la API RESTful de PokeAPI y expone los resultados en un servicio SOAP. La arquitectura utilizada es de tres niveles, y se han implementado dos patrones de diseño: Singleton y Facade.

## Arquitectura

La aplicación sigue una arquitectura de tres niveles:

1. **Controlador (Controller)**: Maneja las solicitudes HTTP y SOAP, y delega la lógica de negocio a los servicios.
2. **Servicio (Service)**: Contiene la lógica de negocio y se comunica con la API externa.
3. **Modelo (Model)**: Representa los datos y sus estructuras.

## Patrones de Diseño Implementados

1. **Singleton**: Asegura que haya solo una instancia del cliente Feign para consumir la API de PokeAPI.
2. **Facade**: Simplifica la interacción con el servicio de PokeAPI y el servicio SOAP proporcionando una interfaz unificada.

## Tecnologías Usadas

- **Java 17**: Lenguaje de programación utilizado.
- **Spring Boot 3.3.2**: Framework principal para la construcción de la aplicación.
- **Spring Cloud OpenFeign**: Para consumir la API RESTful de PokeAPI.
- **Spring Web Services**: Para exponer y consumir servicios SOAP.
- **Jackson**: Para la serialización y deserialización de JSON.
- **Lombok**: Para reducir el código boilerplate.
- **Maven**: Para la gestión de dependencias y construcción del proyecto.
- **SOAP**: Protocolo utilizado para exponer los resultados de la API.

## Protocolos Implementados

- **REST**: Para consumir la API de PokeAPI.
- **SOAP**: Para exponer los resultados en un servicio web SOAP.

## Generación de Clases JAXB

Para generar las clases JAXB, ejecuta el siguiente comando en la terminal:

`mvn clean install`

## Generación de Clases Java

Para generar las clases Java a partir del archivo XSD, ejecuta el siguiente comando en la terminal dentro del directorio del proyecto:

`mvn jaxb2:xjc`
