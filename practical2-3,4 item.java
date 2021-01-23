package emloyee;
public class item 
{
    private int location;
    private String description;
    public item(int l,String des);
    {
    this.location=l;
    this.description=des;
    }
    public void setLocation(int loc)
    {
        this.location=loc;
    }
    public int getLocation()
    {
        return location;
    }
    public void setDescription(String des)
    {
        this.description=des;
    }
    public String getDescription()
    {
        return description;
    }
}
