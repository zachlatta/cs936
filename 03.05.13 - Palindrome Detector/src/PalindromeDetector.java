/**
 * Used to detect if a String is a palindrome.
 *
 * @author Zachary Latta
 */
public class PalindromeDetector
{
    /**
     * Detects if a String is a palindrome.
     *
     * @param string The String to test.
     * @return Whether the string is a palindrome.
     */
    public static boolean detect(String string)
    {
        if (string.length() == 0 || string.length() == 1)
        {
            return true;
        }

        if(string.charAt(0) == string.charAt(string.length() - 1))
        {
            return detect(string.substring(1, string.length() - 1));
        }

        return false;
    }
}
