import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before(){
        bus = new Bus("Dalgety Bay");
        person = new Person();
    }

    @Test
    public void hasDestination(){
        assertEquals("Dalgety Bay", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bus.getCapacity());
    }

    @Test
    public void startsWithNoPassengers(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canNotAddPassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.passengerCount());
    }
}
