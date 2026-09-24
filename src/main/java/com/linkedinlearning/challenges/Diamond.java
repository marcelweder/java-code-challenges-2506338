package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Diamond {

  private final char START_LETTER = 'A';
  private char letter;
  private Boolean fullFilled;
  private String fillSymbol;

  public Diamond(char letter) {
    this(letter, false);
  }

  public Diamond(char letter, Boolean fullFilled) {
    this(letter, fullFilled, " ");
  }

  public Diamond(char letter, Boolean fullFilled, String fillSymbol) {
    this.letter = letter;
    this.fullFilled = fullFilled;
    this.fillSymbol = fillSymbol;
  }

  public String render() {

    List<String> mainRows = this.createRows();
    List<String> mirroredRows = this.mirrorRows(mainRows);

    mainRows.addAll(mirroredRows);

    return String.join(System.lineSeparator(), mainRows);
  }

  private List<String> mirrorRows(List<String> rows) {
    ArrayList<String> mirroredRows = new ArrayList<String>(rows);

    Collections.reverse(mirroredRows);
    mirroredRows.remove(0);

    return mirroredRows;
  }

  private List<String> createRows() {

    List<String> rows = new ArrayList<String>();

    int numberOfLetters = this.letter - this.START_LETTER;

    for (int index = 0; index <= numberOfLetters; index++) {
      rows.add(this.createRow(index));
    }

    return rows;
  }

  private String createRow(int index) {
    char currentLetter = (char) (this.START_LETTER + index);

    int outerPaddingSize = letter - currentLetter;
    int innerPaddingSize = Math.max(index * 2 - 1, 0);

    String outerPadding = this.fillSymbol.repeat(outerPaddingSize);
    String innerPadding = this.fillSymbol.repeat(innerPaddingSize);

    String row = outerPadding + currentLetter;

    if (index > 0) {
      row += innerPadding + currentLetter;
    }

    if (this.fullFilled) {
      row += outerPadding;
    }

    return row;
  }

}
