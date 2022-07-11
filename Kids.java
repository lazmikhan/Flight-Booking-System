public class Kids extends Passenger {
  String parentName;
  
    
    Kids(String name , String parentName, int age )
    {
        super(name,age);
        this.parentName=parentName;
    }
    public double calcDisc()
    {
        if(age<=2)
        {  
            return DISC_KIDS;
        }
        else 
        {
            return 0;
        }
    }
    void displayDetails()
    {
        System.out.print( name+"\t"+age+"\t"+ parentName+"\t");
    }
}
