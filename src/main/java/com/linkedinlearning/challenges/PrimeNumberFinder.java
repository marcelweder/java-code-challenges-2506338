package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {

  public List<Integer> findInInterval(int start, int end) {
    List<Integer> result = new ArrayList<>();

    for (int i = start; i <= end; i++) {
      if (this.isPrime(i)) {
        result.add(i);
      }
    }

    return result;
  }

  private boolean checkPrime(int num) {
    var limit = Math.sqrt(num);

    for (int start = 3; start <= limit; start += 2) {
      if (0 == num % start) {
        return false;
      }
    }

    return num > 1;
  }

  private boolean isPrime(int num) {
    return num == 2 || num % 2 != 0 && this.checkPrime(num);
  }

}
