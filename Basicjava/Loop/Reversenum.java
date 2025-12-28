public class Reversenum {
  public static void main(String[] args) {
int n = 8990978;

while(n > 0){
  int Lastdigit = n % 10;
  System.out.print(Lastdigit);
  n = n /10;
}
System.out.println();

    // int num = 10989;
    // int Reversenum = 0;
    // while(num !=0){
    //   int digit = num % 10;
    //   Reversenum = Reversenum * 10 + digit;
    //   num /= 10;
    // }
    // System.out.println("The reverse number is : " + Reversenum);
  }
}