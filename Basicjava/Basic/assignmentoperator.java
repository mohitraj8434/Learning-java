import java.util.*;
public class assignmentoperator {
  public static void main(String[] args){
    int a = 10;
    // a = a + 5;
    a += 5; // assignment operator same as a = a + 5 

    int b = 20;
    b = b - 10;
    b -= 10; // assignment operator same as b = b - 10

    a = a * 4;
    a *= 4; // assignment operator same as a = a * 4

    a = a / 2;
    a /= 2; // assignment operator same as a = a / 2

    System.out.println(a);
  }
}