# Usa una imagen base de Java
FROM openjdk:11

# Copia el archivo JAR de tu aplicación Spring Boot al contenedor
COPY target/project-apply-0.0.1-SNAPSHOT.jar /app.jar

# Expone el puerto en el que tu aplicación se ejecutará
EXPOSE 8080

# Comando para ejecutar la aplicación al iniciar el contenedor
CMD ["java", "-jar", "/app.jar"]
