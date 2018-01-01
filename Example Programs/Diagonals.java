import java.util.Scanner; 
import java.lang.Math; 
import java.lang.String;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner (System.in);

    String x;
    int y = 0;
    String z = "\t";
    
    System.out.println("Enter a word:");
    x = scan.nextLine();
    
    int w = x.length();
    
    while (y < w) {
        System.out.println(z + x.charAt(y));
        y++;
        z = z + "\t";
    }    
  }
}
