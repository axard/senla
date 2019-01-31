package palindrome;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testRussianPalindromeWord() {
        assertEquals(true, App.isPalindrome("кок"));
    }

    @Test
    public void testRussianNotPalindromeWord() {
        assertEquals(false, App.isPalindrome("собака"));
    }

    @Test
    public void testEnglishPalindromeWord() {
        assertEquals(true, App.isPalindrome("madam"));
    }

    @Test
    public void testEnglishNotPalindromeWord() {
        assertEquals(false, App.isPalindrome("cat"));
    }

}
