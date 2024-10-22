abstract class Computer implements Ethernet
{
    public String HostName;
    private int MemorySize;
    public abstract void shutdown();
    public abstract boolean runProgram(String name);

    public String getHostName()
    {
        return HostName;
    }
    public int getMemorySize()
    {
        return MemorySize;
    }
    public void setHostName(String hostName)
    {
        HostName = hostName;
    }
    public void setMemorySize(int memorySize)
    {
        MemorySize = memorySize;
    }
}