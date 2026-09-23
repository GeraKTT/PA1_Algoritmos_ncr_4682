### Actividad 4. Matrices especiales y decisión técnica

**1. Conceptos técnicos**
*   **Matriz cuadrada:** Es un arreglo bidimensional donde la cantidad de filas es exactamente igual a la cantidad de columnas (N x N). 
*   **Matriz poco densa (Sparse Matrix):** Es una estructura de datos donde la inmensa mayoría de sus posiciones almacenan un valor nulo o cero. Para optimizar el rendimiento, estas matrices no guardan los espacios vacíos, sino que utilizan estructuras que solo almacenan las coordenadas de los valores reales.

**2. Caso de uso y justificación**
En el sistema de la coordinación académica, supongamos que existen **1,500 estudiantes** y un catálogo de **50 talleres** extracurriculares. Si un estudiante solo puede matricularse en un taller como máximo, los datos se comportarían así:

*   Una **matriz completa** de `[Estudiantes][Talleres]` generaría 75,000 celdas (1,500 x 50). De estas, solo 1,500 tendrían un valor de inscripción ("1"), dejando **73,500 celdas almacenando ceros** (98% de la matriz vacía).
*   Una **matriz poco densa** solo almacenaría los 1,500 registros reales (ej. `Alumno 45 -> Taller 12`).

**Justificación técnica:**
Para esta etapa del sistema, es mucho más conveniente implementar una matriz poco densa por dos motivos:
1.  **Memoria:** Evita el desperdicio masivo de RAM al no reservar espacio estático para 73,500 datos nulos.
2.  **Eficiencia del algoritmo:** Si el sistema necesita consultar los inscritos, el algoritmo de búsqueda solo iterará sobre los 1,500 datos existentes, evitando recorrer innecesariamente decenas de miles de posiciones vacías.

