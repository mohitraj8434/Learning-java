    
    
 //   Question 1: In a program, input 3 numbers :A ,B and C. You have to output the average of these 3 numbers

 import java.util.Scanner;
 public class practiceQuestion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
// Question 1: In a program, input 3 numbers :A ,B and C. You have to output the average of these 3 numbers 

     /*System.out.println("Enter three numbers: ");
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    float average = (A + B + C) / 3f;
    System.out.println("The average of three numbers is : " + average); */
 

   //Question 2: In a program, input the side of a square. You have to output the area of the square 

 /*System.out.println("Enter the side of square: ");
 int side = sc.nextInt();
 float area = side * side;
 System.out.println("The area of square is : "+ area);n*/


 // Question3:Enter cost of 3 items from the user (using float datatype) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 System.out.println("Enter the cost of pencil: ");
 float pencil = sc.nextFloat();
  System.out.println("Enter the cost of pen: ");
  float pen = sc.nextFloat();
    System.out.println("Enter the cost of eraser: ");
    float eraser = sc.nextFloat();
    float totalCost = pencil + pen + eraser;
    float gst = totalCost * 0.18f;
    float finalBill  = totalCost + gst;
    System.out.print("the final bill including gst is : " + finalBill);

 }
 }