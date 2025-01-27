public class A04_StringBufferAndBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Shubham");
        
        // Initial state of the StringBuffer
        System.out.println("\nInitial state: ");
        System.out.println("HashCode: " + sb.hashCode() + " | String: " + sb + " | Length: " + sb.length() + " | Capacity: " + sb.capacity());
        
        // After appending " Jaiswal"
        sb.append(" Jaiswal");
        System.out.println("\nAfter appending ' Jaiswal': ");
        System.out.println("HashCode: " + sb.hashCode() + " | String: " + sb + " | Length: " + sb.length() + " | Capacity: " + sb.capacity());
        
        // After appending a long string 
        sb.append("lllllllll");
        System.out.println("\nAfter appending long string of l: ");
        System.out.println("HashCode: " + sb.hashCode() + " | String: " + sb + " | Length: " + sb.length() + " | Capacity: " + sb.capacity());

        // StringBuffer is synchronized, meaning its methods are thread-safe and can be safely used in a multithreaded environment. On the other hand, StringBuilder is not synchronized, which makes it faster than StringBuffer, but it is not thread-safe and should not be used in a multithreaded environment

        // Double of 23 is 46, but StringBuffer typically increases the capacity slightly more (in this case, to 48) to optimize space and avoid reallocating too often.
        //📌 The capacity increase isn't always a strict doubling, and implementations may vary slightly depending on Java version or platform.
        //📌 This extra capacity allows StringBuffer to handle future appends more efficiently, as reallocating a larger buffer less often improves performance.
    }
}
