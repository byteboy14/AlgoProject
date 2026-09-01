package org.chapter.one;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import junit.framework.TestCase;

public class BooleanConverterTest extends TestCase {

  @ParameterizedTest
  @CsvSource({ "true, *", "false , ' '" })
  public void testGetConvertedValueOf(boolean value, String expected) {
    assertEquals(expected, BooleanConverter.getConvertedValueOf(value));
  }
}
