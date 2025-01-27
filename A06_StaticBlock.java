class Z_Student {

    int rollNo;
    String name;
    int marks;
    static String college = "RCOEM";  // Static field

    // Static Block (Executes only once when the class is loaded)
    static {
        System.out.println("\nLoading Class...");
        college = "RBU";  // Modifying the static variable
        System.out.println("Static Block Executed");
        staticMethod();  // Calling static method inside static block
    }

    // Constructor (Executes every time an object is created)
    public Z_Student(int rollNo, String name, int marks) {
        System.out.println("Constructor Called for: " + name);
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Static Method (Can be called without creating an object)
    static void staticMethod() {
        System.out.println("Inside Static Method");
    }

    // Instance Method (Uses all object data)
    void displayInfo() {
        System.out.println(rollNo + " | " + name + " | Marks: " + marks + " | College: " + college);
    }
}

public class A06_StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

        // Explicitly loading the Student class
        Class.forName("Z_Student");
        System.out.println("\nCollege Name After Static Block: " + Z_Student.college);

        // Creating objects
        System.out.println("\nCreating Student Objects:");
        Z_Student s1 = new Z_Student(1, "Shubham", 100);
        Z_Student s2 = new Z_Student(2, "Rahul", 90);
        Z_Student s3 = new Z_Student(3, "Amit", 80);

        // Displaying all three objects
        System.out.println("\nStudent Details:");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
