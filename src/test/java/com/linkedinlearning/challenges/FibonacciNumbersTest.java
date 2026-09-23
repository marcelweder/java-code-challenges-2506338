package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciNumbersTest {

  @Test
  void testFibonacciNumbers() {

    var expected = 144;
    var fibonacciNumbers = new FibonacciNumbers();
    var result = fibonacciNumbers.fibonacci(12);

    Assertions.assertEquals(expected, result);
  }

}
