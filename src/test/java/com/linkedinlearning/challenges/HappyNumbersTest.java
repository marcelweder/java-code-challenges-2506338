package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumbersTest {

  @Test
  void testHappyNumbers() {

    var happyNumber = new HappyNumbers();

    /*
     * for (int i = 1; i < 100; i++) {
     * if (happyNumber.isHappy(i)) {
     * System.out.println(i + " - " + happyNumber.isHappy(i));
     * }
     * }
     */

    Assertions.assertTrue(happyNumber.isHappy(1));
    Assertions.assertTrue(happyNumber.isHappy(7));
    Assertions.assertTrue(happyNumber.isHappy(10));
    Assertions.assertTrue(happyNumber.isHappy(13));
    Assertions.assertTrue(happyNumber.isHappy(19));
    Assertions.assertTrue(happyNumber.isHappy(23));
    Assertions.assertTrue(happyNumber.isHappy(28));
    Assertions.assertTrue(happyNumber.isHappy(44));
    Assertions.assertTrue(happyNumber.isHappy(97));

    Assertions.assertFalse(happyNumber.isHappy(2));
    Assertions.assertFalse(happyNumber.isHappy(33));
    Assertions.assertFalse(happyNumber.isHappy(80));
  }

}
