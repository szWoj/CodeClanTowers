import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> guestList;

    public Room(RoomType roomType){
        this.roomType = roomType;
        this.guestList = new ArrayList<>();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomCapacity() {
        return roomType.getCapacity();
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void addGuest(Guest guest){
        guestList.add(guest);
    }

    public void removeGuest(Guest guest){
        guestList.remove(guest);
    }

    public int getNumberOfGuests(){
        return guestList.size();
    }
}
