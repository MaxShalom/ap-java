/* 
@author Max Shalom

TODO:
Create a program that prompts the user for an integer that represents a day in 
the week with 1 representing Sunday, 2 representing Monday, and so on. Create a 
static getName method within the dayName class that takes an integer as a 
parameter and returns a String which contains the name of the day. Then, 
in the main method, print out the day name in the console. If the number entered
is not from 1-7, inform the user that the number they have entered in invalid. 

 */
package apcs.review;
import java.util.Scanner;

public class APCSReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dayNum = new Scanner (System.in);
        
        System.out.println("Input a number from 1-7:");
        int num = dayNum.nextInt();
        System.out.println(getName(num));
        
    }

    public static String getName(int day) {
        
        if (day == 1)
            return("Sunday");
        
        else if (day == 2)
            return("Monday");
        
        else if (day == 3)
            return("Tuesday");
       
        else if (day == 4)
            return("Wednesday");
        
        else if (day == 5)
            return("Thursday");
        
        else if (day == 6)
            return("Friday");
        
        else if (day == 7)
            return("Saturday");
        
        else 
            return("Not Valid");
        
    }
    
}
