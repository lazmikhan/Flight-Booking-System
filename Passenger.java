public abstract class Passenger implements DiscConsiderable {
    protected String name;
    protected int age;
    Passenger(String name, int age)
    {
this.age=age;
this.name=name;
    }

    abstract void  displayDetails();
}
