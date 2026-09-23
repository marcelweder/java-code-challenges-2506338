package com.linkedinlearning.challenges;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticMeanTest {

  @Test
  void testCountNumbers() {

    var expected = 4;
    var numbers = Arrays.asList(1, 2, 3, 4);

    var arithmeticMean = new ArithmeticMean(numbers);
    var result = arithmeticMean.countNumbers();

    Assertions.assertEquals(expected, result);
  }

  @Test
  void testSumNumbers() {

    var expected = 10;
    var numbers = Arrays.asList(1, 2, 3, 4);

    var arithmeticMean = new ArithmeticMean(numbers);
    var result = arithmeticMean.sumNumbers();

    Assertions.assertEquals(expected, result);
  }

  @Test
  void testCalculateQuotient() {

    var expected = 2.5;
    var numbers = Arrays.asList(1, 2, 3, 4);

    var arithmeticMean = new ArithmeticMean(numbers);
    var result = arithmeticMean.calculateQuotient();

    Assertions.assertEquals(expected, result);
  }

}
