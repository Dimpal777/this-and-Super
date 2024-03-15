public class Constructorr {
    private int number;
    private String message;

    // Constructor with two parameters
    public Constructorr(int number, String message) {
        this.number = number;
        this.message = message;
    }

    // Constructor with one parameter, chaining to the two-parameter constructor
    public Constructorr(int number) {
        // Calling the two-parameter constructor using this()
        this(number, "Default message");
    }

    // Method to display instance fields
    public void displayFields() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Creating an object using the one-parameter constructor
        Constructorr obj1 = new Constructorr(42);
        obj1.displayFields();

        System.out.println();

        // Creating an object using the two-parameter constructor
        Constructorr obj2 = new Constructorr(10, "Custom message");
        obj2.displayFields();
    }
}
