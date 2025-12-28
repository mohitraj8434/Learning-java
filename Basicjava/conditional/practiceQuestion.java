import java.util.Scanner;
public class practiceQuestion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

      // Question 1;
    System.out.println("Enter the number :");

    int num = sc.nextInt();

    if(num > 0){
      System.out.println("The number is positive");

    }
    else {
      System.out.println("The number is negative .");
    }

     // Question 2: Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever

System.out.println("Enter your temperature :");
    float temp = sc.nextFloat();

    if(temp > 100){
      System.out.println("You have a fever.");

    } else {
      System.out.println("you don't have a fever.");
    }

    /// queestion no 5 Write a Java program that takes a year from the user and print whether that year is a leap year or not

System.out.println("Enter a year : ");
  int year = sc.nextInt();
  if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
    System.out.println(year + " is a leap year.");
  }
else {
  System.out.println(year + " is not a leap year.");
}
  }
}