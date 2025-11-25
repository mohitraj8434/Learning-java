import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  //nextLine use when take input a full name ya full sentence from user 

        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your name:");
        String input = sc.next();       //next use when take a single word input from user;
        System.out.println(input);

        
    }
}