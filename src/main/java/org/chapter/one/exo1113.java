package org.chapter.one;

public class exo1113 {
  public static void main(String[] args) {
    Integer[][] table = {
        { 2, 1, 5 },
        { 5, 10, 0 },
    };

    System.out.println("table ");
    printTable(table);

    System.out.println("transposed");
    printTable(Transpose.getTransposedArrayFrom(table));
  }

  private static void printTable(Integer[][] table) {
    for (Integer[] rows : table) {
      for (Integer col : rows) {
        System.out.print(col + " ");
      }
      System.out.println("");
    }

  }

}
