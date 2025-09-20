# 🧪 Automatización Frontend con Serenity Screenplay
Este proyecto implementa pruebas automatizadas de frontend utilizando Java + Serenity BDD (Screenplay Pattern) + Cucumber.
El enfoque se basa en la escritura de escenarios en lenguaje natural (Gherkin), apoyado en una arquitectura modular y mantenible.

---

## ⚙️ Tecnologías y Herramientas

- ✅ Java
- ✅ Maven
- ✅ Serenity BDD + Screenplay
- ✅ Cucumber
- ✅ JUnit
- ✅ Selenium WebDriver

---

## 📂 Estructura del Proyecto
```
src
  └── main
      └── java
          └── com.siigo
              ├── interactions/      # Acciones que realizan los actores (interacciones con la UI)
              ├── pageobjects/       # Definición de Targets (elementos de UI)
              ├── questions/         # Validaciones sobre el estado de la aplicación
              ├── tasks/             # Tareas o acciones que realiza el actor
              └── utils/             # Constantes reutilizables
  └── test
      └── java
          └── com.siigo
              ├── runners/           # Clases Runner de Cucumber
              └── stepsdefinitions/  # Glue code para enlazar Gherkin con Screenplay
                  └── driver/        # Configuración del WebDriver
      └── resources
          ├── features/              # Escenarios en lenguaje Gherkin
          ├── serenity.conf          # Configuración de Serenity
          └── serenity.properties    # Propiedades de Serenity
```
---
## ⚙️ Instalación y Ejecución

Clona el repositorio y ejecuta el build para descargar las dependencias:

``` bash 

git clone <url-del-repositorio>
cd frontend-automation
mvn clean install -DskipTests
```
🧪 Ejecutar pruebas

Para ejecutar todos los tests (por defecto se ejecutan los runners):
```
mvn clean test
```
Para ejecutar un runner específico, por ejemplo el runner de login:
```
mvn clean test -Dtest=LoginRunnerTest
```
---