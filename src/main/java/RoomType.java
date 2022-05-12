public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    SUITE(4),
    MEETING(20);

    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
