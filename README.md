# 📌 Prueba Técnica Siigo
Automatización de pruebas funcionales y de servicios como parte de una prueba técnica.  
Incluye pruebas E2E con Selenium + Cucumber para la interfaz web y validaciones de APIs con Karate.


Incluye:
- ✅ **Pruebas E2E en frontend** con **Serenity BDD + Selenium + Cucumber + Screenplay**.
- ✅ **Validaciones de APIs** con **Karate**.

---
## 📊 Técnicas de Diseño de Pruebas

Como parte de la automatización de pruebas (Frontend con **Selenium + Cucumber** y Backend con **Karate**), se aplicaron técnicas clásicas de diseño de pruebas para garantizar una adecuada cobertura:

### 🔹 Partición de Equivalencias
Se identificaron clases de entrada válidas e inválidas con el fin de reducir el número de casos de prueba, asegurando una cobertura representativa.
- **Ejemplo (Frontend - Formulario de Login):**
    - Equivalente válido: Usuario con credenciales correctas.
    - Equivalente inválido: Usuario con contraseña vacía.
    - Equivalente inválido: Usuario no registrado.

### 🔹 Valores Límites
Se aplicaron pruebas alrededor de los límites en el campo **email**, validando entradas que suelen generar errores en formularios y APIs.

- **Ejemplo (Frontend - Formulario de Login):**
    - **Límite inferior (mínimo válido):**
        - `a@b.co` → válido (estructura mínima aceptada).
    - **Valores fuera de rango (inválidos):**
        - `a@b` → falta dominio.
        - `abc.com` → falta `@`.
        - `@correo.com` → falta la parte local.
    - **Límites de longitud:**
        - Local-part mayor a 64 caracteres → inválido.  
          (ej: `aaaaaaaaaa...@mail.com` con más de 64 caracteres antes del `@`).
        - Dominio mayor a 255 caracteres → inválido.  
          (ej: `user@subdominioextremadamentelargo...com`).
    - **Caracteres inválidos:**
        - `user@@mail.com` → símbolo `@` repetido.
        - `user mail.com` → espacio no permitido.
        - `user!mail@mail.com` → símbolo no permitido en dominio.

**Resultado esperado:**  
El sistema debe aceptar solo correos electrónicos con formato válido y rechazar aquellos que no cumplan con los límites o estructura definida.

### 🔹 Tabla de Decisión
Se usaron para representar condiciones y reglas de negocio en forma estructurada, facilitando la cobertura de combinaciones lógicas.

| Condición | Regla #1 | Regla #2 | Regla #3 | Regla #4 |
|-----------|----------|----------|----------|----------|
| Identificación Válida | Sí       | Sí       | No       | No       |
| Nombres Válidos | Sí       | No       | Sí       | No       |
| Apellidos Válidos | Sí       | Sí       | No       | No       |
| Acción | Guardar  | Error    | Error    | Error    |

### 🔹 Transición de Estados
| Estado Actual | Evento                  | Estado Siguiente | Acción                       |
|---------------|-------------------------|------------------|------------------------------|
| Login         | Continuar               | Autenticado | Navegar a Inicio - Dashboard |
| Autenticado   | Crear un Tercero | Formulario | Mostrar formulario           |
| Formulario    | Guardar (Válido)        | Guardado | Mostrar mensaje de éxito     |
| Formulario    | Guardar (Inválido)      | Error | Mostrar mensaje de error     |  

---  

## 🐞 Reporte de Bug (Ejemplo)

**ID:** BUG-001  
**Título:** El sistema permite iniciar sesión con contraseña vacía.  
**Severidad:** Alta  
**Prioridad:** Alta

**Precondiciones:**
- El usuario debe estar registrado en la aplicación.

**Pasos para reproducir:**
1. Abrir la aplicación web.
2. Ingresar un usuario válido.
3. Dejar el campo contraseña vacío.
4. Dar clic en **Iniciar sesión**.

**Resultado actual:**  
El sistema permite acceder al home sin validar la contraseña.

**Resultado esperado:**  
El sistema debe mostrar el mensaje de error **“La contraseña es obligatoria”** y no permitir el acceso.

**Evidencia:**
- Screenshot / Log de ejecución adjunto en el reporte de pruebas automatizadas.  

---  