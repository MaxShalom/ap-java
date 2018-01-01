import java.util.Scanner; 
import java.lang.Math; 
class Main {
  public static void main(String[] args) {
      
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Input a number from 1-100;");
    int x = scan.nextInt();
    if (x > 100) {
        System.out.println("Error!");
    }    
    while (x <= 100) {
        System.out.print(x + " ");
        x++;
    }
  }
}
