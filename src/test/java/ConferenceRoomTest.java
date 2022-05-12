import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class ConferenceRoomTest {

        ConferenceRoom conferenceRoom;
        Guest guest;

        @Before
        public void before(){
            conferenceRoom = new ConferenceRoom(RoomType.SINGLE, "ImportantMeetingRoom");
            guest = new Guest("Jim Smith");
        }

        @Test
        public void hasCapacity(){
            assertEquals(1, conferenceRoom.getRoomCapacity());
        }

        @Test
        public void canAddGuest(){
            conferenceRoom.addGuest(guest);
            assertEquals(1, conferenceRoom.getNumberOfGuests());
        }
    }

