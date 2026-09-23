package com.linkedinlearning.challenges;

public class StringCalculator {

  static public int add(String numbers) {
    if (numbers.isEmpty()) {
      return 0;
    }

    String[] items = numbers.split(",");
    int sum = 0;
    for (String number : items) {
      sum += Integer.parseInt(number);
    }
    return sum;
  }

}
