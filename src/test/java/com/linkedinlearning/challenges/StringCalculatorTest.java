package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

  @Test
  void testStringCalculator() {
    Assertions.assertEquals(0, StringCalculator.add(""));
    Assertions.assertEquals(11, StringCalculator.add("11"));
    Assertions.assertEquals(53, StringCalculator.add("1,9,22,11,9,1"));
  }

}
