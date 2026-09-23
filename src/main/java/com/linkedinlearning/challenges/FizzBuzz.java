package com.linkedinlearning.challenges;

import java.util.ArrayList;

public class FizzBuzz {

  private int start;
  private int end;

  public FizzBuzz(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public String renderFizzBuzzUntil() {

    ArrayList<String> result = new ArrayList<>();

    for (int count = this.start; count <= this.end; count++) {
      if (this.isFizzBuzz(count)) {
        result.add("FizzBuzz");
      } else if (this.isFizz(count)) {
        result.add("Fizz");
      } else if (this.isBuzz(count)) {
        result.add("Buzz");
      } else {
        result.add(String.valueOf(count));
      }
    }

    return String.join(System.lineSeparator(), result);
  }

  private Boolean isFizz(int currentValue) {
    return currentValue % 3 == 0;
  }

  private Boolean isBuzz(int currentValue) {
    return currentValue % 5 == 0;
  }

  private Boolean isFizzBuzz(int currentValue) {
    return this.isFizz(currentValue) && this.isBuzz(currentValue);
  }
}
