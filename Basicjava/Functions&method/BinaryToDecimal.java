import java.util.Scanner;
public class BinaryToDecimal{
  public static void binTodec(int binNum){
    int myNum = binNum;
    int pow = 0;
    int decNum = 0;
    while(binNum>0){
      int lastDigit = binNum % 10;
      decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
      pow++;
      binNum = binNum / 10;

    }
    System.out.println("Decimal of " + myNum + " is : " + decNum);
  }

      // Decimal to Binary 
  public static void decTobin(int n){
    int myNum = n;
    int pow = 0;
    int binNum = 0;
    while(n>0){
      int lastDigit = n % 2;
      binNum = binNum + (lastDigit * (int)Math.pow(10, pow));
      pow++;
      n = n / 2;
    }
    System.out.println("Binary of " + myNum + " is : " + binNum);
  }

  public static void main(String args[]){
  //  binTodec(1011);
  decTobin(7);
  }
}