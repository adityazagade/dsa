package com.azagade.dsa;

import java.util.Arrays;
class InsertionSort{
  public static void main(String[] args) {
    int[] arr = {1,5,634,8632,24,65,351,1,4,656,51,1,546,463,13,13,1,31,321,6898,-1,1,68,-234,-6,4};
    doInsertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void doInsertionSort(int[] arr){
    int n = arr.length;
    for (int i =1; i < n; i++) {
      int j = i-1;
      int el = arr[i];
      while(j >= 0 && el < arr[j]){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = el;
    }
  }
}
