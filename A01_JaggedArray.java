public class A01_JaggedArray {
    public static void main(String[] args) {

        int temp[] = new int[3];
        System.out.print("\nDefault values in 1D array: ");
        for (int ele : temp) {
            System.out.print(ele + " ");
        }
        System.out.println("\n");

        int nums[][] = new int[3][];  // Jagged array declaration

        // Assigning different-sized arrays to each row
        nums[0] = new int[4];
        nums[1] = new int[2];
        nums[2] = new int[3];

        System.out.println("Jagged Array Default Values:");
        for (int[] arr : nums) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println("\nLength of nums[1]: " + nums[1].length);

        String str = "abcde";
        System.out.println("Length of string '" + str + "': " + str.length());

        // 📌 'length' is used as a property for arrays (no parentheses needed).
        // 📌 'length()' is a method for strings (parentheses required).
    }
}
