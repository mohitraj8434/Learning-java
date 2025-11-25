 
 //Question1:In a program,inputv3 numbers :A, B and C.You have to output the average of these 3 numbers.

 import java.util.*;
 public class practiceproblem1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number A: ");
    int A = sc.nextInt();
    System.out.println("Enter second number B: ");
    int B = sc.nextInt();
    System.out.println("Enter third number C:" );

    int C = sc.nextInt();

    int average = (A + B + C) /3;
    System.out.println("The average of these 3 number is: " + average);
  }
 }

 