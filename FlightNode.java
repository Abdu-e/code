// Surname: <Esau>
// Name: <Abdu-Raziq>
// Student no: <4270797>
// Course: CSC211
// Year: 2023
// Assignment: Practical 2 Term 2
// File: <FlightNode.java>
import java.util.Date;

class FlightNode
{
  //1.1
  private String registration_no; // flight registration number
  private Date arrival_date; // date and time at which flight will land

  //1.2
  public FlightNode()
  {
    registration_no = "";
    arrival_date = null;
  }
  
  //1.3
  public FlightNode(String registration_no, Date arrival_date)
  {
    this.registration_no = registration_no;
    this.arrival_date = arrival_date;
  }

  //1.4
  public String getRegistration_no()
  {
    return registration_no;
  }
  public Date getArrival_date()
  {
    return arrival_date;
  }

  //1.5
  public void setRegistration_no(String registration_no)
  {
    this.registration_no = registration_no;
  }
  public void setArrival_date(Date arrival_date)
  {
    this.arrival_date = arrival_date;
  }

  //1.6
  public String toString()
  {
    return "Flight registration number: " +registration_no+ "\nArrival Date: " +arrival_date;
  }
}