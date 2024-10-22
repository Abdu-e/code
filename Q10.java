import java.util.Scanner;
import java.io;
import java.File;

public class Q10
{
    public static void main(String[] args)
    {
        File myFile = new File("");

        Scanner scan = new Scanner(myFile);

        float a = scan.nextInt();

        float b = scan.nextFloat();

        System.out.println(b % a);


    }
}