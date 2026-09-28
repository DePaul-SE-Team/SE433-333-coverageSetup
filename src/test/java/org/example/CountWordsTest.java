package org.example;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CountWordsTest {
    @Test
    public void test1(){
        CountWords countWords = new CountWords();
        assertThat(countWords.count("dogs cats")).isEqualTo(2);
    }
    @Test
    public void test2(){
        CountWords countWords = new CountWords();
        assertThat(countWords.count("dog cat")).isEqualTo(0);
    }
}