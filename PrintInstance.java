
class ParentClass {
    // Fields of the parent class
    int parentField1 = 10;
    String parentField2 = "Parent";

    void printParentFields() {
        System.out.println("Parent field 1: " + parentField1);
        System.out.println("Parent field 2: " + parentField2);
    }
}

class SubClass extends ParentClass {
    // Fields of the subclass
    int childField1 = 20;
    String childField2 = "Child";

    void printFields() {
        System.out.println("Child field 1: " + childField1);
        System.out.println("Child field 2: " + childField2);
        
        System.out.println("Parent field 1 (via super): " + super.parentField1);
        System.out.println("Parent field 2 (via super): " + super.parentField2);
    }
}

public class PrintInstance {
    public static void main(String[] args) {
        // Creating an object of the subclass
        SubClass obj = new SubClass();
        
        // Calling method to print fields
        obj.printFields();
    }
}

