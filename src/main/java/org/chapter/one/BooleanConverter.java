package org.chapter.one;

public class BooleanConverter {

  public static String getConvertedValueOf(boolean value) {
    if (!value)
      return " ";
    return "*";
  }
}
