# API de Cumpleaños

Esta API en Spring Boot proporciona servicios para calcular la cantidad de días hasta el próximo cumpleaños a partir de la fecha de nacimiento proporcionada.

## Tabla de Contenidos

- [Requisitos](#requisitos)
- [Configuración](#configuración)
- [Cómo Usar](#cómo-usar)
- [Rutas](#rutas)
- [Ejemplos](#ejemplos)
- [Documentación del Código](#documentación-del-código)
- [Contribuir](#contribuir)
- [Licencia](#licencia)

## Requisitos

Asegúrate de tener instalado lo siguiente:

- Java Development Kit (JDK) 8 o superior
- Maven
- Un entorno de desarrollo integrado (IDE) como Eclipse o IntelliJ IDEA (opcional)

## Configuración

1. Clona este repositorio.
2. Abre el proyecto en tu IDE (si estás utilizando uno).
3. Asegúrate de tener configurada tu base de datos si es necesario.
4. Ejecuta la clase `BirthdayProjectApplication` para iniciar la aplicación.

## Cómo Usar

Una vez que la aplicación esté en funcionamiento, puedes interactuar con la API a través de solicitudes HTTP. Puedes utilizar herramientas como Postman o cURL para realizar solicitudes.

## Rutas

- `POST /birthday`: Calcula la cantidad de días hasta el próximo cumpleaños a partir de la fecha de nacimiento proporcionada en el cuerpo de la solicitud. Se espera que el objeto JSON tenga el formato:

  - `json
  {
    "date": "yyyy-MM-dd"
  }`

  
## Ejemplos

Calcular días hasta el próximo cumpleaños

```javascript
``POST /birthday
Content-Type: application/json
{
  "date": "1990-10-15"
}````

## Respuesta

Calcular días hasta el próximo cumpleaños

#### 198

## Documentación del código

 - La lógica de la aplicación se encuentra en las clases del paquete `com.birthday.springboot.projectapply`.

 - El servicio de cálculo de días hasta el próximo cumpleaños se encuentra en `BirthdayService`.

- El controlador de la API se encuentra en `BirthdayController`.

- El modelo de datos se encuentra en `BirthdayModel`.

## Licencia

Este proyecto está bajo la Licencia MIT.