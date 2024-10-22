public class MainP2Q2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Graph graph = new Graph(a);
        for(int i = 0; i < a; i++)
        {
            int eCount = scan.nextInt();
            for(intj = 0; j<eCount; j++)
            {
                int d = scan.nextInt();
                int w = scan.nextInt();
                graph.addEdge(i, d, w);
            }
        }
    }
    int minCost = graph.minCost();
    System.out.println("Minimum cost of connecting the cities: " +miniCost);
}

