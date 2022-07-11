public class Adults extends Passenger{
    Adults(String name, int age)
    {
        super(name, age);
    }
    public double calcDisc()
    {
        if(age>60)
        {
            return DISC_SENIOR;
        }
        else 
        {
            return 0;
        }
    }

      void displayDetails()
    {
 //System.out.println("Passenger Name:"+ name+"\n"+ "Passenger age:"+age+"");
    }

    
}
