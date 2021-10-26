package com.azagade.dsa;

class TernarySearch {
  public static void main(String[] args) {
    int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
    int target = 1;
    int index = doTernarySearch(arr, target);
    System.out.println(index + " " + arr[index]);
  }

  private static int doTernarySearch(int[] arr, int t){
    int lo = 0, hi = arr.length-1;
    while(lo <= hi){
      int m1 = lo + (hi-lo)/2, m2 = hi - (hi-lo)/2;
      if(arr[m1] == t) {
        return m1;
      } else if(arr[m2] == t){
        return m2;
      } else if(t < arr[m1]) {
        // to left
        hi = m1-1;
      } else if(t > arr[m2]){
        //to right
        lo = m2+1;
      } else {
        //middle
        lo = m1 + 1;
        hi = m2 -1;
      }
    }
    return -1;
  }
}
