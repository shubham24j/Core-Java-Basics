class Z_Person {
    private String name;
    private int age;

    // Parameterized Constructor
    public Z_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Z_Person(Z_Person another) {
        this(another.name, another.age); // Copy values from another object
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class A07_CopyConstructor {
    public static void main(String[] args) {
        // Creating the first object
        Z_Person p1 = new Z_Person("Shubham", 20);
        System.out.println("\nOriginal Object:");
        System.out.println("P1: " + p1.getName() + " | Age: " + p1.getAge());

        // Creating a copy using the Copy Constructor
        Z_Person p2 = new Z_Person(p1);
        System.out.println("\nCopied Object:");
        System.out.println("P2 (Copy of P1): " + p2.getName() + " | Age: " + p2.getAge());
    }
}
