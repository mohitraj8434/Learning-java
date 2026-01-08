import java.util.Scanner;
public class whileLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


int count = 1;

 while(count <= 5){
  System.out.println( count + " Hello world");
  count++;
 }

        // the sum of n natural number 

 System.out.println("Enter a  number: ");

int num = sc.nextInt();
int sum = 0;
int i=1;
while(i <= num){
  sum += i;
  i++;
}
System.out.println("The sum of 1 to " + num + " is : " + sum);

  }
}