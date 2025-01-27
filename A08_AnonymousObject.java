class Z {
    Z() {
        System.out.println("\nNew Object of Z is Created");
    }

    public void showZ() {
        System.out.println("In showZ method");
    }
}

public class A08_AnonymousObject {
    public static void main(String[] args) {
        // Reference variable declaration
        Z obj; // On this line, no object is created, only a reference variable 'obj' is created inside the stack.

        // Object creation
        obj = new Z(); // On this line, the object is created using the 'new' keyword and assigned to the reference variable 'obj'.
        
        // Calling method using the object
        obj.showZ(); // We use the reference variable 'obj' to access the method 'showZ()' of the object.

        // Demonstrating anonymous object creation
        new Z().showZ(); // Here, an anonymous object is created and immediately used to call 'showZ()', then discarded.

        new Z().showZ(); // Another new object is created, and its method is called immediately.
    }
}

