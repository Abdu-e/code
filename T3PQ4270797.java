  import java.util.Scanner;
  import java.util.ArrayList;
import java.util.Collections; 

public class T3PQ4270797 {
  /**
 * @param args
 */
public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    ArrayList<Integer> inputs = new ArrayList<Integer>();
    
    System.out.println("Enter 10 numbers. Enter a letter when done: ");

    while (in.hasNextInt())
    {
        inputs.add(in.nextInt());
    }
    int sum = 0;
    for(int input : inputs)
    {
        sum+=input;
    }
    
    System.out.println(inputs);


    System.out.println("The sum of all the values in storrageArr: "+sum);

    int max = Collections.max(inputs);
    System.out.println("Maximum value in storageArr is: "+max);

    int min = Collections.min(inputs);
    System.out.println("Minimum value of starageArr is: "+min);

    Collections.sort(inputs);
    System.out.println("Printing the sorted storageArr ");
    System.out.println(inputs);
  }
    
}