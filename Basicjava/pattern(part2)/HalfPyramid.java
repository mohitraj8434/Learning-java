import java.util.Scanner;
public class HalfPyramid {
  public static void inverted_rotated_half_pyramid(int n){

    // outer loop
    for(int i=1; i<=n; i++){
      //spaces 
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      // stars 
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

// inverted rotated half pyramid with numbers 

public static void inverted_rotated_half_pyramid_withNumbers(int n){
  // outer loops
  for(int i=1; i<=n; i++){
// inner loop with numbers
    for(int j=1; j<=n-i+1; j++){
      System.out.print(j + " ");
    }
    System.out.println();
  }
}


  public static void main(String args[]){
    // inverted_rotated_half_pyramid(5);
    inverted_rotated_half_pyramid_withNumbers(5);

  }
}