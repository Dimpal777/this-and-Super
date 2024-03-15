
public class CallArgument {
    private int number;
    private String message;

    // Constructor with two parameters
    public CallArgument(int number, String message) {
        this.number = number;
        this.message = message;
    }

    // Constructor with one parameter, chaining to the two-parameter constructor
    public CallArgument(int number) {
        // Calling the two-parameter constructor with a default message using this()
        this(number, "Default message");
    }

    // Method to display instance fields
    public void displayFields() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Creating an object using the one-parameter constructor
        CallArgument obj1 = new CallArgument(42);
        obj1.displayFields();

        System.out.println();

        // Creating an object using the two-parameter constructor
        CallArgument obj2 = new CallArgument(10, "Custom message");
        obj2.displayFields();
    }
}

