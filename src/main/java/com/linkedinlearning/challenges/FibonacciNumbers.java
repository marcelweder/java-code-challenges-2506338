package com.linkedinlearning.challenges;

public class FibonacciNumbers {

  public int fibonacci(int number) {
    return this.fibonacciRecursive(number);
  }

  private int fibonacciRecursive(int number) {
    if (number <= 1) {
      return number;
    }
    return (int) this.fibonacciRecursive(number - 1) + this.fibonacciRecursive(number - 2);
  }

}
