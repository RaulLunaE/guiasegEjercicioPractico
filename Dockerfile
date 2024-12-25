# Usar una imagen base de Java 17 (o la versión que uses)
FROM eclipse-temurin:17-jdk-alpine

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado al contenedor
COPY target/guiaseg-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto en el que se ejecutará la aplicación
EXPOSE 9898

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
