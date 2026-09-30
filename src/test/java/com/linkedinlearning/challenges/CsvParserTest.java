package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CsvParserTest {

  @Test
  void testCsvParser() {
    CsvParser csvParser = new CsvParser();

    var turingData = csvParser.parse("src/test/resources/turing.csv");

    // System.out.println(turingData);

    Assertions.assertNull(turingData.get(1900));

    Assertions.assertEquals("Maurice Wilkes", turingData.get(1967));
    Assertions.assertEquals("John Hopcroft, Robert Tarjan", turingData.get(1986));
    Assertions.assertEquals("Edmund M. Clarke, E. Allen Emerson, Joseph Sifakis, Ralf Otze, Sepp Immel",
        turingData.get(2007));
  }

}
