public static void algorithm1(int[] array)
{
    boolean found = false;
    for(inti=0; i<array.length; i++)
    {
        int x = array[i];
        if (x>0)
        {
            if (sequentialSearch(array, -x))
            {
                System.out.println(x + "and" + (-x) + " are in the array");
                found = true;
            }
        }
    }
    if (!found) 
    {
        System.out.println("No opposite signed duplicates were found. ");
        Rtime = System.currentTimeMillis();
        System.out.println("The rune time of algorithm 1 is: " +Rtime);
    }
}

public static boolean sequentialSearch(int[] array, int a)
{
    for (int i=0, i <array.length; i++)
    {
        if (array[i] == a)
        {
            return true;
        }
    }
    return false;
}