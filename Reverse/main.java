package Reverse;

public class main {

    static String reverseString(String s) {
        char[] charArray = s.toCharArray(); // Convert string to character array
        int left = 0; // Start index
        int right = charArray.length - 1; // End index

        // Swap characters from both ends moving towards the center
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray); // Convert character array back to string
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
