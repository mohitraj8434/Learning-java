import java.util.Scanner;
public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of a ");
    int a = sc.nextInt();

    System.out.println("Enter the value of b ");
    int b = sc.nextInt();
    System.out.println("Enter the operator (+, -, *, /, %) ");
    char operator = sc.next().charAt(0);

    switch(operator){
      case '+': System.out.print(a+b);
      break;
      case '-': System.out.print(a-b);
      break;
      case '*': System.out.print(a*b);
      break;
      case '/': System.out.print(a/b);
      break;
      case '%': System.out.print(a%b);
      break;
      default: System.out.print("Invalid operator");
    }
  }
}