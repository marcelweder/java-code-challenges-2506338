package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiamondTest {

  @Test
  void aDiamond() {
    var expected = """
        A""";

    var result = new Diamond('A').render();

    Assertions.assertEquals(expected, result);
  }

  @Test
  void eDiamond() {
    var expected = """
            A
           B B
          C   C
         D     D
        E       E
         D     D
          C   C
           B B
            A""";

    var result = new Diamond('E').render();

    Assertions.assertEquals(expected, result);
  }

  @Test
  void filledSymbolDiamond() {
    var expected = """
        ....A....
        ...B.B...
        ..C...C..
        .D.....D.
        E.......E
        .D.....D.
        ..C...C..
        ...B.B...
        ....A....""";

    var result = new Diamond('E', true, ".").render();

    Assertions.assertEquals(expected, result);
  }

}
