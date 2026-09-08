package org.chapter.one;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions;

class LogarithmTest {

  @Test
  void lg_0_expect_null() {
    Assertions.assertNull(Logarithm.lg(0));
  }

  @ParameterizedTest
  @CsvSource({ "2, 1", "4, 2", "8, 3", "16, 4", "32, 5", "1024 , 10" })
  void lg_2_expect_one(int input, int expected) {
    Assertions.assertEquals(expected, Logarithm.lg(input));
  }

}
