package org.chapter.one;

public class Histogram {

  public static int[] hg(int[] entry, int mSize) {
    if (mSize == 0)
      return null;
    int[] result = new int[mSize];
    for (int i = 0; i < mSize; i++) {
      result[i] = getNumberOfValueIn(i, entry);
    }

    return result;

  }

  private static int getNumberOfValueIn(int ith, int[] entry) {
    int count = 0;
    for (int i = 0; i < entry.length; i++) {
      if (entry[i] == ith)
        count++;
    }
    return count;
  }
}
