package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class EvaluacionVectores {

    public static void main(String[] args) {
        actividadRepresentar();
        actividadBuscarMayorMenor();
        actividadInsertar();
        actividadOrdenarYCosto();
    }

    public static void actividadRepresentar() {
        System.out.println("------------------ 1. REPRESENTAR GRÁFICAMENTE ------------------");
        int[] inscritos = {28, 15, 34, 21, 19, 40, 12, 26};

        System.out.println("Vector completo: " + Arrays.toString(inscritos));
        System.out.println("Tamaño (rango): " + inscritos.length);

        for (int i = 0; i < inscritos.length; i++) {
            System.out.println("Índice [" + i + "] -> Valor: " + inscritos[i]);
        }
    }

    public static void actividadBuscarMayorMenor() {
        System.out.println("\n------------------ 2. ENCONTRAR MAYOR Y MENOR ------------------");
        int[] inscritos = {28, 15, 34, 21, 19, 40, 12, 26};

        int mayor = inscritos[0];
        int menor = inscritos[0];

        for (int i = 1; i < inscritos.length; i++) {
            if (inscritos[i] > mayor) {
                mayor = inscritos[i];
            }
            if (inscritos[i] < menor) {
                menor = inscritos[i];
            }
        }
        System.out.println("El mayor número de inscritos es: " + mayor);
        System.out.println("El menor número de inscritos es: " + menor);
    }

    public static void actividadInsertar() {
        System.out.println("\n------------------ 3. INSERTAR VALOR INDICADO ------------------");

        int[] inscritos = new int[10];
        int[] datosIniciales = {28, 15, 34, 21, 19, 40, 12, 26};

        for (int i = 0; i < datosIniciales.length; i++) {
            inscritos[i] = datosIniciales[i];
        }
        int usados = 8;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición a insertar (0 a " + usados + "): ");
        int pos = scanner.nextInt();
        System.out.print("Ingrese el nuevo valor: ");
        int nuevoValor = scanner.nextInt();

        if (pos >= 0 && pos <= usados && usados < inscritos.length) {
            for (int i = usados; i > pos; i--) {
                inscritos[i] = inscritos[i - 1];
            }
            inscritos[pos] = nuevoValor;
            usados++;

            System.out.print("Vector actualizado: ");
            for (int i = 0; i < usados; i++) {
                System.out.print(inscritos[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Error: Posición inválida o el arreglo está lleno.");
        }
    }

    public static void actividadOrdenarYCosto() {
        System.out.println("\n------------------ 4. ORDENAMIENTO (BURBUJA) Y COSTO ------------------");
        int[] inscritos = {28, 15, 34, 21, 19, 40, 12, 26};

        for (int i = 0; i < inscritos.length - 1; i++) {
            for (int j = 0; j < inscritos.length - 1 - i; j++) {
                if (inscritos[j] > inscritos[j + 1]) {
                    int aux = inscritos[j];
                    inscritos[j] = inscritos[j + 1];
                    inscritos[j + 1] = aux;
                }
            }
        }
        System.out.println("Vector ordenado: " + Arrays.toString(inscritos));
    }
}