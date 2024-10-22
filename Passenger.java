import java.util.Date;
import java.util.ArrayList;

class Passenger extends Person
{
    private ArrayList<RideRecord>
    rideHistory = new ArrayList<>();
    public Passenger(String idNumber, String name, Date dateOfBirth)
    {
        super(idNumber, name, dateOfBirth);
    }
    public void takeRide(RideRecord rideRecord)
    {}
   
    public boolean hasRideHistory()
    {
        return !rideHistory.isEmpty();
    }
    
}