import java.lang.reflect.Array;

public abstract class Vehicle
{
    private String name;
    protected double chargeRemaining;
    protected double maxChargeCapacity;
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public double getChargeRemaining()
    {
        return chargeRemaining;
    }
    public void setChargeRemaining(double chargeRemaining)
    {
        this.chargeRemaining = chargeRemaining;
    }
    
    public double getMaxChargeCapacity()
    {
        return maxChargeCapacity;
    }
    public void setMaxChargeCapacity(double maxChargeCapacity)
    {
        this.maxChargeCapacity = maxChargeCapacity;
    }
    
    abstract void printInfo();
    abstract double calculateTotalChargeNeeded();
}
