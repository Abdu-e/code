public class TestVehicle extends Vehicle
{
    public TestVehicle(String name, int maxChargeCapacity)
    {
        super.setName(name);
        this.maxChargeCapacity = maxChargeCapacity;
    }


public void printinfo()
{
    System.out.println("Name: "+super.getName());
}

public double calculateTotalChargeNeeded()
{
    return maxChargeCapacity - chargeRemaining;
}
}