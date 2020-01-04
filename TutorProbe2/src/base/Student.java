
package base;


public class Student extends Person{
    
     private int age;
    private int C_N;
    private String Area;
    private String Email;
    private String Full_A;
    //private String Institution;
    
    Student(String Name, String Username,String Password, String Deg,int age,int C_N,String Email,String Area,String Full_A)
    {
        super(Name,Username,Password,Deg);
        this.age =  age;
        this.C_N= C_N;
        this.Area = Area;
        this.Email = Email;
        this.Full_A = Full_A;
    }
    public void SetA(int age)
    {
        this.age =  age;
    }
    public int getA()
    {
        return age;
    }
    public void SetCN(int C_N)
    {
        this.C_N= C_N;
    }
    public int getCN()
    {
        return C_N;
    }
    /* public void SetIns(String Institution)
    {
           this.Institution = Institution;
    }
    public String getIns()
    {
        return Institution;
    }*/
    public void SetAd(String Area)
    {
           this.Area = Area;
    }
    public String getAd()
    {
        return Area;
    }
    public void SetF_Ad(String Full_A)
    {
           this.Full_A = Full_A;
    }
    public String getF_Ad()
    {
        return Full_A;
    }
    public void SetEm(String Email)
    {
         this.Email = Email;
    }
    public String getEm()
    {
        return Email;
    }
}
