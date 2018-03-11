import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    String[] fruits = null;
    
    System.out.println("How many fruits would you like to input?");
    int num = scan.nextInt();
    fruits = new String [num];
    
    System.out.println("Input a fruit:");
    
    for (int i = 0; i <= num; i++) {
        fruits[i] = scan.nextLine();
        System.out.println("Input a fruit:");
    }
    
    System.out.println(fruits);
  }
}
