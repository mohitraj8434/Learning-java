import java.util.Scanner;
public class FunctionOverloading {
  // function to add two integers
  public static int add(int a, int b){
    return a + b;
  }
  // function to add three integers
  public static int add(int a, int b, int c){
    return a + b + c;
  }
  // function to add two float values
 public static float add(float a, float b){
  return a + b;
}

public static void main(String[] args){
  System.out.println("The value of a and b is " + add(8.5f,9.2f));
  System.out.println("The value of a and b is " + add(8,9));
}


}