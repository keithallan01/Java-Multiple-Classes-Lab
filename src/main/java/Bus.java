import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination){
        this.destination = destination;
        this.capacity = 2;
        this.passengers = new ArrayList<>();
    }

    public String getDestination(){
        return this.destination;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (passengerCount() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }

    public void pickUpPassenger(BusStop busStop){
        Person person = busStop.removePerson();
        this.passengers.add(person);
    }

}
