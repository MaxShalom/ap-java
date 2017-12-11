public class RollerCoaster extends ConsoleProgram
{
    public void run()
    {
        int tallEnough = readInt("How tall are you? ");
        int oldEnough = readInt("How old are you? ");
        boolean total = tallEnough > 54 && oldEnough > 10; 
        System.out.print(total);
        

    }
}
