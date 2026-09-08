package org.chapter.one;

public class Logarithm {

  public static Integer lg(int n) {
    if (n == 0)
      return null;

    return naive_lg(n);
  }

  private static Integer naive_lg(int n) {
    int power = 1;
    int naive_result = 2;
    while (2 * naive_result <= n) {
      power++;
      naive_result = naive_result * 2;
    }

    return power;
  }
}
