public class Main {
    public static void main(String[] args) {

        // create room objects
        Room room1 = new Room(101, "Single", 50.0);
        Room room2 = new Room(102, "Double", 80.0);

        // create guest objects
        Guest guest1 = new Guest("Ivan Ivanov", "AB123456");
        Guest guest2 = new Guest("Anna Petrova", "CD789012");

        // create booking objects
        Booking booking1 = new Booking(guest1, room1, 3);
        Booking booking2 = new Booking(guest2, room2, 3);

        // output objects to console
        System.out.println(booking1);
        System.out.println(booking2);

        // compare multiple objects
        if (booking1.calculateTotalPrice() > booking2.calculateTotalPrice()) {
            System.out.println("Booking 1 is more expensive");
        } else if (booking1.calculateTotalPrice() < booking2.calculateTotalPrice()) {
            System.out.println("Booking 2 is more expensive");
        } else {
            System.out.println("Both bookings cost the same");
        }
    }
}
