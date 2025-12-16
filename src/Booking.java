public class Booking {
    private Guest guest;
    private Room room;
    private int nights;

    // Constructor
    public Booking(Guest guest, Room room, int nights) {
        this.guest = guest;
        this.room = room;
        this.nights = nights;
    }

    // Getters and Setters
    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    // Method
    public double calculateTotalPrice() {
        return nights * room.getPricePerNight();
    }

    public String toString() {
        return "Booking [guest=" + guest +
                ", room=" + room +
                ", nights=" + nights +
                ", total price=" + calculateTotalPrice() + "]";
    }
}
