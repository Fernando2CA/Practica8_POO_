package mx.unam.fi.poo.g1.p8_0;
import mx.unam.fi.poo.g1.p8_0.*;

public class Ejercicio0 {
    public static void main(String[] args) {
        int[] arr = {
            4, 2, 0, 3, 1, 6, 8
        };
        Ordenamiento bubble = new BubbleSort();
        bubble.ordenar(arr);
        System.out.println("Arreglo ordenado:");
        imprime(arr);

        Ordenamiento selection = new SelectionSort();
        selection.ordenar(arr);
        System.out.println("Arreglo ordenado:");
        imprime(arr);

    }

    public static void imprime(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}