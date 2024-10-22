class ChargingStation implements Dockable
{
    private String name;
    private Vehicle[] dockedVehicles;
    
    public ChargingStation(String name,int maxVehicleCapacity)
    {
        this.dockedVehicles = new Vehicle[maxVehicleCapacity];
        this.name = name;
    }

    @Override
    public Boolean canDock() 
    {
        for(int i=0; i<dockedVehicles.length; i++)
        {
            if(dockedVehicles[i] == null)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public <Vehicle> int dock(Vehicle x) {
        for(int i=0; i<dockedVehicles.length; i++)
        {
            if(dockedVehicles[i]==null)
            {
                dockedVehicles[i]=x;
                return i;
            }
        }
        return -1;
    }
    public double calculateTotalChargeNeeded()
    {
        double chargeNeeded = 0;
        for(int i=0; i<dockedVehicles.length; i++)
        {
            if(dockedVehicles[i] != null)
            {
                chergeNeeded += dockedVehicles[i].maxChargeCapacity - dockedVehicles[i].chargeRemaining;
            }
        }
        return chargeNeeded;
    }

    public void printInfo()
    {
        System.out.println("Name: "+this.name);
        System.out.println("The charge needed is: "+this.calculateTotalChargeNeeded());
        if(dockedVehicles[0] == null)
        {
            System.out.println("None");
        }
        else
        {
            System.out.println("Number of Docked vehicles: ");
            for(int i=0; i<dockedVehicles.length; i++)
            {
                if(dockedVehicles[i] != null)
                {
                    System.out.println(dockedVehicles[i].getName());

                }
                else
                {
                    break;
                }
            }
        }
    }
}