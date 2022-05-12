import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 23);
        guest = new Guest("Jim Smith");
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getRoomCapacity());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }
}
