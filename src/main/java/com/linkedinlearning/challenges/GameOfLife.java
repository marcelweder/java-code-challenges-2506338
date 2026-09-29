package com.linkedinlearning.challenges;

public class GameOfLife {

  private boolean[][] field;

  public GameOfLife(boolean[][] field) {
    this.field = field;
  }

  public void develop() {
    boolean[][] newField = new boolean[field.length][field[0].length];

    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field[i].length; j++) {
        newField[i][j] = nextCellState(i, j);
      }
    }

    field = newField;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field[i].length; j++) {
        sb.append(field[i][j] ? "*" : ".");
      }
      sb.append(System.lineSeparator());
    }

    return sb.substring(0, sb.length() - 1).toString();
  }

  private boolean nextCellState(int i, int j) {
    boolean isAlive = field[i][j];
    int liveNeighbors = 0;

    for (int x = i - 1; x <= i + 1; x++) {
      for (int y = j - 1; y <= j + 1; y++) {
        if (x == i && y == j) {
          continue;
        }
        if (x < 0 || x >= field.length || y < 0 || y >= field[0].length) {
          continue;
        }
        if (field[x][y]) {
          liveNeighbors++;
        }
      }
    }

    if (isAlive && (liveNeighbors == 2 || liveNeighbors == 3)) {
      // Any live cell with two or three live neighbours survives.
      return true;
    } else if (!isAlive && liveNeighbors == 3) {
      // Any dead cell with exactly three live neighbours becomes a live cell, as if
      // by reproduction.
      return true;
    } else {
      return false;
    }

  }

}
