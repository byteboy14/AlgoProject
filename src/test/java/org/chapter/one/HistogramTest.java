package org.chapter.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

class HistogramTest {
  int[] entry = { 1, 1, 1 };

  @Test
  void hg_expect_null() {
    assertNull(Histogram.hg(entry, 0));
  }

  @ParameterizedTest
  @CsvSource({ " 2 ", "5 ", "10 " })
  void hg_expect_m_entry(int m) {
    assertEquals(m, Histogram.hg(entry, m).length);
  }

  @ParameterizedTest
  @CsvSource({ "1,0,0" })
  @CsvSource({ "2,0,0", "2,1,3" })
  @CsvSource({ "3,0,0", "3,1,3", "3,2,0" })
  @CsvSource({ "4,0,0", "4,1,3", "4,2,0", "4,3,0" })
  void hg_expect_number_of_1_at_1th_entry(int m, int i, int expected) {
    int[] result = Histogram.hg(entry, m);
    assertEquals(expected, result[i]);
  }

  @Test
  void hg_expect_number_of_i_at_ith_entry() {
    int[] entry = { 0, 0, 1, 2, 2 };
    int[] result = Histogram.hg(entry, 3);

    assertEquals(2, result[0]);
    assertEquals(1, result[1]);
    assertEquals(2, result[2]);
  }

}
