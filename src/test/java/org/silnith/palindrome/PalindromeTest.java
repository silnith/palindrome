package org.silnith.palindrome;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Test;


public class PalindromeTest {
    
    @Test
    public void testIsPalindromeEmoji() {
        assertTrue(new Palindrome().isPalindrome("\uD83D\uDE01\uD83D\uDE01\uD83D\uDE01", Locale.US));
    }
    
}
