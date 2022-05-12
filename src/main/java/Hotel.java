import java.util.ArrayList;

public class Hotel {

    private ArrayList bedrooms;
    private ArrayList conferenceRooms;

    public Hotel(ArrayList bedrooms, ArrayList conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public void checkInGuest(Guest guest, RoomType desiredRoomType){
//        boolean checkedIn = false;
//        while(!checkedIn){
//
//        }
//        Bedroom chosenBedroom = bedrooms.stream().findFirst()
        for(int i = 0; i < bedrooms.size(); i++){
            if(bedrooms.get(i).roomType == desiredRoomType){
                bedrooms.get(i).addGuest(guest);
                break;
            }
        }
    }

    public void checkOutGuest(Guest guest){

    }
}
