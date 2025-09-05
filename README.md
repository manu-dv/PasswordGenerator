# 🔑 PasswordGenerator (Ejercicio de repaso en Java)

Este proyecto es un **ejercicio de repaso en Java** cuyo objetivo es practicar conceptos básicos de programación, como:

- Uso de **constantes** (`static final`) para definir configuraciones.  
- Creación de **métodos estáticos auxiliares** para modularizar el código.  
- Manejo de **`StringBuilder`** para construir cadenas de forma eficiente.  
- Generación de caracteres aleatorios usando `Math.random()`.  
- Uso de **`Scanner`** para leer datos de la consola y permitir la interacción con el usuario.  

---

## 📋 Descripción del programa

El programa genera contraseñas aleatorias siguiendo unas reglas sencillas:

1. La contraseña se compone de:
   - **3 pares** de consonante + vocal (ejemplo: *ba*, *ru*, *mi*).  
   - **2 números** aleatorios (del 0 al 9).  
   - **1 símbolo** de una lista definida (`!@#$€&/\ºª()=?*+-,;.:><"`).  

   👉 Ejemplo de salida: bavecoku42?


2. Una vez generada la contraseña, se pregunta por pantalla al usuario si quiere generar una nueva o no:  
- **Generar una nueva contraseña** (`yes`, `y`).  
- **Conservar la actual y salir** (`no`, `n`).  

---

## 🚀 Ejecución

Compilar y ejecutar el programa desde la terminal:

```bash
javac PasswordGenerator.java
java PasswordGenerator
```
---

## 🧩 Objetivos del ejercicio

Este código sirve como repaso de:

- Estructuras de control (for, do-while).
- Métodos auxiliares que retornan valores.
- Construcción de strings con StringBuilder.
- Entrada/salida por consola.
- Aleatoriedad y manipulación de cadenas.
