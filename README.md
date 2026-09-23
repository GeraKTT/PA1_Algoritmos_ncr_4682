# README — Evaluación

> **Curso:** ALGORITMO Y ESTRUCTURA DE DATOS BASADOS EN INTELIGENCIA ARTIFICIAL  
> **Código:** 4682  
> **Evaluación:** PA1  
> **Equipo:** Grupo 4

## 1. Integrantes

| Integrante | Rol | Aporte principal |
|---|---|---|
| Victor Manuel Fabricio Quispe Gonzales | Analista | Resolución de la Actividad 4 |
| Geraldine Khatrina Tudela Theo | Desarrolladora | Resolución de la Actividad 2: Modelado, algoritmos de búsqueda (mayor/menor), inserción y ordenamiento (Burbuja) en vectores. |
| Luis German Guerrero Peña | Analista | Resolución de la Actividad 1: Análisis del problema y selección de estructura. |
| Mijail mendoza chavez | programador |diseño de la matriz, elaboración de algoritmos de recorrido, cálculo de totales, identificación de la mayor ocupación y desarrollo/prueba del código Java |

## 2. Descripción y objetivo
**Problema:**
La coordinación académica requiere un sistema informático estructurado para organizar, procesar y consultar la información referente a la gestión de talleres estudiantiles. Actualmente se necesita un modelo lógico que soporte el control de inscritos, la asignación de aulas, el manejo de bloques horarios y la optimización de los recursos del sistema.   
**Objetivo:**
Proponer e implementar una solución técnica inicial utilizando estructuras de datos lineales estáticas (arreglos y matrices) para almacenar cantidades de inscritos, ejecutar algoritmos de ordenamiento y búsqueda, y representar gráficamente la distribución académica optimizando la memoria.   
**Solución desarrollada:**
El equipo diseñó una arquitectura basada en tres fases:   
**Vectores:** Implementación de un arreglo unidimensional con algoritmos de búsqueda (mayor/menor) y ordenamiento para procesar la cantidad de inscritos por taller.   
**Matrices regulares:** Diseño de un recorrido de datos bidimensional (4 filas x 5 columnas) para calcular la ocupación de aulas según el horario.   
**Optimización lógica:** Análisis del rendimiento del sistema donde se determinó que la aplicación de una matriz poco densa (Sparse Matrix) es la solución más eficiente para gestionar registros masivos de estudiantes, minimizando drásticamente el consumo inútil de memoria.
## 3. Cómo ejecutar o revisar

```bash
# Escribir aquí los comandos necesarios
```

**Pasos de revisión:**
1. [Paso 1]
2. [Paso 2]
3. [Paso 3]

> No publicar contraseñas, tokens, credenciales ni datos sensibles.

## 4. Evidencias

Agregar aquí capturas, resultados, pruebas o enlaces que demuestren el funcionamiento.

- [Evidencia 1]
- Actividad 2 (Vectores):
  ![Consola de Vectores](Actividad_2_Modelado_y_operaciones/evidencias/Evidencia_Actividad2.png)

  actividad 3 matrices y reciorridos base de datos : <img width="705" height="520" alt="Captura de pantalla 2026-09-22 231830" src="https://github.com/user-attachments/assets/109d1900-eded-471b-b6a2-920715e56e2c" />
- Actividad 4 (Matrices especiales):

  
  ![Grafico](Actividad_4_Matrices_especiales/Evidencia4.png)

## 5. Matriz de participación

| Integrante | Desarrollo | Pruebas | Documentación | Exposición | Evidencia de participación |
|---|---|---|---|---|---|
| Victor Manuel Fabricio Quispe Gonzales | Alta | Alta | Media | Sí | Desarrollo de actividad 4 , evidencia , README |
| Geraldine Khatrina Tudela Theo | Alta | Alta | Media | Sí | [Commits, avances, etc.] |
| Luis German Guerrero Peña | Media | Media | Media | No | [Commits, avances, etc.] |
| Mijail mendoza chavez | alta | alta| media | Sí | Desarrollo de la Actividad 3, código Java, pruebas de ejecución y aporte al README |


## 6. Video de exposición

**Video público de YouTube:** 
Actividad 4 : https://youtu.be/aa_Sd9QqeMU




## 7. Conclusiones
El diseño de esta primera etapa del sistema académico demuestra que la correcta selección de estructuras de datos lineales estáticas (vectores y matrices) es fundamental para la eficiencia del software. Mientras que los arreglos unidimensionales permiten gestionar e iterar rápidamente listas definidas como los totales de inscritos, las matrices bidimensionales facilitan el cruce de variables complejas como la ocupación de aulas por horarios. Asimismo, el análisis del caso evidenció que ante volúmenes de datos donde predominan los valores nulos, optar por soluciones avanzadas como las matrices poco densas resulta indispensable para optimizar tanto el consumo de memoria RAM como el costo computacional de los algoritmos de búsqueda.
---

**Última actualización:** [22/09/2026]
