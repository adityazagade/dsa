package com.azagade.dsa;

import java.util.Arrays;

class MergeSort {
  public static void main(String[] args) {
    int[] arr = {1,4,24,57,654,34,64,6,4324,65,2,1321,2,0,5,21,324,654,64,3,134,68,-5};
    doMergeSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
  }

  private static void doMergeSort(int[] arr, int start, int end){
    if(start<end){
      int mid = (end + start)/2;
      doMergeSort(arr, start, mid);
      doMergeSort(arr, mid + 1, end);
      merge(arr, start, mid, end);
    }
  }

  private static void merge(int[] arr, int start, int mid, int end){
    int[] temp = new int[end - start + 1];
    int i = start, j = mid +1, k = 0;
    while(i <= mid && j <= end){
      if(arr[i] <= arr[j]){
        temp[k] = arr[i];
        i++;
        k++;
      } else{
        temp[k] = arr[j];
        j++;
        k++;
      }
    }
    while(i <= mid){
      temp[k] = arr[i];
      i++;
      k++;
    }
    while(j <= end){
      temp[k] = arr[j];
      j++;
      k++;
    }

    for (int z=0; z < temp.length; z++) {
      arr[start+z] = temp[z];
    }
  }
}
