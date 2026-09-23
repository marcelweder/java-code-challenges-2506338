package com.linkedinlearning.challenges;

import java.util.List;

public class ArithmeticMean {

  private List<Integer> numbers;

  public ArithmeticMean(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public int countNumbers() {
    return this.numbers.size();
  }

  public int sumNumbers() {
    int result = 0;

    for (int item : this.numbers) {
      result += item;
    }

    return result;
  }

  public float calculateQuotient() {
    return (float) this.sumNumbers() / this.countNumbers();
  }

}
