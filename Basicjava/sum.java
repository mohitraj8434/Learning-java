import java.util.*;
public class sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number:");
    int num1 = sc.nextInt();
    System.out.println("Enter second number:");
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    System.out.println("The sum is: " + sum);

    // Product of two numbers
    System.out.print("Enter first number for product:");
    int a = sc.nextInt();
    System.out.print("Enter second number for product:");
    int b = sc.nextInt();
    int product = a * b;
    System.out.println("The product is : " + product);

  }
}