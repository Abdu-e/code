// Surname: <Esau>
// Name: <Abdu-Raziq>
// Student no: <4270797>
// Course: CSC211
// Year: 2023
// Assignment: Practical 1 Term 2
// File: <Main>
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
{
    public static void main(Srting[] args)
    {
        PriorityQueue PriQu = new PriorityQueue();
        try 
        {
            File file = new File(planes.cvs);
            Scanner scanner = new Scanner(file);

            if(scanner.hasNextLine)
            {
                System.out.println(scanner.NextLine);
            }
            while(scanner.hasNextLine())
            {
                String sentence = scanner.NextLine();
                String[] tokens = sentence.split(",");
                String registration_no =tokens[0];
                Date departure_timestamp = formatDateTime(tokens[1]);

                Date arrival_date = new Date();
                FlightNode flightnode = new Flight(arrival_date, registration_no);
            }

        scanner.close();
        } catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

    }
}
