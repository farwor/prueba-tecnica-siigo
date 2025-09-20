# Proyecto de Automatización con Karate

Este proyecto implementa pruebas automatizadas de servicios REST utilizando **Karate** en **IntelliJ IDEA**.  
La API utilizada como ejemplo es [ReqRes](https://reqres.in), la cual permite probar operaciones CRUD sobre usuarios.

---
## 🧰 Tecnologías y Herramientas

- ✅ Java 17 → Lenguaje de programación principal.
- ✅ Maven 3.11+ → Gestión de dependencias y ciclo de vida del proyecto.
- ✅ Karate DSL 1.5.0 → Framework para pruebas de servicios (APIs REST/SOAP, GraphQL).
- ✅ JUnit 5 → Ejecutor de pruebas e integración con Maven.
- 📦 IntelliJ IDEA / Eclipse → IDE recomendado para desarrollo.
- 🔄 Git / GitHub → Control de versiones.



---

## 📂 Estructura del proyecto
```

├── src/
│ ├── main/
│ │ ├── resources/
│ │ └── json/ # Archivos JSON para request body
│ └── test/
│ └── java/co/com/siigo/
│ ├── delete/ # Feature de eliminación
│ │ └── eliminar_usuario.feature
│ ├── get/ # Feature de consulta
│ │ └── lista_usuarios.feature
│ ├── post/ # Feature de creación
│ │ └── crear_usuario.feature
│ └── put/ # Feature de actualización
│ └── actualizar_usuario.feature
│ └── EjecutarTestRunner.java # Runner general de pruebas
├── pom.xml # Configuración Maven
├── karate-config.js # Configuración global de Karate
└── README.md # Este archivo
```

---

## ⚙️ Dependencias (Maven)

En el `pom.xml` debes incluir:

```xml
 <dependency>
    <groupId>io.karatelabs</groupId>
    <artifactId>karate-junit5</artifactId>
    <version>${karate.version}</version>
    <scope>test</scope>
</dependency>

```

---
## 📝 Configuración de logs (logback-test.xml)
Para visualizar request y response detallados durante las pruebas, se utiliza el archivo
logback-test.xml:
```xml
<configuration>
 
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>
  
    <appender name="FILE" class="ch.qos.logback.core.FileAppender">
        <file>target/karate.log</file>
        <encoder>
            <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>

    <root level="info">
        <appender-ref ref="STDOUT" />
        <appender-ref ref="FILE" />
    </root>

    <logger name="com.intuit.karate" level="DEBUG"/>
    <logger name="com.intuit.karate.Runner" level="INFO"/>
    <logger name="com.intuit.karate.ScenarioEngine" level="DEBUG"/>

</configuration>