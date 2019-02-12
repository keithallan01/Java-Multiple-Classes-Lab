import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;

    @Before
    public void before(){
        bus = new Bus("Dalgety Bay");
    }

    @Test
    public void hasDestination(){
        assertEquals("Dalgety Bay", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, bus.getCapacity());
    }

    @Test
    public void startsWithNoPassengers(){
        assertEquals(0, bus.passengerCount());
    }
}
