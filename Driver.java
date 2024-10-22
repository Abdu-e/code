import java.util.ArrayList;
import java.util.Date;

class Driver extends Person
{
    private String licenseCode;

    public void giveRide(RideRecord.RideType type, double fee, Passenger passenger)
    {
        Passenger.takeRide();
        this.takeRide = takeRide;
    }

    public Driver(String idNumber, String name, Date dateOfBirth) 
    {
        super(idNumber, name, dateOfBirth);
    }
}