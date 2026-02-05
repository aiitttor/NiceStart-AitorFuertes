# 📱 Nicestart – Android App

Nicestart es una aplicación Android con una interfaz moderna y cuidada, desarrollada siguiendo las guías de **Material Design**. El proyecto pone el foco en la experiencia de usuario, la adaptabilidad visual y el uso de componentes actuales de Android.

---

## 🚀 Preview de la App

### Pantallas principales

| Icono | Splash | Login | Login (Horizontal) |
|------|--------|-------|--------------------|
| ![](img/iconoApp.png) | ![](img/Splash.png) | ![](img/Login.png) | ![](img/LoginHorizontal.png) |

La aplicación cuenta con un **icono personalizado**, una pantalla **Splash** con animación Lottie y una pantalla de **Login** adaptable tanto a orientación vertical como horizontal.

---

### Otras pantallas

| SignUp | Profile | Main |
|-------|---------|------|
| ![](img/Singup.png) | ![](img/profileActivity.png) | ![](img/Main.png) |

- **SignUp**: pantalla de registro con AppBar, campos rellenables y botones de acción.
- **Profile**: pantalla de perfil de usuario con imagen cargada desde Internet.
- **Main**: pantalla principal con AppBar funcional y sistema de refresco.

---

## 🧩 Funcionalidades del MainActivity

La pantalla principal incluye varias utilidades orientadas a la interacción y usabilidad:

- **Botón de Settings** en el AppBar (actualmente sin funcionalidad).
- **Botón de AlertDialog** que abre un diálogo con distintas opciones:
    - Salir de la aplicación.
    - Volver a la pantalla Splash.
    - Cancelar la acción.
- **SwipeRefresh**, que al activarse cambia dinámicamente la imagen de fondo.
- **Acciones de Copy y Download** al mantener pulsado un elemento, mostrando un mensaje informativo mediante Toast.

| Preview |
|--------|
| ![](img/settings.png) ![](img/alert.png) ![](img/AlertDialog.png) ![](img/refreshMain.png) ![](img/refresh2.png) ![](img/CopyDownload.png) ![](img/ToastCopyDownload.png) |

---

## 🧭 MainBab – Navegación con BottomAppBar

La pantalla **MainBab** implementa una navegación moderna basada en **Material Design**, utilizando una estructura de navegación inferior que mejora la accesibilidad y la experiencia del usuario.

### BottomAppBar

La **BottomAppBar** actúa como barra de navegación inferior e integra:
- Un menú de acciones representadas mediante iconos.
- Un botón de navegación que permite acceder a opciones adicionales.

Las acciones del menú muestran mensajes informativos al usuario, proporcionando feedback inmediato.

---

### FloatingActionButton (FAB)

El **FloatingActionButton (FAB)** se encuentra anclado al centro del BottomAppBar y representa la acción principal de la pantalla.  
Su posición y diseño siguen las recomendaciones de Material Design para acciones destacadas.

---

### BottomSheetDialog

Al pulsar el botón de navegación del BottomAppBar se muestra un **BottomSheetDialog**, un panel modal que se desliza desde la parte inferior de la pantalla.

Este panel presenta distintas opciones al usuario y permite ampliar funcionalidades sin cambiar de pantalla, manteniendo una navegación fluida e intuitiva.

---

## 🌍 Internacionalización

La aplicación está disponible en **español** e **inglés**, adaptándose automáticamente al idioma configurado en el dispositivo del usuario.

---

## 🌗 Modo Claro / Oscuro

Nicestart soporta **modo claro y modo oscuro**, ajustándose automáticamente a la configuración del sistema para ofrecer una experiencia visual coherente y cómoda.

---

## 📄 Licencia

This repository is licensed under  
[Creative Commons Attribution-ShareAlike 4.0 International](https://creativecommons.org/licenses/by-sa/4.0/)
