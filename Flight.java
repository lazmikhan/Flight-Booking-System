import java.util.*;

import javax.swing.plaf.synth.SynthStyle;
public class Flight {
    private double price;
    private String id, from ,to;
    private int numAdults, numKids;
    private  ArrayList<Passenger>  passergerList;

    Flight(String id, double price,String to,String from )
    {
this.id=id;
this.from= from;
this.to=to;
this.price=price;
this.numAdults=0;
this.numKids=0;
passergerList= new ArrayList<Passenger>();

    }
    String getFlightId()
    {
        return id;
    }
    void addPassenger(Passenger p)
    {
passergerList.add(p);
if(p.age>12)
{
    numAdults++;
}
else{
    
    numKids++;
}
//add passenger age loop
    }

    void displayInfoFlight()
    {
        System.out.println("Flight ID:"+ id+ "\n"+ "From:"+ from+"\n"+"To:"+to+"\n");
    }

    void displayInfoPassengers()
    {
        
        if(passergerList.isEmpty())
        {
System.out.println(" No passengers! \n");
        }
else{
    System.out.println("Number of Passengers:"+ passergerList.size()+"\n" );
        System.out.println("Number of Kids:"+ numKids+"\n");
        System.out.println("Number of Adults:"+ numAdults+"\n");
        System.out.println("Price:"+price+"\n");
        System.out.println("No \t"+ "Name \t"+ "Age \t"+"Parent's Name \t"+"Ticket Price (RM) \n");
      
}
        //later


    }

   public double displayFlightPass(int i)
    {
        
           if(passergerList.get(i).age<2)
           {
             double pricePass= price- (passergerList.get(i).calcDisc()* price/100);
             return pricePass;
           }
           else if(passergerList.get(i).age>60)
           {
            double pricePass= price- (passergerList.get(i).calcDisc()* price/100);
           return pricePass;
           }
           else 
           {
            return price;
           }


        
    }


}
