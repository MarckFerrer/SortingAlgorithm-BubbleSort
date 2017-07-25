/*
 * This is a simple example of how Bubble sort algorithm works
 */
package sortingalgorithm.bubblesort;

/**
 *
 * @author MarcosFerreira || visit my GH: github.com/MarckFerrer
 */

public class SortingAlgorithmBubbleSort {
   
   private static void bubbleSort(int[] vector) { //The method receive a int array as parameter
      int aux = 0; //This variable will store the larger value of a comparison latter
      int i = 0; //This countig variable will be the responsible for going from 0 to vector's size

      for (i = 0; i < vector.length; i++) { //Start the first 'for' loop
         for (int j = 0; j < vector.length - 1; j++) { //Start the second 'for' loop
            /*
                * Compares the current position of 'vector' with it's next.
                  If the current element is larger, it'll change positions with the next one.
                  And so go on.
             */
            if (vector[j] > vector[j + 1]) {
               aux = vector[j];
               vector[j] = vector[j + 1];
               vector[j + 1] = aux;
            }
         }
      }
   }
   
   private static void showArray(int[] vector){ //This method show all the position of the array
      
      for (int i = 0; i < vector.length; i++) {
         System.out.println("- "+vector[i]);
      }
   }
   
   public static void main(String[] args) {
      int[] vetor = {10, 9, 23, 6, 30, 3, 10, 6, 3, 8};
      bubbleSort(vetor);
      showArray(vetor);
   }
}