//4270797 prac 2
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class contactTracing
{
    
    private static int a;

    public static void main(String[] args)
    {
        int tally = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome. This program determines how many pairs of babies were simultaneously at creche during the same time.");
        System.out.println("Please declare the number of babies present at the creche: ");
        
        int bNum = scanner.nextInt();
        int[] bArr =  new int[a];
        int[] bDep = new int [a];

        for ( int i=0; i<a ; i++)
        {
            System.out.println("Please enter baby " + i+1 + "'s time of arrival and time of departure. Seperated by a comma.");
            String[] t = scanner.next().split(",");
            bArr[i] = Integer.parseInt(t[0]);
            bDep[i] = Integer.parseInt(t[1]);
        }

        List<Pair> tInterval = new ArrayList<Pair>();
        for (int i=0; i<a; i++)
        {
            Pair b = new Pair(bArr[i],bDep[i]);
            tInterval.add(b);
        }
        List<Pair> overLap = new ArrayList<Pair>();
        for (int i=0; i<a; i++)
        {
            int bArr1 = bArr[i];
            int bDep2 = bDep[i];
        }
        //for (Object j = i+1; j<a; j++)
     //   {

     //   }
    }
}