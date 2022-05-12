import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;

    public Bedroom(RoomType roomType, int roomNumber){
        super(roomType);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

}
