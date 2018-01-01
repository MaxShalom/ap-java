import java.util.Scanner; 
import java.lang.Math; 
import java.lang.String;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner (System.in);

    String x;
    int y = 0;
    String z = "    ";
    
    int w = x.length();
    
    System.out.println("Enter a word:");
    x = scan.nextLine();
    
    if (y >= w) {
        System.out.println(z + x.charAt(y));
        y++;
        z = z + "    ";
    }    
  }
}
