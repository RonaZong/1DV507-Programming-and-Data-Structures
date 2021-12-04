package Lecture7.Example1;

public class Palindrome {
    public static void main(String[] args) {
        char[] word = "madam".toCharArray();
        boolean a = isPalindrome(word, 0, 4);
        System.out.println(a);
        // isPalindrome(word, 0, word.length - 1)

        String anotherWord = "madam";
        boolean b = isPalindrome(anotherWord);
        System.out.println(b);

    }

    private static boolean isPalindrome(char[] str, int p, int q) {
        if (q <= p) {
            return true;
        }
        else if (str[p] != str[q]) {
            return false;
        }
        else
            return isPalindrome(str, p + 1, q - 1);
    }

    /**
     * Helps to get stared
     * @param word
     * @return
     */
    private static boolean isPalindrome(String word) {
        return isPalindrome(word.toCharArray(), 0, word.length() - 1);
    }
}
