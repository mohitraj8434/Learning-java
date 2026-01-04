import java.util.*;

public class Dowhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do{
      System.out.print("Enter a number ");
      int n = sc.nextInt();
      if(n % 10 == 0){
        System.out.print("The number is divisible by 10");
        break;
      }
      System.out.println(n);
    } while(true);

  }
}