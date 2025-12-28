import java.util.*;
public class TernaryOperator {
  public static void main(String[] args) {
    int num = 15;

    String type = (num % 2 == 0) ? "Even" : "odd";
    System.out.println(num + " is " + type + " number.");
  }   
}