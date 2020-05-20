package org.silnith.palindrome;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Test;


public class PalindromeTest {
    
    @Test
    public void testIsPalindromeEmoji() {
        assertTrue(new Palindrome().isPalindrome("\uD83D\uDE01\uD83D\uDE01\uD83D\uDE01", Locale.US));
    }
    
    @Test
    public void testIsPalindromeJapaneseMultiplicationTable() {
        assertTrue(new Palindrome().isPalindrome("九九", Locale.JAPAN));
    }
    
    @Test
    public void testIsPalindromeJapaneseNewspaper() {
        assertTrue(new Palindrome().isPalindrome("新聞紙", Locale.JAPAN));
    }
    
    @Test
    public void testIsPalindromeJapaneseTomato() {
        assertTrue(new Palindrome().isPalindrome("トマト", Locale.JAPAN));
    }
    
}
