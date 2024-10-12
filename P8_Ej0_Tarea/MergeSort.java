package mx.unam.fi.poo.g1.p8_T0;
import mx.unam.fi.poo.g1.p8_T0.*;

/**
 * Clase MergeSort
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
*/

public class MergeSort implements Ordenamiento {

    /**
     * Método para ordenar un arreglo usando el algoritmo Merge Sort.
     * @param arr -> Parámetro para el arreglo a ordenar.
     */
    public void ordenar(int[] arr){
        mergeSort(arr);
    }

    /**
     * Método recursivo que divide el arreglo y lo ordena.
     * @param arr -> Parámetro para el arreglo a ordenar.
     */
    private void mergeSort(int[] arr){
        int n = arr.length;

        if(n <= 1){
            return;
        }

        int med = n / 2;
        
        int[] arr1 = new int[med];
        int[] arr2 = new int[n - med];

        for (int i = 0; i < med; i++) {
            arr1[i] = arr[i];
        }

        for (int i = 0; i < n - med; i++) {
            arr2[i] = arr[i + med];
        }

        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr, arr1, arr2);

    }

    /**
     * Método para mezclar dos arreglos ordenados en uno solo.
     * @param arr -> Parámetro para el arreglo original donde se almacenarán los elementos ordenados.
     * @param arr1 -> Parámetro para la primera mitad del arreglo ordenado.
     * @param arr2 -> Parámetro para la segunda mitad del arreglo ordenado.
     */
    private void merge(int[] arr, int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int k = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;

        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }

            k++;
        }

        while(i < n1){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}

