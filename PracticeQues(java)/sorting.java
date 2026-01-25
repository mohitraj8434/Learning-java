//  uestion :  Use the following sorting algorithms tosort an array in DESCENDING order :a.Bubble Sortb.Selection Sortc.Insertion Sortd.Counting Sort 
// You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]

import java.util.*;
public class sorting {
  // bubble sort 
  public static void bubblesort(int arr[]){
    for(int i=0; i<arr.length-1; i++) {
      for(int j=0; j<arr.length-1-i; j++){
        if(arr[j]<arr[j+1]){
          // swap 
          int temp = arr[j];
          arr[j]= arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
   public static void printArray(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
   }

// selection sort 

public static void selectionsort(int arr[]) {
  for(int i=0; i<arr.length-1; i++){
    int minpos = i;
    for(int j=i+1; j<arr.length; j++){
      if(arr[minpos] < arr[j]){
        minpos = j;
      }
    }
    int temp = arr[minpos];
    arr[minpos] = arr[i];
    arr[i] = temp;
  }
}


// insertion sort

    public static void insertionsort(int arr[]) {
      for(int i=1; i<arr.length; i++){
        int curr = arr[i];
        int prev = i-1;

        while(prev > 0 && arr[prev] < curr) {
          arr[prev+1] = arr[prev];
          prev--;
        }
        arr[prev+1] = curr;
      }

    }

// counting sort 

public static void countingsort(int arr[]) {
  int largest = Integer.MIN_VALUE;
  for(int i=0; i<arr.length; i++){
    largest = Math.max(largest, arr[i]); 
  }

  int count[] = new int[largest+1];
  for(int j=0; j<arr.length; j++){
    count[arr[j]]++;
  }
  // sorting
  int j=0;
  for(int i=count.length-1; i>=0; i--){
    while(count[i] > 0){
      arr[j] = i;
      j++;
      count[i]--;
    }
  }
}


   public static void main(String[] args) {
    int arr[] = {3,6,2,1,8,7,4,5,3,1};
    bubblesort(arr);
     printArray(arr);
   }
}

// jise bhi sort karna ho uske liye bas us function ko call kar dena hai main function ke andar
// jaise ki main function ke andar bubblesort(arr) call kiya hai to wo bubble sort se sort karega array ko