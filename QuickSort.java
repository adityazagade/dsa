package com.azagade.dsa;

import java.util.Arrays;
class QuickSort{
  public static void main(String[] args) {
    int[] arr = {1,1, -1, 465,32,12,13,268,6,13,213,13,48794,6,3,16,65,32,165,768,43};
    doQuickSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
  }

  private static void doQuickSort(int[] arr, int start, int end){
    if(start <= end){
      int i = start-1, j = start;
      while(j <= end){
        if(arr[j] < arr[end]) {
            i++;
            int tmp = arr[i];
            arr[i]= arr[j];
            arr[j]= tmp;
        }
        j++;
      }
      i++;
      int tmp = arr[i];
      arr[i] = arr[end];
      arr[end]=tmp;
      doQuickSort(arr, start, i-1);
      doQuickSort(arr, i+1, end);
    }
  }
}
