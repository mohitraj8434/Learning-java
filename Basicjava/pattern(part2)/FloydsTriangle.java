import java.util.Scanner;
public class FloydsTriangle {
  public static void floyds_triangle(int n){
    // outer loop
    int counter = 1; 
    for(int i=1; i<=n; i++){
      // inner loop How many times will counter be printed
      for(int j=1; j<=i; j++){
        System.out.print(counter + " ");
        counter++;
      } 
      System.out.println();
    }
  }
    public static void zero_one_triangle(int n){
    // outer loop
    for(int i=1; i<=n; i++){
      // inner loop
      for(int j=1; j<=i; j++){
        if((i+j)%2==0){
          System.out.print("1 ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
  
}
    }
  public static void main(String args[]){
    // floyds_triangle(6);
    zero_one_triangle(5);
  }
}