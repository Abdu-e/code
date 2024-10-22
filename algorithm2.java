public static void algorithm2(int[] array)
{
    int i = 0;
    int j = array.length - 1;

    while (i<j)
    {
        int add = array[i] + array[j];
        if (add == 0)
        {
            System.out.println(array[i]+ " and " +(-array[i])+ " are in the array" );
            i++;
            j--;
        }
        else if (add > 0)
        {
            j--;
        }
        else 
        {
            i++;
        }
    }
    System.out.println("No other duplicates found.");
    Rtime2 = System.currentTimeMillis();
    System.out.println("The run time for algorithm 2 is: " +Rtime2);
}