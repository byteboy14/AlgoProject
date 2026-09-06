package org.chapter.one;

public class Transpose {
  private Integer[][] arrayTable;

  public Transpose(Integer[][] arrayTable) {
    this.arrayTable = arrayTable;
  }

  public Integer[][] getTransposedArrayFrom() {
    Integer[][] result = new Integer[arrayTable[0].length][arrayTable.length];
    for (int i = 0; i < arrayTable[0].length; i++) {
      for (int j = 0; j < arrayTable.length; j++) {
        result[i][j] = arrayTable[j][i];
      }
    }
    return result;
  }
}
