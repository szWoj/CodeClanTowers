import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList bedrooms, ArrayList conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public void checkInGuestToBedroom(Guest guest, RoomType desiredRoomType){
//        const listType = desiredRoomType === MEETING ? conferenceRooms : bedrooms;

        for(int i = 0; i < bedrooms.size(); i++){
            if(bedrooms.get(i).getRoomType() == desiredRoomType && !bedrooms.get(i).isRoomFull()){
                bedrooms.get(i).addGuest(guest);
                break;
            }

        }
    }


    public void checkOutGuestFromBedroom(Guest guest){
        for(int i = 0; i < bedrooms.size(); i++){
            if(bedrooms.get(i).findGuest(guest)){
                bedrooms.get(i).removeGuest(guest);
            }
        }
    }

    public void checkInGuestToConference(Guest guest){
//        const listType = desiredRoomType === MEETING ? conferenceRooms : bedrooms;

        for(int i = 0; i < conferenceRooms.size(); i++){
            if(!conferenceRooms.get(i).isRoomFull()){
                conferenceRooms.get(i).addGuest(guest);
                break;
            }

        }
    }


    public void checkOutGuestFromConference(Guest guest){
        for(int i = 0; i < conferenceRooms.size(); i++){
            if(conferenceRooms.get(i).findGuest(guest)){
                conferenceRooms.get(i).removeGuest(guest);
            }
        }
    }

//    public Booking bookRoom(Bedroom bedroom, int numOfNights){
//
//        return new Booking(bedroom, numOfNights);
//    }
}
