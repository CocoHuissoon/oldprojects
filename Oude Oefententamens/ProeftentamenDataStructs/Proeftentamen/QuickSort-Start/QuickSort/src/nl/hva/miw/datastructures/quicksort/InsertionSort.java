package nl.hva.miw.datastructures.quicksort;

import java.util.Arrays;

public class InsertionSort {
  /** The method for sorting the numbers */
  public static void insertionSort(int[] list) {
    for (int i = 1; i < list.length; i++) {
      /** insert list[i] into a sorted sublist list[0..i-1] so that
           list[0..i] is sorted. */
      int currentElement = list[i];
      int k;
      for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
        list[k + 1] = list[k];
      }

      // Insert the current element into list[k+1]
      list[k + 1] = currentElement;
    }
  }

  public static void main(String[] args) {
	  
	  int[] a = new int[] { 3,5,21,4,15,2,17,12,7,9,0,20};
	
	  insertionSort(a);
	  
	  System.out.println("Sorted " + Arrays.toString(a));
	  
  }
}
