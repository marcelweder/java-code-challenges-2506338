package com.linkedinlearning.challenges;

public class PalindromeChecker {

  public boolean isPalindrome(String value) {
    var cleaned = value.toLowerCase().replaceAll("[\\s\\.]", "");
    var reversed = new StringBuilder(cleaned).reverse().toString();

    // System.out.println(cleaned);
    // System.out.println(reversed);

    return cleaned.equals(reversed);
  }

}
