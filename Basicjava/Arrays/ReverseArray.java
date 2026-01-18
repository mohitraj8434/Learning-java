import java.util.Scanner;
 public class ReverseArray {
  public static void reverseArray(int arr[]){
    int first = 0, last = arr.length - 1;
    
    while(first < last){
      // swap
      int temp = arr[last];
      arr[last] = arr[first];
      arr[first] = temp;
      first++;
      last--;
    }
  }
    // print pairs in arr 

   public static void printPairs(int arr[]){
    int totalPairs = 0;

    for(int i=0; i<arr.length; i++){
      int curr = arr[i];
      for(int j=i+1; j<arr.length; j++){
        System.out.print("(" + curr + "," + arr[j] + ") ");
        totalPairs++;
      }
      System.out.println();
    }
    System.out.println("Total pairs : " + totalPairs);
   }


  public static void main(String args[]){
int arr[] = {2,4,8,12,13,24,26};
// reverseArray(arr);
// for(int i=0; i<arr.length; i++){
//   System.out.print(arr[i] + " ");
// }
// System.out.println();
printPairs(arr);
  }
  
 }