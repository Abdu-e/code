import java.util.*;

class Edge implements Comparable<Edge> //Edge represents edges in grapgh
{
    int s, d, w;
    Public Edge(int s, int d, int w)
    {
        this.s=s;
        this.d=d;
        this.w=w;
    }

    @Override
    public int compareTo(Edge other)
    {
        return this.w - other.weight;
    }
}

class Graph //adds edges and find min cost
{
    int a;

    ArrayList<Edge> edges;
    public Graph (int a)
    {
        this.a = a;
        edges = new ArrayList<>();
    }
    public int minCost()
    {
        Collection.sort(edges);
        int cost = 0;
        int[] parent = new int[a];

        for (Edge edge : edges)
        {
            int sParent = find(parent,edge.s);
            int dParent = find(parent,edge.d);

            if(sParent != dParent)
            {
                cost += edge.w;
                parent[sParent] = dParent;
            }
        }
        return cost;
    }
    public void addedge(int s, int d, int w)
    {
        edges.add(new Edge(s,d,w));
    }

    private int find(int[] parent, parent[node])
    {
        if(parent[node] == node)
        {
            return node;
        }
        return find(parent,parent[node]);
    }
}

public class MainP4
{
    public static void main(String[] args)
    {
        Scanner txt = new Scanner(System.in);
        int a = txt.nextInt();
        Graph graph = new Graph (a);

        for(int i=0; i<a; i++)
        {
            int eCount = txt.nextInt();
            for(int j= 0; j < eCount; j++)
            {
                int d = txt.nextInt();
                int w = txt.nextInt();
                graph.addEdge(i, d, w);
            }
        }
        int minCost = graph.minCost();
        System.out.println("Section: 1");
        System.out.println("Edge List:");
        for(Edge edge : graph.edges)
        {
            System.out.println(edge.s + " " + edge.d);
        }
    }
}