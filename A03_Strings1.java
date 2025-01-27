public class A03_Strings1 {
    public static void main(String[] args) {

        //📌 Whenever we modify a string, a new object is created with the updated value, and the reference variable now points to the new object.
        String name = "Shubham";
        System.out.println("\nOriginal String: " + name + "         | Identity Hash Code: " + System.identityHashCode(name));

        name = name + " Jaiswal"; // Updating the variable
        System.out.println("Updated String: " + name + "  | Identity Hash Code: " + System.identityHashCode(name));
        // Now, the "Shubham" object in the string constant pool becomes eligible for garbage collection.
        // 📌 Strings in Java are immutable.

        //📌 When creating a new String object, the JVM first checks if an object with the same value already exists in the String Constant Pool (a part of heap memory where all string literals are stored). If it exists, the reference variable is assigned to that object instead of creating a new one.
        String s1 = "shubham";
        String s2 = "shubham";
        System.out.println("\nString Constant Pool Behavior:");
        System.out.println("s1: " + s1 + "  | Identity Hash Code: " + System.identityHashCode(s1));
        System.out.println("s2: " + s2 + "  | Identity Hash Code: " + System.identityHashCode(s2));
        // Both reference variables (s1 and s2) point to the same object in the String Constant Pool.

        // Demonstrating the difference between == and .equals()
        String s3 = new String("shubham"); // Creates a new object in heap memory.
        String s4 = "shubham"; // Points to the existing object in the String Constant Pool.

        // Printing identity hash codes for s3 and s4
        System.out.println("\ns3: " + s3 + "  | Identity Hash Code: " + System.identityHashCode(s3));
        System.out.println("s4: " + s4 + "  | Identity Hash Code: " + System.identityHashCode(s4));

        //📌 == operator: Compares references (memory locations). For strings, it checks if both references point to the same object.
        //📌 .equals() method: Compares the content of the strings. It checks if the values of the two strings are identical, regardless of their memory locations.
        System.out.println("\nComparing Strings:");
        System.out.println("s1 == s2 -> " + (s1 == s2) + "       | Same object in pool");
        System.out.println("s1 == s3 -> " + (s1 == s3) + "      | Different objects in memory");
        System.out.println("s1.equals(s3) -> " + s1.equals(s3) + "  | Same content");

        System.out.println("\nLength of 'shubham': " + s1.length());
    }
}
