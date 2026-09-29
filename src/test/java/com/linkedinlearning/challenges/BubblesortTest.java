package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubblesortTest {

  @Test
  void sortedArrayNoChange() {
    var array = new int[] { 1, 3, 4, 5, 8, 9 };
    BubbleSort.sortAsc(array);

    Assertions.assertArrayEquals(new int[] { 1, 3, 4, 5, 8, 9 }, array);
  }

  @Test
  void sortingAnyArray() {
    var array = new int[] { 5, 9, 1, 4, 2, 8 };
    BubbleSort.sortAsc(array);

    Assertions.assertArrayEquals(new int[] { 1, 2, 4, 5, 8, 9 }, array);
  }

}
