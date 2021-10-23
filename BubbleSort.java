package com.azagade.dsa;

import java.util.Arrays;

class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {1,5,634,8632,24,65,351,1,4,656,51,1,546,463,13,13,1,31,321,6898,-1,1,68,-234,-6,4};
    doBubbleSort(arr);
    System.out.println(Arrays.toString(arr));
    int[] arr1 = {1,5,634,8632,24,65,351,1,4,656,51,1,546,463,13,13,1,31,321,6898,-1,1,68,-234,-6,4};
    doBubbleSortRecurssively(arr1, 0, arr1.length);
    System.out.println(Arrays.toString(arr1));
  }

  static void doBubbleSortRecurssively(int[] arr, int i, int size){
    if(size == 1) {
      return;
    }
    if(i == size -1){
      doBubbleSortRecurssively(arr, 0 , size -1);
      return;
    }
    if(arr[i] > arr[i+1]){
      int temp = arr[i];
      arr[i] = arr[i+1];
      arr[i+1] = temp;
    }
    doBubbleSortRecurssively(arr, i+1, size);
  }

  static void doBubbleSort(int[] arr){
    for (int i=0; i < arr.length-1; i++) {
      boolean isSwapped = false;
      for (int j = 0; j < arr.length - i -1; j++) {
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          isSwapped = true;
        }
      }
      if(!isSwapped){
        break;
      }
    }
  }
}
