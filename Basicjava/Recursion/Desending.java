class Recursion{
  public static void decending(int n){
if(n==1){
  System.out.print(n);
  return;
  }
  System.out.print(n + " ");
  decending(n-1);

  }


 // Ascending order 


  public static void ascending(int n){
    if(n==1){
      System.out.print(n + " ");
      return;
    }
    ascending(n-1);
    System.out.print(n + " ");
  }

              //  Factorial of a number 
       public static int factorial(int n){
        if(n==0){
          return 1;
        }
                int fact = factorial(n-1);
                int fact = n*factorial(n-1);
              }
                    // sum of n natural numbers


                public static int calSum(int n){
                  if(n==1){
                      return 1;
                  }
                  int sum = calSum(n-1);
                  int sn = n + sum;
                  return sn;
              }
                 
                // Fibonacci of a number 

              public static int fib(int n){
                if(n==0 || n==1){
                  return n;
                }
                int fibo1 = fib(n-1);
                int fibo2 = fib(n-2);
                int fibo = fibo1 + fibo2;
                return fibo;
              }


              // sort an array using recursion
              
                  public static boolean isSorted(int arr[], int i){
                    if(i == arr.length-1){
                      return true;
                    }

                    if(arr[i] > arr[i+1]){
                      return false;
                    }
                    return isSorted(arr, i+1);
                  }


              // first occurence of a number in an array

              public static int firstOccurence(int arr[], int key, int i){
               if(i==arr.length){
                return -1;
               }
               if(arr[i] == key){
                return i;
               }
               return firstOccurence(arr, key, i+1);
              }

                     // power of a number 
               
              public static int power(int x, int n){
                  
                  if(n==0){
                      return 1;
                  }
                //   int xnm1 = power(x, n-1);
                //   int xn = x * xnm1;
                //   return xn;
                
                return x * power(x, n-1);
              }
    

  public static void main(String args[]){
int n = 5;
fib(n);
// factorial(n);
System.out.println("Fibonacci of " + fib(n));
  }
}