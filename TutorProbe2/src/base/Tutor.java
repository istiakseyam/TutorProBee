
package base;


public class Tutor extends Person {
    private int contact;
    private String Area;
    private String Full_A;
    private String Email;
    private String crs_1;
    private String crs_2;
    Tutor(String Name, String Username,String Password, String Deg,int C_N,String Email, String c_1,String c_2,String Area,String Full_A)
    {
        super(Name, Username,Password,Deg);
        contact = C_N;
        this.Email = Email;
        crs_1  = c_1;
        crs_2 = c_2;
        this.Area = Area;
        this.Full_A = Full_A;
    }
    public void SetC(int C_N)
    {
        contact =  C_N;
    }
    public int getC()
    {
        return contact;
    }
    public void SetAd(String Area)
    {
           this.Area = Area;
    }
    public String getAd()
    {
        return Area;
    }
    public void SetEm(String Email)
    {
         this.Email = Email;
    }
    public String getEm()
    {
        return Email;
    }
    public void SetC1(String c_1)
    {
       crs_1  = c_1;
    }
    public String getC1()
    {
        return crs_1;
    }
    public void SetC2(String c_2)
    {
       crs_2 = c_2;
    }
    public String getC2()
    {
        return crs_2;
    }
    public void SetFAd(String Full_A)
    {
        this.Full_A = Full_A;
    }
    public String getFAd()
    {
        return Full_A;
    }
}
