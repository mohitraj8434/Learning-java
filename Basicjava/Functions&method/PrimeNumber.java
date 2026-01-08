import java.util.Scanner;
public class PrimeNumber {

  public static boolean primeNumber(int n){
    boolean isprime = true;
    for(int i=2; i<=n-1; i++){
      if(n%i==0){     // completetlly dividing 
        isprime = false;
      }
    }
    return isprime;
  }


 //      2nd method 

  public static boolean primeNumber(int n){
    for(int i=2; i<=Math.sqrt(n); i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }


 // Primes in Range

         public static void primesInRange(int n){
          for(int i = 2; i<=n; i++){
            if(isprime(i)){
              System.out.print(i + " ");
            }
          }
          System.out.println();
         }

public static void main(String[] args){
  // System.out.println(primeNumber(15));
  primesInRange(20);
}
}