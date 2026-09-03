package org.chapter.one;

public class Transpose<T> {
  private T[][] array;

  public Transpose(T[][] array) {
    this.array = array;
  }

  public Integer[][] getTransposedArrayFrom() {
    Integer[][] result = new Integer[array[0].length][array.length];

    return result;
  }
}
