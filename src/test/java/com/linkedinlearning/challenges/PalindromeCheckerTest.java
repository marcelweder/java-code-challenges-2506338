package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {

  @Test
  void testPaplindrome() {
    PalindromeChecker checker = new PalindromeChecker();

    Assertions.assertTrue(checker.isPalindrome("Radar"));
    Assertions.assertTrue(checker.isPalindrome("Otto"));
    Assertions.assertTrue(checker.isPalindrome("Erika feuert nur untreue Fakire."));

    Assertions.assertFalse(checker.isPalindrome("Waalkes"));
    Assertions.assertFalse(checker.isPalindrome("Fakir feuert nur untreue Erika."));
  }

}
