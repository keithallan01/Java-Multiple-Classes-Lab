import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Bus bus;
    Person person;


    @Before
    public void before(){
        busStop = new BusStop("Main Street");
        bus = new Bus("Dalgety Bay");
        person = new Person();
    }

    @Test
    public void hasName(){
        assertEquals("Main Street", busStop.getName());
    }

    @Test
    public void queueInitiallyEmpty(){
        assertEquals(0, busStop.getQueueCount());
    }
}
