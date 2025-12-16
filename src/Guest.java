public class Guest {
    private String name;
    private String passportNumber;

    // Constructor
    public Guest(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    // Method
    public String toString() {
        return "Guest [name=" + name +
                ", passport=" + passportNumber + "]";
    }
}
