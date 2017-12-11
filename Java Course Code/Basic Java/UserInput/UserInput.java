/* This program prompts the user for their name
 * and age, and then prints it back out. 
 */
public class UserInput extends ConsoleProgram
{
    public void run()
    {
        String name = readLine("Name? ");
    	System.out.println("Name is: " + name);
    	
    	int age = readInt("Age? ");
    	System.out.println("Age is: " + age); 
    }
}
