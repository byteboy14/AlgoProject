package org.chapter.one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransposeTest {

  @Test
  public void testGetTransposedArrayFrom_expect_content_transposed() {

    Integer[][] table = {
        { 1, 2, 3 },
        { 4, 5, 6 },
    };

    Integer[][] result = new Transpose(table).getTransposedArrayFrom();

    Assertions.assertEquals(1, result[0][0].intValue());
    assertEquals(4, result[0][1].intValue());

    assertEquals(2, result[1][0].intValue());
    assertEquals(5, result[1][1].intValue());

    assertEquals(3, result[2][0].intValue());
    assertEquals(6, result[2][1].intValue());

  }

  @Test
  public void testGetTransposedArrayFrom_expect_dimension_inverted() {
    Integer[][] table = {
        { 1, 2, 3 },
        { 4, 5, 6 },
    };

    Integer[][] result = new Transpose(table).getTransposedArrayFrom();

    assertEquals(3, result.length);
    assertEquals(2, result[0].length);

  }

  @Test
  public void testBaseTableOperation() {
    int[][] table = {
        { 1, 2, 3 },
        { 4, 5, 6 },
    };

    assertEquals(2, table.length);
    assertEquals(3, table[0].length);
  }
}
