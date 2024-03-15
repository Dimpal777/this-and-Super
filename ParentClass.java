class ParentClass {
    private int parentNumber;

    // Parent class constructor
    public ParentClass(int parentNumber) {
        this.parentNumber = parentNumber;
    }

    public void displayParentNumber() {
        System.out.println("Parent Number: " + parentNumber);
    }
}

class SubClass extends ParentClass {
    private int childNumber;

    // Subclass constructor
    public SubClass(int parentNumber, int childNumber) {
        // Calling the constructor of the parent class using super()
        super(parentNumber);
        this.childNumber = childNumber;
    }

    public void displayChildNumber() {
        System.out.println("Child Number: " + childNumber);
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating an object of SubClass
        SubClass obj = new SubClass(10, 20);
        // Calling methods to display numbers
        obj.displayParentNumber();
        obj.displayChildNumber();
    }
}

