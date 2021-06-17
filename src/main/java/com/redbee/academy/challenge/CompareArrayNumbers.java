package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List<Integer> c = new ArrayList<>();

    int maxIndex = Math.min(a.size(), b.size());

    if (a.size() >= b.size()) {
      c.addAll(a);
    } else {
      c.addAll(b);
    }

    for (int i = 0; i < maxIndex; i++){
      c.set(i, Math.max(a.get(i), b.get(i)));
    }

    return c;
  }



}
