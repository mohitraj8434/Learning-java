import java.util.*;
public class LargestNumber {
  public static int getLargestNumber(int numbers[]){
    int largest = Integer.MIN_VALUE;   // -infinity 
     // for smallest numbers 
     int smallest = Integer.MAX_VALUE;  // +infinity


    for(int i=1; i<numbers.length; i++){
      if(largest<numbers[i]){
        largest = numbers[i];
      }
      if(smallest>numbers[i]){
        smallest = numbers[i];
      }
    }
    System.out.println("smallest number is : " + smallest);
    return largest;
  } 
        //           sub Array 
public static void printsubArray(int numbers[]){

// count for total subArrays
int totalSubArrays = 0;

for(int i=0; i<numbers.length; i++){
  int start = i;

  for(int j=i; j<numbers.length; j++){
int end = j;
    for(int k=start; k<=end; k++){   // print
      System.out.print(numbers[k] + " ");  // subArray
    }
    totalSubArrays++;
    System.out.println();
  }
   System.out.println();
}
System.out.println("Total subArrays : " + totalSubArrays);
}





  public static void main(String args[]){
    int numbers[] = {5,6,8,12,45,89,67,56};
    // System.out.println("largest numbere is : " + getLargestNumber(numbers));
    printsubArray(numbers);

  }
} 