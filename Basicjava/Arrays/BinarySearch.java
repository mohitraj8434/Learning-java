import java.util.*;
public class BinarySearch {
  public static int binarySearch(int numbers[], int key){
    int start = 0, end = numbers.length - 1;
    while(start <= end){
       int mid = (start + end) / 2;

      // comparision
      if(numbers[mid] == key){   // found
        return mid;
      }
      if(numbers[mid] < key){ // right side search
        start = mid + 1;
      } else {  // left side search
        end = mid - 1;
      }
    }
 return -1;
  }

  public static void main(String args[]){
    int numbers[]  = {4,7,9,34,56,67,78,89};
    int key = 78;
    System.out.println("key found at index : " + binarySearch(numbers, key));
  }
}
