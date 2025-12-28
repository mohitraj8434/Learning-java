import java.util.Scanner;
public class switchstatement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number between (1-7):");
    int num = sc.nextInt();
    switch(num){
      case 1: System.out.print("Sunday\n");
      break;
      case 2: System.out.print("Monday\n");
      break;
      case 3: System.out.print("Tuesday\n");
      break;
      case 4: System.out.print("Wednesday\n");
      break;
      case 5: System.out.print("Thursday\n");
      break;
      case 6: System.out.print("Friday\n");
      break;
      case 7: System.out.print("Saturday\n");
      break;
      default: System.out.print("Invalid input\n");
    }
  }
}