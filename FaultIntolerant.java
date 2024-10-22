import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.nio.file.Files;


public class FaultIntolerant
{
    public static void main(String[] args)
    {
        String a = "";

        try 
        {
            Path file = Path.of("C:/Users/fathe/OneDrive/Desktop/logfile.txt");
            Scanner myFileReader = new Scanner(file);
            a = Files.readString(file);
;
            myFileReader.close();
        } catch (Exception e) 
        {
            System.out.println(a + " Error " + e.getMessage());
            System.out.println("Exiting...");
            System.exit(1);
        }
    }
}