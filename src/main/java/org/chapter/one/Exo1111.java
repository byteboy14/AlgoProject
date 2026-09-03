package org.chapter.one;

public class Exo1111 {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    Boolean[][] table = {
        { true, true, false },
        { false, true, false },
        { false, true, true },
    };
    for (Boolean[] rows : table) {
      for (Boolean col : rows) {
        System.out.println(" value " + BooleanConverter.getConvertedValueOf(col));
      }
    }
  }
}
