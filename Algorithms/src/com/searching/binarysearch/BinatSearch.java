package com.searching.binarysearch;

public class BinatSearch {

  public int binarfySearch(int key, int[] arr1){

    int start = 0;
    int end = arr1.length-1;

    while(start <=end){

      int mid = (start+end)/2;
      if(key== arr1[mid]){
        return mid;
      }
      if(key < arr1[mid]){
        end = mid -1;

      }else{
        start= mid+1;
      }
    }


    return 0;

  }
  public static void main(String[] args) {

    BinatSearch mbs = new BinatSearch();
    int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
    System.out.println("Key 14's position: "+mbs.binarfySearch(14,arr));
    int[] arr1 = {6,34,78,123,432,900};
    System.out.println("Key 432's position: "+mbs.binarfySearch(432,arr1));
}

}
