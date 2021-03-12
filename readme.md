# Spring nrs Test application [![setup automated](https://img.shields.io/badge/Gitpod-ready_to_code-blue?logo=gitpod)](https://github.com/LUISURBM/)

Selección proceso NRS-Group [ready-to-code development environment](https://www.gitpod.io):

<a href="https://gitpod.io/from-referrer/" style="padding: 10px;">
    <img src="https://nrs.co/cms/wp-content/uploads/2018/05/logo-nrs-bpm-colombia.png" width="150" alt="Push" align="center">
</a>

## Servidor REST JAVA
<a href="https://github.com/LUISURBM/nrs-app">GITHUB</a>

<img width="1042" alt="consecionario-screenshot" src="https://raw.githubusercontent.com/luisurbm/nrs-app/master/ScreenShotV1.png">


● Servidor REST JAVA
● Spring Boot y JPA
● Gradle para la gestión de dependencias.
● Pool de threads para poder atender múltiples peticiones simultáneamente.
● Base de datos MySQL y a poder embeber toda la aplicación en los servicios de docker-compose
● Tanto los planetas como las personas, deben contar con un campo “contador”, para conocer la cantidad de visitas de cada registro.

```
./mvnw package -DskipTests
java -jar target/*.jar
or 
./mvnw spring-boot:run
```

```
docker-compose up
```
