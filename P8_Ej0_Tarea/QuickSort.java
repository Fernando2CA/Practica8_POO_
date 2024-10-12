package mx.unam.fi.poo.g1.p8_T0;
import mx.unam.fi.poo.g1.p8_T0.*;

/**
 * Clase QuickSort
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
*/

public class QuickSort implements Ordenamiento {
    
    /**
     * Método para ordenar un arreglo usando el algoritmo Quick Sort.
     * @param arr -> Parámetro para el arreglo a ordenar.
     */
    public void ordenar(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * Método para intercambiar dos elementos en el arreglo.
     * @param arr -> Parámetro para el arreglo en el que se van a intercambiar los elementos.
     * @param x -> Parámetro para el índice del primer elemento.
     * @param y -> Parámetro para el índice del segundo elemento.
     */
    private void intercambia(int[] arr, int x, int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    /**
     * Método para particionar el arreglo.
     * @param arr -> Parámetro para el arreglo a particionar.
     * @param p -> Parámetro que indica el índice inferior del arreglo.
     * @param r -> Parámetro que indica el índice superior del arreglo.
     * @return i + 1 -> Regresa el índice del pivote después de la partición.
     */
    private int particionar(int[] arr, int p, int r){
        int x = arr[r];
        int i = p - 1;
        
        for (int j = p; j < r; j++) {
            if (arr[j] <= x) {
                i++;
                intercambia(arr, i, j);
            }
        }

        intercambia(arr, i + 1, r);
        return i + 1;
    }
    
    /**
     * Método recursivo para realizar el algoritmo QuickSort.
     * @param arr -> Parámetro para el arreglo a ordenar.
     * @param p -> Parámetro que indica el índice inferior del arreglo.
     * @param r -> Parámetro que indica el índice superior del arreglo.
     */
    private void quickSort(int[] arr, int p, int r){
        if(p < r){
            int q = particionar(arr, p, r);
            quickSort(arr, p, q -1);
            quickSort(arr, q + 1, r);
        }
    }
}
