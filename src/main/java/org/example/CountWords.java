package org.example;

// JaCoCo ->
public class CountWords {
    /**
     * Given a string, count the number of words ending in 'r' or 's' --
     * so the 'r' in "car" and the 's' in "cats" count, but not the 'r' in "rain" (not case sensitive).
     * We'll say that a 'r' or 's' is at the end of a word if there is not an
     * alphabetic letter immediately following it.
     * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * @param str
     * @return
     */
    public int count(String str) {
        int words = 0;
        char last = ' ';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c) && (last == 's' || last == 'r')) {
                words++;
            }
            last = Character.toLowerCase(c);
        }
        if (last == 'r' || last == 's')
            words++;

        return words;
    }
}
