package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountReaderTest {

  @Test
  void testWordCharsCount() {
    WordCountReader wcReader = new WordCountReader();
    wcReader.readFile("src/test/resources/simple_words.txt");

    Assertions.assertEquals(69, wcReader.getWords());
    Assertions.assertEquals(445, wcReader.getCharacters());
    Assertions.assertEquals(377, wcReader.getCharactersExcludingSpaces());
  }

}
