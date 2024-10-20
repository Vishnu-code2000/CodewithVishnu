package Reverse.palindrome;

public class main {
    public static boolean isPalindrome(int num) {
        String s = Integer.toString(num);
        return isPalindrome1(s);
    }

    public static boolean isPalindrome1(String s) {
        s = s.toLowerCase();

        int left = 0;

        int right = s.length() - 1;
        while (left < right) {
            while (left < right && Character.isLetterOrDigit(left)) {
                left++;
            }
            while (left < right && Character.isLetterOrDigit(right)) {
                right--;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args) {
        int num = 1231;
        System.out.println(isPalindrome(num));

    }

}
