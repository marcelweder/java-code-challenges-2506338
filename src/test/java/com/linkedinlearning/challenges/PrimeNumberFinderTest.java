package com.linkedinlearning.challenges;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumberFinderTest {

  @Test
  void testPrimeNumberFinder() {

    var expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);

    var primeNumberFinder = new PrimeNumberFinder();
    var result = primeNumberFinder.findInInterval(1, 20);

    Assertions.assertEquals(expected, result);
  }

}
