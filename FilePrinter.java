import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FilePrinter
{
    public static void main(String[] args)
    {
        try {
            File file = new File("C:/Users/fathe/OneDrive./Desktop/logfile.txt");
            Scanner myFileReader = new Scanner(file);
            while ( myFileReader.hasNextLine())
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