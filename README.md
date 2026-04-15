# Carrera de Personajes - JavaFX Multi-threading
<img width="871" height="527" alt="image" src="https://github.com/user-attachments/assets/63920214-90f1-468e-a430-a0f6d84e6f2f" />

## Descripción del Proyecto
Este sistema es una simulación interactiva de una carrera de personajes desarrollada en Java utilizando la biblioteca **JavaFX**. El proyecto implementa una arquitectura **Modelo-Vista-Controlador (MVC)** y utiliza programación concurrente para gestionar el movimiento independiente de cada competidor (Arthas, Illidan y Thrall).

El objetivo es demostrar el uso de hilos de ejecución para manipular propiedades visuales en tiempo real dentro de una interfaz gráfica de usuario.

---

## Estructura del Proyecto
El proyecto sigue una estructura de paquetes organizada para facilitar la escalabilidad y el mantenimiento:

* **Controlador:** Contiene la lógica de negocio y la gestión de eventos de la interfaz (`CarreraControlador.java`).
* **Modelo:** Define las entidades y la lógica de datos (`Personaje.java`).
* **Imagenes:** Repositorio de recursos gráficos (sprites y fondos).
* **Vistas:** Archivos FXML que definen la jerarquía de la interfaz de usuario.

---

## Requisitos del Sistema
Para ejecutar este proyecto, asegúrese de cumplir con los siguientes requisitos:

* **JDK:** Versión 24 o superior.
* **JavaFX SDK:** Versión 25.0.2 (o compatible).
* **IDE:** IntelliJ IDEA Community Edition o similar.
* **Build Tool:** Gestión manual de librerías o configuración de módulos JavaFX.

---

## Configuración y Ejecución

### 1. Clonación del Repositorio
```bash
git clone https://github.com/tu-usuario/Carrera-Personajes.git
```

### 2. Argumentos de la VM
Para la correcta ejecución en entornos modernos de Java, es necesario añadir los siguientes parámetros en la configuración de ejecución del IDE:

```text
--module-path /ruta/a/javafx-sdk/lib 
--add-modules javafx.controls,javafx.fxml 
--enable-native-access=javafx.graphics
```

---

## Características Técnicas
* **Interfaz Responsiva:** Uso de AnchorPane y contenedores dinámicos (VBox/HBox) para mantener la proporción de los elementos.
* **Estilos Avanzados:** Implementación de efectos visuales mediante DropShadow y gradientes lineales directamente en el FXML.
* **Concurrencia:** Gestión de desplazamientos mediante el uso de hilos para evitar el bloqueo del hilo principal de la interfaz (JavaFX Application Thread).

---

## Autor
**Antony Ariel Cisneros Benavides** Estudiante de Tecnología Superior en Desarrollo de Software  
Escuela de Formación de Tecnólogos (ESFOT)  
Escuela Politécnica Nacional (EPN)

---

## Licencia
Este proyecto ha sido desarrollado con fines estrictamente académicos para la materia de Programación Visual / Aplicaciones Distribuidas.
