import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;

public class OppPairs
{
    public static int[] readArray(String Input1, String line)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(Input1)))
        {
            String line;
            int[] array;
            int size = 0;

            while ((line = reader.readLine()) != null)
            {
                size++; //size of array
            }
        }
        int[] array = new int[size];

        BufferedReader reader;
        reader.close();
        reader = new BufferedReader(newFileReader(Input1));
        int i = 0;
        while ((line = reader.readLine()) != null)
        {
            array[i++] = Integer.parseInt(line);    
        }

        return array;
    }
    catch (private static Reader newFileReader(String input1) {
        return null;
    }
    IOException e)
    {
        e.printStackTrace();
    }
    
    public static void main(String[] args)
    {
        int[] sortedA = readArrayFromFile("input.txt");
        if (sortedA != null)
        {
            System.out.println("Algorithm 1:");
            algorithm1(sortedA);

            System.out.println("Algorithm 2:");
            algorithm2(sortedA);
        }
    }

    private static int[] readArrayFromFile(String string) {
        return null;
    }
}