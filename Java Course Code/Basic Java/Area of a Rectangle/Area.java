public class Area extends ConsoleProgram
{
    public void run()
    {
        double width = readDouble("What is the width of the rectangle? ");
        double height = readDouble("What is the height of the rectangle? ");
        System.out.println("The area of the rectangle is " + width * height + " units squared.");
    }
}
