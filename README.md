#### Pagina automatizada: 
#### Patron de diseño: Screenplay
#### Framework: gherkin, cucumber, Junit, SerenityBDD, selenium
#### Framework adicionales: librerias lombok, Faker, SonarLink, cucumber for java
#### Lenguaje programacion: Java
#### version gradle: gradle-8.4
#### OPEN_JDK Version 17.0.9
#### Driver: Edge version  120.0.2210.121
#### ID: Intellij IDEA community Edition 2023.1
##### ------------------------------------------------------------------------------------------------------

##### ------------------------------------------------------------------------------------------------------
# PASOS PARA LA EJECUCIÓN

## Opcion 1
### PASO A PASO PARA LA EJECUCIÓN POR CONSOLA

### Comando para limpiar el proyecto y luego ejecuta TODOS los escenarios uno por uno
#### ./gradlew clean test

### Comando para ejecutar por feature
#### ./gradlew test --tests "co.com.screenplay.project.runners.OpenWebRunner"
#### ./gradlew test --tests "co.com.screenplay.project.runners" --- TODO LOS FEATURES

### Comando para generar reporte despues que haya terminado un test (Por consola arrojara la ruta .html )
#### ./gradlew reports
#### ./gradlew aggregate

### Comando para limpiar la carpeta Target (Reportes)
#### ./gradle clean
#### ./gradlew clearReports