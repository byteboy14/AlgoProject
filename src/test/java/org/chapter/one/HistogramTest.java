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
}
