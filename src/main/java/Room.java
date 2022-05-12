import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private int capacity;
    private ArrayList<Guest> guestList;

    public Room(RoomType roomType){
        this.roomType = roomType;
        this.capacity = roomType.getCapacity();
        this.guestList = new ArrayList<>();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }
}
