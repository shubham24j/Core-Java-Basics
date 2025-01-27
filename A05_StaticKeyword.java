class Z_Student {
    int rollNo;
    String name;
    int marks;
    static String college = "RCOEM";  // Static field

    public Z_Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public static void staticMethod() {
        System.out.println("Inside static method");
    }

    public void nonStaticMethod() {
        System.out.println("Inside non-static method");
    }

    public static void staticMethodWithVariables(Z_Student obj) {
        System.out.println("Inside static method with non-static variables");
        System.out.println("Name: " + obj.name);
    }
}

public class A05_StaticKeyword {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Z_Student s1 = new Z_Student(1, "Shubham", 100);
        Z_Student s2 = new Z_Student(2, "Rohan", 80);
        Z_Student s3 = new Z_Student(3, "Amit", 90);

        Z_Student[] Z_Students = {s1, s2, s3};

        System.out.println("\nInitial Student Details:");
        for (Z_Student s : Z_Students) {
            System.out.println("Roll No: " + s.rollNo + " | Name: " + s.name + " | Marks: " + s.marks + " | College: " + s.college);
        }

        System.out.println("\nUpdating College Name to 'RBU'...");
        s1.college = "RBU";  // Changing static variable
        // Static variable should be called using class name

        System.out.println("\nStudent Details After Changing College:");
        for (Z_Student s : Z_Students) {
            System.out.println("Roll No: " + s.rollNo + " | Name: " + s.name + " | Marks: " + s.marks + " | College: " + s.college);
        }

        System.out.println("\nCalling Static Method:");
        Z_Student.staticMethod();

        System.out.println("\nUsing Static Method to Access Non-Static Variables:");
        Z_Student.staticMethodWithVariables(s1);
        Z_Student.staticMethodWithVariables(s2);
    }
}
