package mx.unam.fi.poo.g1.p8_T0;
import mx.unam.fi.poo.g1.p8_T0.*;

/**
 * Clase principal de la Practica 8_0
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
 */

public class Practica8_0 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        int[] arr1 = {4, 7, 8, 3, 6, 1, 0};
        int[] arr2 = {4, 7, 8, 3, 6, 1, 0};

        Ordenamiento merge = new MergeSort();
        System.out.println("Arreglo original: ");
        imprime(arr1);
        System.out.println("Arreglo ordenado por MergeSort:");
        merge.ordenar(arr1);
        imprime(arr1);

        Ordenamiento quick = new QuickSort();
        System.out.println("Arreglo original: ");
        imprime(arr2);
        System.out.println("Arreglo ordenado por QuickSort:");
        quick.ordenar(arr2);
        imprime(arr2);
    }

    /**
     * Método estático que imprime los elementos del arreglo.
     * @param arr -> Parámetro para el arreglo a imprimir.
     */
    public static void imprime(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
