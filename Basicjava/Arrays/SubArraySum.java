import java.util.*;
public class SubArraySum {
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
  int numbers[] = {4,6,8,9,12,13};
  printsubArray(numbers);
}
}


// max subArray sum (Bruete force) 
import java.util.*;
public class SubArraySum {
 public static void maxsubArraySum(int numbers[]){
currSum = 0;
int maxSum = Integer.MIN_VALUE;


for(int i=0; i<numbers.length; i++){
  int start = i;

  for(int j=i; j<numbers.length; j++){
int end = j;
currSum = 0;
    for(int k=start; k<=end; k++){   // print sunArray sum 
      currSum += numbers[k];
    }
    System.out.println("current subArray sum : " + currSum);
    if(maxSum<currSum){
      maxSum = currSum;
    }
  }
}
System.out.println("max sum =  " + maxSum);
}
public static void main(String args[]){
  int numbers[] = {4,6,8,9,12,23};
  maxsubArraySum(numbers);

}
}

// time complexity = O(n^3)