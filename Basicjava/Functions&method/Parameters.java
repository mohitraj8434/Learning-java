import java.util.Scanner;
public class Parameters {

public static void HelloWorld(){
  System.out.println("Hellow world");
  System.out.println("Hellow world");
}


public static void CalculateSum(int a, int b){    // parameters or formal parameters  jo defination ke anadar input hoke ata hai use parameters or formal parameters kehte hai
 
  int sum = a + b;
  System.out.println("sum is " + sum);

}

  public static void main(String[] args){
  
     Scanner sc = new Scanner(System.in);
     HelloWorld();
  System.out.println("Enter first number ");
  int a = sc.nextInt();
  System.out.println("Enter second number ");
  int b = sc.nextInt();
 
 CalculateSum(a, b);  // arguments or actual parameters  call ke time jo value pass hoti hai use arguments or actual parameters kehte hai
  }
}