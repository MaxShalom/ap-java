import java.util.Scanner; 
import java.lang.Math; 
class Main {
  public static void main(String[] args) {
    int counter = 0;  
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Input a number from 1-100;");
    int x = scan.nextInt();
    if (x > 100) {
        System.out.println("Error!");
    }    
    while (x <= 100) {
        if(counter%20==0) System.out.println();
        System.out.print(x + " ");
        x++;
        counter++;
    }
    
    
    
  }
}
