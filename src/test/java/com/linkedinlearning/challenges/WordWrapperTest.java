package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordWrapperTest {

  @Test
  void testWordWrapperShort() {
    WordWrapper wordWrapper = new WordWrapper(50);

    Assertions.assertEquals("Test", wordWrapper.wrap("Test"));
  }

  @Test
  void testWordWrapperLimitedBy6() {
    WordWrapper wordWrapper = new WordWrapper(6);

    var expected = """
        Lorem
         ipsu
        m dol
        or si
        t ame
        t, co
        nsect
        etur\s
        adipi
        scing
         elit
        .""";
    var testText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

    Assertions.assertEquals(expected, wordWrapper.wrap(testText));
  }

  @Test
  void testWordWrapperLimitedBy13() {
    WordWrapper wordWrapper = new WordWrapper(13);

    var expected = """
        Lorem ipsum\s
        dolor sit am
        et, consecte
        tur adipisci
        ng elit.""";
    var testText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

    Assertions.assertEquals(expected, wordWrapper.wrap(testText));
  }

}
