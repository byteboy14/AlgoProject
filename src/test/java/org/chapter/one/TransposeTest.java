package org.chapter.one;

import junit.framework.TestCase;

public class TransposeTest extends TestCase {

  public void testGetTransposedArrayFrom_expect_content_transposed() {

  }

  public void testGetTransposedArrayFrom_expect_dimention_inverted() {
    Integer[][] table = {
        { 1, 2, 3 },
        { 4, 5, 6 },
    };

    Integer[][] result = new Transpose<Integer>(table).getTransposedArrayFrom();

    assertEquals(3, result.length);
    assertEquals(2, result[0].length);

  }

  public void testBaseTableOperation() {
    int[][] table = {
        { 1, 2, 3 },
        { 4, 5, 6 },
    };

    assertEquals(2, table.length);
    assertEquals(3, table[0].length);
  }
}
