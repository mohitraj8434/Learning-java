import  java.util.Scanner;
public class ArrayCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        // Creating an array 
        int[] arr = new int[10];
        int marks[] = {67,87,78,90,45};
        String[] names = {"John", "Adam", "Rocky", "Smith"};
        System.out.println("marks is : " + marks);
        System.out.println("names is : " + names);









        // Creating an array of the specified size
        int[] array = new int[size];

        // Populating the array with user input
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Displaying the elements of the array
        System.out.println("The elements in the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}