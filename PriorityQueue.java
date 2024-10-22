// Surname: <Esau>
// Name: <Abdu-Raziq>
// Student no: <4270797>
// Course: CSC211
// Year: 2023
// Assignment: Practical 1 Term 2
// File: <PriorityQueue>

class PriorityQueue
{
    /* attributes */
    //2.1
    private int currentSize; // stores current number of elements in PQ
    private FlightNode[] array; // array to store flight nodes, implements PQ
    private int DEFAULT_CAPACITY = 2>>10; // maximum heap size
    /* methods */
    
    //2.2
    public PriorityQueue()
    {
        this.currentSize = 0;
        this.array = new FlightNode[DEFAULT_CAPACITY];
    }

    //2.3
    public PriorityQueue(int capacity)
    {
        this.currentSize = 0;
        this.array = new FlightNode[capacity];
    }

    //2.4
    public int getCurrentSize()
    {
        return this.currentSize;
    }
    public FlightNode[] getArray()
    {
        return this.array;
    }

    //2.5
    public void setCurrentSize(int s)
    {
        this.currentSize = s;
    }
    public void setArray(FlightNode[] array)
    {
        this.array = array;
    }

    //2.6
    public void clear()
    {
        this.currentSize = 0;
        this.array = new FlightNode[DEFAULT_CAPACITY];       
    }

    //2.7
    public Boolean isEmpty()
    {
        return this.currentSize == 0;
    }

    //2.8
    public Boolean add(FlightNode x)
    {
        if(this.currentSize == this.array.length -1)
        {
            FlightNode[] newArray = new FlightNode[this.array.length * 2];
            for(int i = 1; i <= this.currentSize.length; i++)
            {
                newArray[i] = this.array[i];
                this.array = newArray;
            }
        }
        int hole = ++this.currentSize;
        this.array[hole] = x;
    }

    //2.9
    public FlightNode remove()
    {
        if(this.isEmpty())
        {
            return null;
        }
        FlightNode remNode = this.array[1];

        percolateDown(1);
        return remNode;
    }

    //2.10
    public void percolateDown(int hole)
    {
        int child;

    }
}