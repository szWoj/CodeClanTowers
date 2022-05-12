import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;

    @Before
    public void before(){
        bedroom1 = new Bedroom(RoomType.SINGLE, 23);
        bedroom2 = new Bedroom(RoomType.DOUBLE, 29);
        bedrooms = new ArrayList<>();
        conferenceRoom1 = new ConferenceRoom(RoomType.MEETING, "Conference Room Name");
        conferenceRoom2 = new ConferenceRoom(RoomType.MEETING, "Conference Room Name2");
        conferenceRooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);

        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.checkInGuestToBedroom(guest, RoomType.SINGLE);

        assertEquals(1, bedroom1.getNumberOfGuests());

    }

    @Test
    public void canCheckOutFromBedroom(){
        hotel.checkInGuestToBedroom(guest, RoomType.SINGLE);
        hotel.checkOutGuestFromBedroom(guest);
        assertEquals(0, bedroom1.getNumberOfGuests());
    }

    @Test
    public void canCheckInGuestToConference(){
        hotel.checkInGuestToConference(guest);

        assertEquals(1, conferenceRoom1.getNumberOfGuests());

    }

    @Test
    public void canCheckOutFromConference(){
        hotel.checkInGuestToConference(guest);
        hotel.checkOutGuestFromConference(guest);
        assertEquals(0, conferenceRoom1.getNumberOfGuests());
    }
}
