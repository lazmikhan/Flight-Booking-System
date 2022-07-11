import java.util.*;
public class FlightTest {
    public static void main(String []args)
    {
int index=0;
int addCount=0;
        Flight [] flightObj;
        flightObj= new Flight[5];
       
        ArrayList<Passenger> plist=new ArrayList<Passenger>();
    
     
      int choice;
      Scanner scanner = new Scanner(System.in);
      //Creating infinite while loop
      while(true) {
        menu();
          //Creating menu
     
          choice = scanner.nextInt();

          //Creating switch case branch
          switch (choice) {

              //First case for finding the addition
              case 1:
              Scanner flightInp= new Scanner(System.in);
              System.out.println("Enter Flight ID:");
               String FlightID=flightInp.nextLine();
              System.out.println("Enter Ticket Price:");
              double Price= flightInp.nextDouble();
              flightInp.nextLine();
              System.out.println("From:" );
              
               String From= flightInp.nextLine();
              System.out.println("To:");
              String To= flightInp.nextLine();
  
              
           flightObj[addCount] = new Flight(FlightID, Price, From, To);
         
           addCount++;
           
  
  
                  break;

              //Second case for finding the difference
              case 2:
              
              System.out.print("Flight List:\n");
              for(int i=0; i<flightObj.length;i++)
              {
                if(flightObj[i]!=null )
                { 
                   System.out.println( (i+1)+ " |" +flightObj[i].getFlightId());
                }
              }

              Scanner passengerInp = new Scanner(System.in);
              System.out.print("Select Flight:");
              int selectedFlight=passengerInp.nextInt();
              passengerInp.nextLine();
          
              String pChoice="Y";
              while(pChoice.equals("Y")){
               
              System.out.println("Enter the passenger name:");
              String PassengerName= passengerInp.nextLine();
              
              System.out.println("Enter the passenger age:");
              int PassengerAge= passengerInp.nextInt();
             passengerInp.nextLine();
              if(PassengerAge<=12)
              { 
                System.out.println("Enter the parent's name:");
                String PassengerParentName= passengerInp.nextLine();
              
                Passenger p = new Kids(PassengerName, PassengerParentName, PassengerAge);
                plist.add(p );
                flightObj[selectedFlight-1].addPassenger(plist.get(index));
                
                
                index++;
              }
              else 
              {
                 
                Passenger pA = new Adults(PassengerName,  PassengerAge);
                plist.add(pA );
                flightObj[selectedFlight-1].addPassenger(plist.get(index));
                index++;
              }
             
              System.out.println("Do you want to continue(type Y): ");
               pChoice=passengerInp.nextLine();

            }

                  break;

              //Third case for finding the product
              case 3:
              for(int i=0; i<flightObj.length;i++)
              {
                if(flightObj[i]!=null )
                {
                    flightObj[i].displayInfoFlight();
                }
              }
                  break;

              //Fourth case for finding the quotient
              case 4:
                int  a=0;
while (flightObj[a]!=null)
{
    a++;
}

              System.out.println("Number of Flights:"+a+"\n");
              for(int i=0; i<flightObj.length;i++)
              { 
                if(flightObj[i]!=null )
                { double totalPrice=0;
                    flightObj[i].displayInfoFlight();
                  
                    flightObj[i].displayInfoPassengers();
                   
                    for(int j=0;j<plist.size();j++)
                    { System.out.print((j+1)+"\t");
                      plist.get(j).displayDetails()  ;
                    double fprice=  flightObj[i].displayFlightPass(j);
                     System.out.println(fprice);
                      totalPrice=totalPrice+fprice;


                    }
                    System.out.println("\n  Total Price:RM"+totalPrice );
              }

                }
               


                  break;

              //Fifth case to quit the program
              case 5:
              System.out.print("Thank you");
                  System.exit(0);

              //default case to display the message invalid choice made by the user
              default:
                  System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");
          }
      }
    }

    public static void menu()
    {
        System.out.println("1)Add Flight");
        System.out.println("2) Add Passenger");
        System.out.println("3) Display Flights");
        System.out.println("4) Display Passengers");
        System.out.println("5) Exit");
        

    }
}
