import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public static int[] readArray(String fileName)
{
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
    {
        String line;
        int[] array;
        int size = 0;

        while ((line = reader.readLine()) != null)
        {
            size++; //size of array
        }
    }
    array = new int[size];

    reader.close();
    reader = new BufferedReader(newFileReader(filename));
    int i = 0;
    while ((line = reader.readLine()) != null)
    {
        array[i++] = Integer.parseInt(line);    
    }

    return array;
}
catch (IOException e)
{
    e.printStackTrace();
    return null;
}

public class OppPairs
{
    public static int[] readArray(String fileName)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            int[] array;
            int size = 0;

            while ((line = reader.readLine()) != null)
            {
                size++; //size of array
            }
        }
        array = new int[size];

        reader.close();
        reader = new BufferedReader(newFileReader(filename));
        int i = 0;
        while ((line = reader.readLine()) != null)
        {
            array[i++] = Integer.parseInt(line);    
        }

        return array;
    }
    catch (IOException e)
    {
        e.printStackTrace();
        return null;
    }
    
    publiic static void main(String[] args)
    {
        int[] sortedA = readArrayFromFile("input.txt");
        if (sortedA != null)
        {
            System.out.println("Algorithm 1:");
            algorithm1(sortedA);

            System.out,println("Algorithm 2:");
            algorithm2(sortedA);
        }
    }
}