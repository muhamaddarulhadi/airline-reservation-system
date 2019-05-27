
package airlinereservationsystem;

public class person 
{
    public String name=null;
    public int passport=0;
    public String destination=null;
    public String seat=null;
    public static int sum=0;
    
    
    public person(String name, int passport, String destination, String seat)
    {
        this.name=name;
        this.passport=passport;
        this.destination=destination;
        this.seat=seat;
    }
    
    public String getName()
    {
        return this.name;
    }
    public int getPassport()
    {
        return this.passport;
    }
    public String getDestination()
    {
        return this.destination;
    }
    public String getSeat()
    {
        return this.seat;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPassport(int passport)
    {
        this.passport=passport;
    }
    public void setDestination(String destination)
    {
        this.destination=destination;
    }
    public void setSeat(String seat)
    {
        this.seat=seat;
    }
}
