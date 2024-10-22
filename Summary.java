import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Summary
{
    public static void main(String[] args)
    {
        int err = 0; //number of errors
        int war = 0; //number of warnings
        int not = 0; //number of notifications

        try {
            File file = new File("C:/Users/fathe/OneDrive/Desktop/logfile.txt");
            Scanner fileIn = new Scanner(file);

            while (fileIn.hasNextLine())
            {
                String a = fileIn.next();

                if (a.contains("ERROR"))
                {
                    err++;
                }
                if (a.contains("WARNING"))
                {
                    war++;
                }
                if (a.contains("NOTIFY"))
                {
                    not++;
                }
            }
            fileIn.close();

        } catch (FileNotFoundException e) 
        {
            System.out.println("Cannot find logfile!");
            System.out.println("Exiting...");
        }
        
        System.out.println("Summary");
        System.out.println("---------------------------------------------");
        System.out.println("Errors: "+err);
        System.out.println("Warnings: "+war);
        System.out.println("Notifications: "+not);
        
        
    }
}