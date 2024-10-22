import java.io.*;

public class Practical12
{
    public static void main(String[] args)
    {
        try 
        {
            BufferedReader in = new BufferedReader(new FileReader("Rhyme.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("Rhyme2.txt"));

            int V = 1;
            int L = 1;
            String poem;

            while((poem =in.readLine()) != null)
            {
                out.write("[" + "]" + "[" + L + "]" + poem);
                
            }

            out.write("Written by Abdu-Raziq Esau, student number: 4270797");
            in.close();
            out.close();
        } catch (Exception e) 
        {
            System.out.println("An error has surfaced.");
        }
        
        
    }
}
