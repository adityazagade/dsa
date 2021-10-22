package com.azagade.dsa;
import java.util.Arrays;

class SelectionSort {
  public static void main(String[] args){
    int[] arr = {1,2,13,4,5,3,7,1,5};
    doSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void doSort(int[] arr){
    int imin = 0;
    for (int i=0; i<arr.length; i++) {
      int index = findMin(arr,i);
      doSwap(arr, i , index);
    }
  }

  private static int findMin(int[] arr, int start){
    int imin = start;
    int i = start + 1;
    while(i < arr.length){
      if(arr[i] < arr[imin]){
        imin = i;
      }
      i++;
    }
    return imin;
  }

  private static void doSwap(int[] arr, int i1, int i2){
    int temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = temp;
  }
}
