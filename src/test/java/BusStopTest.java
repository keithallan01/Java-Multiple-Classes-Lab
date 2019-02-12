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

    @Test
    public void addPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.getQueueCount());
    }

    @Test
    public void removePersonFromQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.getQueueCount());
        busStop.removePerson();
        assertEquals(0, busStop.getQueueCount());
    }

    
}
