import java.util.Scanner;
public class continues {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for(int i =1; i<=10; i++){
      if(i % 2 == 0){
        continue;
       
      }
      else{
        System.out.println(i);
      }
    }

  }
}