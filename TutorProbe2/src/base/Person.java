
package base;

    public class Person {
    
        private String Name;
    private String Username;
    private String Password;
    private String Deg;
    
    Person(String Name,String Username, String Password,String Deg)
    {
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.Deg = Deg;
    }
    public void setU(String Username)
    {
        this.Username = Username;
    }
    public String getU()
    {
        return Username;
    }
     public void setP(String Password)
    {
        this.Password = Password;
    }
    public String getP()
    {
        return Password;
    }
    public void setN(String Name)
    {
        this.Name = Name;
    }
    public String getN()
    {
        return Name;
    }
    public void setD(String Deg)
    {
        this.Deg = Deg;
    }
    public String getD()
    {
        return Deg;
    }
}
