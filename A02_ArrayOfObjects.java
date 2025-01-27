class Z_Student {
    int rollNo;
    String name;
    int marks;

    public Z_Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class A02_ArrayOfObjects {
    public static void main(String[] args) {
        Z_Student s1 = new Z_Student(1, "Shubham", 100);
        Z_Student s2 = new Z_Student(2, "Gokul", 80);
        Z_Student s3 = new Z_Student(3, "Chamunda", 90);

        // Creating an array of object references
        Z_Student students[] = new Z_Student[3]; // Only references are created, not objects

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println("\nAll Students Info:\n");

        for (Z_Student s : students) {
            System.out.println("Student Info:");
            System.out.println("Roll No: " + s.rollNo);
            System.out.println("Name: " + s.name);
            System.out.println("Marks: " + s.marks);
            System.out.println("--------------------");
        }
    }
}
