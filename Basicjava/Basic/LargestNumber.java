import java.util.*;
public class LargestNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = 23;
    int B = 45;
    int C = 12;

    if (A > B && A > C){
      System.out.println("A is the largest number: " + A);
    }
    else if (B > A && B > C){
      System.out.println("B is the Largest number: " + B); 
    }
    else{
      System.out.println("C is the Largest number: " + C);
    }
  }
}