import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Display
{
    public static void main(String[] args)
    {
        try {
            File file = new File("C:/Users/fathe/OneDrive/Desktop/logfile.txt");
            Scanner myFileReader = new Scanner(file);
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your start point: ");
            int start = scan.nextInt();
            System.out.println("Enter your end point: ");
            int end = scan.nextInt();
            scan.close();
           // String File = Integer.parseInt(file);
            
            
            for (int i = 0; i < start; i++ )
            {
                myFileReader.nextLine();
            }
            
            for (int i = start; i < end+1; i++)
            {
                System.out.println(myFileReader.nextLine());
            }

            myFileReader.close();
        } catch (FileNotFoundException e) 
        {
            System.out.println("Cannot find logfile!");
            System.out.println("Exiting...");
        }
    }
}