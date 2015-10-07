import java.util.Vector;

public class Professional 
{
    String _name;
    Vector<String> qualifications = new Vector<String>();
    
    public Professional(String name)
    {
        _name = name;
    }
    
    public String getName()
    {
     return _name;   
    }
    
    public String[] getQualifications()
    {
        return qualifications.toArray(new String[0]);
        
    }
    
    public void addQualification(String qualification)
    {
        if (!hasQualification(qualification))
        {
            qualifications.add(qualification);
        }  
    }
    
    public boolean hasQualification(String qualification)
    {   boolean found = false;
        for (String str : qualifications)
        {
            if (str.equalsIgnoreCase(qualification))
            {
                found = true;
                break;
            }
        }
    return found;
    }
}
