package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameOfLifeTest {

  /*
   * Die Regeln für Zellen lauten wie folgt:
   * - Eine tote Zelle mit genau drei lebenden Nachbarn wird geboren;
   * - eine lebende Zelle mit weniger als zwei lebenden Nachbarn stirbt;
   * - eine lebende Zelle mit zwei oder drei lebenden Nachbarn bleibt lebendig;
   * - eine lebende Zelle mit mehr als drei lebenden Nachbarn stirbt ebenfalls:
   */

  @Test
  void singleCellDies() {
    boolean[][] field = new boolean[][] {
        { false, false, false },
        { false, true, false },
        { false, false, false }
    };
    GameOfLife game = new GameOfLife(field);

    game.develop();
    Assertions.assertEquals("""
        ...
        ...
        ...""", game.toString());
  }

  @Test
  void blinkerOscillates() {

    boolean[][] field = new boolean[][] {
        { false, false, false, false, false },
        { false, false, false, false, false },
        { false, true, true, true, false },
        { false, false, false, false, false },
        { false, false, false, false, false }
    };
    GameOfLife game = new GameOfLife(field);

    Assertions.assertEquals("""
        .....
        .....
        .***.
        .....
        .....""", game.toString());

    game.develop();
    Assertions.assertEquals("""
        .....
        ..*..
        ..*..
        ..*..
        .....""", game.toString());

    game.develop();
    Assertions.assertEquals("""
        .....
        .....
        .***.
        .....
        .....""", game.toString());
  }

}
