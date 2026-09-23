package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VATCalculatorTest {

  @Test
  void testRenderInvoice() {

    var vatCalculator = new VATCalculator(0.19, "CHF");
    var price = 100.00;
    var expected = """
        Netto: 100.00CHF
        VAT (0.19): 19.00CHF
        Total: 119.00CHF""";
    var actual = vatCalculator.renderInvoice(price);

    Assertions.assertEquals(expected, actual);
    System.out.println(actual);
  }

}