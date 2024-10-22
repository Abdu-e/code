import static java.lang.Math.*;

class BasicVehicle
{
    private double longitude;
    private double latitude;
    private double altitude;
    private String registration;

    BasicVehicle()
    {
        this.longitude = 0.0;
        this.latitude = 0.0;
        this.altitude = 0.0;
        this.registration = "Unknown";
    }

    BasicVehicle(double a,double b,double c, String reg)
    {
        this.longitude = a;
        this.latitude = b;
        this.altitude = c;
        this.registration = reg;
    }

    public double getlongitude()
    {
        return longitude;
    }
    
    void setlongitude(double a)
    {
        this.longitude = a;
    }
    
    public double getlatitude()
    {
        return latitude;
    }
    
    void setlatitude(double a)
    {
        this.latitude = a;
    }
    
    public double getaltitude()
    {
        return altitude;
    }
    
    void setaltitude(double a)
    {
        this.altitude = a;
    }
    
    String getregistration()
    {
        return registration;
    }
    
    void setregistration(String a)
    {
        this.registration = a;
    }
    
    public void printInfo()
    {
        System.out.println("Registration: "+ registration + "  Current position: Alt:  " + altitude + " Lat:  " + latitude + " Long: " + longitude);

    }     
}