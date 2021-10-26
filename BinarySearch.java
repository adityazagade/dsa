package com.azagade.dsa;

class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
    int target = 7;
    int index = doBinarySearch(arr, target);
    System.out.println(index + " " + arr[index]);
    index = doBinarySearchRecursive(arr, 0, arr.length -1, target);
    System.out.println(index + " " + arr[index]);
  }

  private static int doBinarySearchRecursive(int[] arr, int start, int end, int target){
    int mid = start + (end - start)/2;
    if(start <= end){
      if(arr[mid] == target) {
        return mid;
      } else if(arr[mid] < target){
        return doBinarySearchRecursive(arr, mid+1,end, target);
      } else {
        return doBinarySearchRecursive(arr, start, mid-1, target);
      }
    }
    return -1;
  }

  private static int doBinarySearch(int[] arr, int target){
    int lo = 0, hi = arr.length -1;
    while(lo <= hi) {
      int mid = lo + (hi-lo)/2;
      if(arr[mid] == target){
        return mid;
      } else if(arr[mid] < target){
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return -1;
  }
}
