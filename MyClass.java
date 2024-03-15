public class MyClass {
    private int number;
    private static String message = "Hello, world!";

    public MyClass(int number) {
        this.number = number;
    }

    public void printFields() {
        System.out.println("Number: " + this.number);
        
        System.out.println("Message: " + MyClass.message);
    }

    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass obj = new MyClass(42);
        obj.printFields();
    }
}
