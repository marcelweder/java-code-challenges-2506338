package com.linkedinlearning.challenges;

public class WordWrapper {

  private int maxLen;

  public WordWrapper(Integer maxLen) {
    this.maxLen = maxLen;
  }

  public String wrap(String text) {

    var textLen = text.length();

    if (textLen < this.maxLen) {
      return text;
    }

    var textWrapped = "";

    var beginIndex = 0;
    var endIndex = this.maxLen - 1;

    while (textLen >= this.maxLen) {

      textWrapped += text.substring(beginIndex, endIndex) + System.lineSeparator();

      beginIndex = endIndex;
      endIndex = beginIndex + this.maxLen - 1;

      textLen = text.length() - beginIndex;
    }

    if (textLen > 0) {
      textWrapped += text.substring(beginIndex);
    }

    return textWrapped;
  }

}
