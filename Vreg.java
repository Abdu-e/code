class Vreg
{


    private String registration = "unknown";
    private double altitude =  0.0;
    private double longitude = 0.0;
    private double latitude = 0.0;

    public main Vreg()
    {
        this.longitude =  31.0;
        this.latitude =  22.0;
        this.altitude = 180000.0;
        this.registration = "ZS-CS1";
        return null;
    }

    public double getlongitude()
    {
        return longitude;
    }
    void setlongitude(double a)
    {
        this.longitude = 31.0;
    }
    public double getlatitude()
    {
        return latitude;
    }
    void setlatitude(double b)
    {
        this.latitude = 22.0;
    }
    public double getaltitude()
    {
        return altitude;
    }
    void setaltitude(double c)
    {
        this.altitude = 180000.0;
    }
    String getregistration()
    {
        return registration;
    }
    void setregistration(String reg)
    {
        this.registration = "ZS-CS1";
    }
    public void printInfo()
    {
        System.out.println("Registration: "+ registration + "  Current position: Alt:  " + altitude + " Lat:  " + latitude + " Long: " + longitude);

    }
}