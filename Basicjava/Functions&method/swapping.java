import java.util.Scanner;
public class swapping {


public static void swap(int a, int b){
  //swapping 
  int temp = a;
  a = b;
  b = temp;
  System.out.println("a = " + a);
  System.out.println("b = " + b);
}



  public static void main(String[] agrs) {
int a = 10;
int b = 20;
swap(a,b);
  }
}