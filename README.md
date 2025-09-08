# Semana2_1

## Descripción General

Semana2_1 es una aplicación Android desarrollada en Kotlin utilizando Jetpack Compose y Material3. El objetivo principal es mostrar una pantalla de inicio de sesión (login) y navegar entre diferentes vistas que simulan un panel de control y una vista secundaria. El proyecto está estructurado en componentes reutilizables y utiliza navegación entre pantallas.

## Estructura del Proyecto

```
app/
 └── src/
     └── main/
         ├── java/com/example/semana2_1/
         │   ├── components/
         │   │   ├── ButtonApp.kt
         │   │   ├── Drawer.kt
         │   │   ├── MenuNavigation.kt
         │   │   └── TopBar.kt
         │   ├── nav/
         │   │   └── Navigation.kt
         │   ├── ui/theme/
         │   │   ├── Color.kt
         │   │   ├── Theme.kt
         │   │   └── Type.kt
         │   ├── views/
         │   │   ├── view1.kt
         │   │   ├── view2.kt
         │   │   └── view3.kt
         │   └── MainActivity.kt
         └── res/
             └── drawable/
                 └── user.png
                 └── persona.png
```

## Funcionalidad Principal

- **Pantalla de Login:** Permite al usuario ingresar su correo electrónico y contraseña. Incluye validaciones visuales y muestra un diálogo de error si las credenciales son incorrectas. Si el login es exitoso, navega al panel de control.
- **Panel de Control:** Incluye barra superior, menú lateral (drawer) y barra de navegación inferior. Permite navegar entre opciones y cerrar sesión.
- **Vista Secundaria:** Pantalla simple con opción para regresar al login.

## Descripción de Vistas

### View1 (Pantalla de Login)
- Imagen de usuario.
- Campo de texto para email y contraseña con validación visual.
- Botón de login que valida credenciales (usuario: `ADMIN`, contraseña: `UPC123`).
- Diálogo de error si las credenciales son incorrectas.
- Barra superior (`TopBar`) y barra inferior (`ButtonApp`).

### View2 (Panel de Control)
- Barra superior (`TopBar`) con botón para abrir el menú lateral.
- Menú lateral (`Drawer`) con opciones como Profile, Notifications, Home, Add New y Exit.
- Barra inferior de navegación (`MenuNavigation`) con Mail, Settings y Exit.
- Texto central "Control Panel".

### View3 (Vista Secundaria)
- Texto "Third View 3".
- Botón para regresar a la pantalla principal (View1).

## Componentes Importantes
- **TopBar:** Barra superior con título y acciones (Settings, Person, Exit).
- **ButtonApp:** Barra inferior con acciones rápidas y botón flotante.
- **Drawer:** Menú lateral con imagen de usuario y opciones de navegación.
- **MenuNavigation:** Barra de navegación inferior con opciones de Mail, Settings y Exit.

## Temas y Estilos
- El proyecto utiliza un tema personalizado (`Semana2_1Theme`) con colores y tipografías definidos en la carpeta `ui/theme`.

## Instalación y Ejecución

1. **Requisitos previos:**
   - Android Studio instalado (recomendado versión Electric Eel o superior).
   - JDK 17 o superior.
   - Conexión a internet para descargar dependencias.

2. **Clonar el repositorio:**
   ```sh
   git clone <URL_DEL_REPOSITORIO>
   ```

3. **Abrir el proyecto en Android Studio:**
   - Selecciona "Open" y navega hasta la carpeta del proyecto.

4. **Sincronizar Gradle:**
   - Android Studio lo hará automáticamente, pero puedes forzar la sincronización con "Sync Project with Gradle Files".

5. **Ejecutar la aplicación:**
   - Selecciona un emulador o dispositivo físico y haz clic en "Run".

6. **Notas adicionales:**
   - Si falta alguna imagen (user.png, persona.png), agrégala en `app/src/main/res/drawable/`.
   - El login requiere usuario `ADMIN` y contraseña `UPC123`.

## Resumen

Este proyecto es ideal para aprender sobre la estructura de aplicaciones Android modernas con Jetpack Compose, navegación entre pantallas, manejo de estados y componentes visuales reutilizables.

