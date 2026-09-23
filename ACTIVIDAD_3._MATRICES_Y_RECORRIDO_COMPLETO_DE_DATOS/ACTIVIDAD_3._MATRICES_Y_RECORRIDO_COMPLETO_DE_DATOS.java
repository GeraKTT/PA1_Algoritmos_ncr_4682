public class Actividad3 {

    public static void main(String[] args) {

        // Matriz que representa la cantidad de estudiantes
        // por aula y bloque horario
        int[][] matriz = {
            {25, 18, 30, 22, 15},
            {20, 35, 28, 16, 24},
            {32, 21, 18, 27, 30},
            {15, 26, 34, 20, 18}
        };

        // 1. Mostrar la matriz
        System.out.println("=== MATRIZ DE OCUPACION ===");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // 2. Total de estudiantes por aula
        System.out.println("\n=== TOTAL POR AULA ===");

        for (int i = 0; i < matriz.length; i++) {

            int totalAula = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                totalAula += matriz[i][j];
            }

            System.out.println("Aula " + (i + 1) + ": "
                    + totalAula + " estudiantes");
        }

        // 3. Total de estudiantes por bloque horario
        System.out.println("\n=== TOTAL POR BLOQUE HORARIO ===");

        for (int j = 0; j < matriz[0].length; j++) {

            int totalBloque = 0;

            for (int i = 0; i < matriz.length; i++) {
                totalBloque += matriz[i][j];
            }

            System.out.println("Bloque " + (j + 1) + ": "
                    + totalBloque + " estudiantes");
        }

        // 4. Encontrar la mayor ocupación
        int mayor = matriz[0][0];
        int filaMayor = 0;
        int columnaMayor = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }
            }
        }

        System.out.println("\n=== MAYOR OCUPACION ===");
        System.out.println("Cantidad: " + mayor + " estudiantes");
        System.out.println("Aula: " + (filaMayor + 1));
        System.out.println("Bloque: " + (columnaMayor + 1));
        System.out.println("Posicion: M[" + filaMayor + "]["
                + columnaMayor + "]");
    }
}