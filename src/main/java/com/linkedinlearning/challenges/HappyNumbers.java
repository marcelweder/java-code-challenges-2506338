package com.linkedinlearning.challenges;

import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

  public Boolean isHappy(int num) {
    Set<Integer> seen = new HashSet<>();

    int i = num;
    while (i != 1 && !seen.contains(i)) {
      seen.add(i);
      i = this.sumOfSquares(i);
    }

    return i == 1;
  }

  private int sumOfSquares(int num) {
    int sum = 0;

    while (num > 0) {
      int digit = num % 10;
      sum += digit * digit;
      num /= 10;
    }

    return sum;
  }

}
