
class MethodConstructor {
    private int number;

    // Constructor
    public MethodConstructor(int number) {
        this.number = number;
    }

    // Method to create and return a new instance
    private MethodConstructor createNewInstance(int newNumber) {
        // Calling constructor within a method
        return new MethodConstructor(newNumber);
    }

    // Method to demonstrate calling a constructor within another method
    public void changeNumber(int newNumber) {
        // Calling createNewInstance method to create a new object
        MethodConstructor newObj = createNewInstance(newNumber);
        // Updating number field of the current object using the new object
        this.number = newObj.getNumber();
    }

    // Getter method for the number field
    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        MethodConstructor obj = new MethodConstructor(10);
        System.out.println("Original number: " + obj.getNumber());

        // Calling method to change the number
        obj.changeNumber(20);
        System.out.println("New number: " + obj.getNumber());
    }
}

