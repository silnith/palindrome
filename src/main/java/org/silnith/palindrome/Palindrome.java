package org.silnith.palindrome;

import java.text.BreakIterator;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

public class Palindrome {
    
    public boolean isPalindrome(final CharSequence text, final Locale locale) {
        return isPalindrome(breakIntoCharacters(text, locale));
    }
    
    public boolean isPalindrome(final List<CharSequence> characters) {
        final ListIterator<CharSequence> forward = characters.listIterator();
        final ListIterator<CharSequence> backward = characters.listIterator();
        
        while (forward.nextIndex() < backward.previousIndex()) {
            final CharSequence next = forward.next();
            final CharSequence prev = backward.previous();
            
            if (next.equals(prev)) {
                continue;
            } else {
                return false;
            }
        }
        
        return true;
    }
    
    public List<CharSequence> breakIntoCharacters(final CharSequence text, final Locale locale) {
        final String normalized = Normalizer.normalize(text, Normalizer.Form.NFC);
        
        final BreakIterator characterBreaker = BreakIterator.getCharacterInstance(locale);
        characterBreaker.setText(normalized);
        
        final List<CharSequence> list = new ArrayList<CharSequence>();
        int start = characterBreaker.first();
        int end = characterBreaker.next();
        while (end != BreakIterator.DONE) {
            final CharSequence subSequence = text.subSequence(start, end);
            list.add(subSequence);
            start = end;
            end = characterBreaker.next();
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ;
    }
    
}
